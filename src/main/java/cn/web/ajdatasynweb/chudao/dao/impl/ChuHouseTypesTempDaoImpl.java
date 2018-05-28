package cn.web.ajdatasynweb.chudao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.chudao.dao.ChuHouseTypesTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuHouseTypesTempMapper;
import cn.web.ajdatasynweb.entity.HouseTypesTemp;
@Repository
public class ChuHouseTypesTempDaoImpl implements ChuHouseTypesTempDao{
	
	@Autowired
	private ChuHouseTypesTempMapper chuHouseTypesTempMapper;
	
	@Override
	public List<HouseTypesTemp> queryHouseTypesTempAll() {
		return chuHouseTypesTempMapper.queryHouseTypesTempAll();
	}

	@Override
	public int queryHouseTypesTempTotal() {
		return chuHouseTypesTempMapper.queryHouseTypesTempTotal();
	}

	@Override
	public int deleteHouseTypesTempById(HouseTypesTemp houseTypesTemp) {
		return chuHouseTypesTempMapper.deleteHouseTypesTempById(houseTypesTemp);
	}
	
}
