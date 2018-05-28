package cn.web.ajdatasynweb.zhujian.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.entity.HouseCentralizationTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseCentralizationTempDao; 
import cn.web.ajdatasynweb.zhujian.mapper.ZhuHouseCentralizationTempMapper;

@Repository
public class ZhuHouseCentralizationTempDaoImpl implements ZhuHouseCentralizationTempDao{

	@Autowired
	private ZhuHouseCentralizationTempMapper zhuHouseCentralizationTempMapper;
	
	@Override
	public int insertHouseCentralizationTemp(HouseCentralizationTemp houseCentralizationTemp) {
		return zhuHouseCentralizationTempMapper.insertHouseCentralizationTemp(houseCentralizationTemp);
	}

}
