package cn.web.ajdatasynweb.chudao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.chudao.dao.ChuHouseTypesRoomTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuHouseTypesRoomTempMapper;
import cn.web.ajdatasynweb.entity.HouseTypesRoomTemp;

@Repository
public class ChuHouseTypesRoomTempDaoImpl implements ChuHouseTypesRoomTempDao{
	@Autowired
	private ChuHouseTypesRoomTempMapper chuHouseTypesRoomTempMapper;
	
	@Override
	public List<HouseTypesRoomTemp> queryHouseTypesRoomTempAll() {
		return chuHouseTypesRoomTempMapper.queryHouseTypesRoomTempAll();
	}

	@Override
	public int queryHouseTypesRoomTempTotal() {
		return chuHouseTypesRoomTempMapper.queryHouseTypesRoomTempTotal();
	}

	@Override
	public int deleteHouseTypesRoomTempById(HouseTypesRoomTemp houseTypesRoomTemp) {
		return chuHouseTypesRoomTempMapper.deleteHouseTypesRoomTempById(houseTypesRoomTemp);
	}

}
