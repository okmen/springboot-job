package cn.web.ajdatasynweb.chudao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.chudao.dao.ChuHouseCentralizationTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuHouseCentralizationTempMapper;
import cn.web.ajdatasynweb.entity.HouseCentralizationTemp;

@Repository
public class ChuHouseCentralizationTempDaoImpl implements ChuHouseCentralizationTempDao{
	@Autowired
	private ChuHouseCentralizationTempMapper chuHouseCentralizationTempMapper;

	@Override
	public List<HouseCentralizationTemp> queryHouseCentralizationTempAll() {
		return chuHouseCentralizationTempMapper.queryHouseCentralizationTempAll();
	}

	@Override
	public int queryHouseCentralizationTempTotal() {
		return chuHouseCentralizationTempMapper.queryHouseCentralizationTempTotal();
	}

	@Override
	public int deleteHouseCentralizationTempById(HouseCentralizationTemp houseCentralizationTemp) {
		return chuHouseCentralizationTempMapper.deleteHouseCentralizationTempById(houseCentralizationTemp);
	}
}
