package cn.web.ajdatasynweb.chudao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.chudao.dao.ChuApartmentRoomTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuApartmentRoomTempMapper;
import cn.web.ajdatasynweb.entity.ApartmentRoomTemp;

@Repository
public class ChuApartmentRoomTempDaoImpl implements ChuApartmentRoomTempDao{
	@Autowired
	private ChuApartmentRoomTempMapper chuApartmentRoomTempMapper;
	@Override
	public List<ApartmentRoomTemp> queryApartmentRoomTempAll() {
		return chuApartmentRoomTempMapper.queryApartmentRoomTempAll();
	}

	@Override
	public int queryApartmentRoomTempTotal() {
		return chuApartmentRoomTempMapper.queryApartmentRoomTempTotal();
	}

	@Override
	public int deleteApartmentRoomTempById(ApartmentRoomTemp apartmentRoomTemp) {
		return chuApartmentRoomTempMapper.deleteApartmentRoomTempById(apartmentRoomTemp);
	}

}
