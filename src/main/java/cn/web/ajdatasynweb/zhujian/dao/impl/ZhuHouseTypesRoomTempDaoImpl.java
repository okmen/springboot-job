package cn.web.ajdatasynweb.zhujian.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.entity.HouseTypesRoomTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseTypesRoomTempDao; 
import cn.web.ajdatasynweb.zhujian.mapper.ZhuHouseTypesRoomTempMapper;

@Repository
public class ZhuHouseTypesRoomTempDaoImpl implements ZhuHouseTypesRoomTempDao {

	@Autowired
	private ZhuHouseTypesRoomTempMapper zhuHouseTypesRoomTempMapper;
	
	@Override
	public int insertHouseTypesRoomTemp(HouseTypesRoomTemp houseTypesRoomTemp) {
		return zhuHouseTypesRoomTempMapper.insertHouseTypesRoomTemp(houseTypesRoomTemp);
	}

}
