package cn.web.ajdatasynweb.zhujian.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository; 

import cn.web.ajdatasynweb.entity.SysRegisterTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuSysRegisterTempDao; 
import cn.web.ajdatasynweb.zhujian.mapper.ZhuSysRegisterTempMapper;  
@Repository
public class ZhuSysRegisterTempDaoImpl implements ZhuSysRegisterTempDao{

	@Autowired  
	@Qualifier("zhuSysRegisterTempMapper")
    private ZhuSysRegisterTempMapper zhuSysRegisterTempMapper;  
	
	@Override
	public SysRegisterTemp selectSysRegisterTempByPrimaryKey(Integer id) {
		return zhuSysRegisterTempMapper.selectSysRegisterTempByPrimaryKey(id);
	}

	@Override
	public List<SysRegisterTemp> querySysRegisterTempAll() {
		return zhuSysRegisterTempMapper.querySysRegisterTempAll();
	}

	@Override
	public int querySysRegisterTempTotal() {
		return zhuSysRegisterTempMapper.querySysRegisterTempTotal();
	}

	@Override
	public int insertSysRegisterTemp(SysRegisterTemp sysRegisterTemp) {
		return zhuSysRegisterTempMapper.insertSysRegisterTemp(sysRegisterTemp);
	}

}
