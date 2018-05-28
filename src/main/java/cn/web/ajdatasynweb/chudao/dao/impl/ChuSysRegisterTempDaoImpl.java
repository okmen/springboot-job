package cn.web.ajdatasynweb.chudao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.chudao.dao.ChuSysRegisterTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuSysRegisterTempMapper;
import cn.web.ajdatasynweb.entity.SysRegisterTemp;
@Repository
public class ChuSysRegisterTempDaoImpl implements ChuSysRegisterTempDao{

	@Autowired  
	@Qualifier("chuSysRegisterTempMapper")
    private ChuSysRegisterTempMapper chuSysRegisterTempMapper;  
	
	@Override
	public SysRegisterTemp selectSysRegisterTempByPrimaryKey(Integer id) {
		return chuSysRegisterTempMapper.selectSysRegisterTempByPrimaryKey(id);
	}

	@Override
	public List<SysRegisterTemp> querySysRegisterTempAll() {
		return chuSysRegisterTempMapper.querySysRegisterTempAll();
	}

	@Override
	public int querySysRegisterTempTotal() {
		return chuSysRegisterTempMapper.querySysRegisterTempTotal();
	}

	@Override
	public int deleteSysRegisterTempById(SysRegisterTemp sysRegisterTemp) {
		return chuSysRegisterTempMapper.deleteSysRegisterTempById(sysRegisterTemp);
	}

}
