package cn.web.ajdatasynweb.zhujian.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.entity.HouseTypesTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseTypesTempDao;
import cn.web.ajdatasynweb.zhujian.mapper.ZhuHouseTypesTempMapper;

@Repository
public class ZhuHouseTypesTempDaoImpl implements ZhuHouseTypesTempDao{
	@Autowired
	private ZhuHouseTypesTempMapper zhuHouseTypesTempMapper;
	
	@Override
	public int insertHouseTypesTemp(HouseTypesTemp houseTypesTemp) {
		return zhuHouseTypesTempMapper.insertHouseTypesTemp(houseTypesTemp);
	}

}
