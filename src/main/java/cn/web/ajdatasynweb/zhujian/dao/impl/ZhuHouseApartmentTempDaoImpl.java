package cn.web.ajdatasynweb.zhujian.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.entity.HouseApartmentTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseApartmentTempDao; 
import cn.web.ajdatasynweb.zhujian.mapper.ZhuHouseApartmentTempMapper;

@Repository
public class ZhuHouseApartmentTempDaoImpl implements ZhuHouseApartmentTempDao{
	@Autowired
	private ZhuHouseApartmentTempMapper zhuHouseApartmentTempMapper;
	
	@Override
	public int insertHouseApartmentTemp(HouseApartmentTemp houseApartmentTemp) {
		return zhuHouseApartmentTempMapper.insertHouseApartmentTemp(houseApartmentTemp);
	}

}
