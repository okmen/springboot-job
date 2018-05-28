package cn.web.ajdatasynweb.chudao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.chudao.dao.ChuHouseApartmentTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuHouseApartmentTempMapper;
import cn.web.ajdatasynweb.entity.HouseApartmentTemp;

@Repository
public class ChuHouseApartmentTempDaoImpl implements ChuHouseApartmentTempDao {
	@Autowired
	private ChuHouseApartmentTempMapper chuHouseApartmentTempMapper;
	@Override
	public List<HouseApartmentTemp> queryHouseApartmentTempAll() {
		return chuHouseApartmentTempMapper.queryHouseApartmentTempAll();
	}

	@Override
	public int queryHouseApartmentTempTotal() {
		return chuHouseApartmentTempMapper.queryHouseApartmentTempTotal();
	}

	@Override
	public int deleteHouseApartmentTempById(HouseApartmentTemp houseApartmentTemp) {
		return chuHouseApartmentTempMapper.deleteHouseApartmentTempById(houseApartmentTemp);
	}

}
