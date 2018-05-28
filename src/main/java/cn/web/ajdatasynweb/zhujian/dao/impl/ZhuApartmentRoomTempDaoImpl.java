package cn.web.ajdatasynweb.zhujian.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.entity.ApartmentRoomTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuApartmentRoomTempDao; 
import cn.web.ajdatasynweb.zhujian.mapper.ZhuApartmentRoomTempMapper;

@Repository
public class ZhuApartmentRoomTempDaoImpl implements ZhuApartmentRoomTempDao{
	@Autowired
	private ZhuApartmentRoomTempMapper zhuApartmentRoomTempMapper;
	
	@Override
	public int insertApartmentRoomTemp(ApartmentRoomTemp apartmentRoomTemp) {
		return zhuApartmentRoomTempMapper.insertApartmentRoomTemp(apartmentRoomTemp);
	}

}
