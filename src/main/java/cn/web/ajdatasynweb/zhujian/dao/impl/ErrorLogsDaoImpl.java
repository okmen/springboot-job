package cn.web.ajdatasynweb.zhujian.dao.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.web.ajdatasynweb.entity.Errorlogs;
import cn.web.ajdatasynweb.enums.ErrorType;
import cn.web.ajdatasynweb.zhujian.dao.ErrorLogDao;
import cn.web.ajdatasynweb.zhujian.mapper.ZhuApartmentRoomTempMapper;

@Repository
public class ErrorLogsDaoImpl implements ErrorLogDao {
	@Autowired
	private ZhuApartmentRoomTempMapper zhuApartmentRoomTempMapper;
	
	@Override
	public int addLog(String className,String msg ,ErrorType type){
		Errorlogs mod=new Errorlogs();
		mod.setClassName(className);
		mod.setLogType(type.name());
		mod.setMsg(msg);
		mod.setCreateTime(new Date());
		return zhuApartmentRoomTempMapper.addLogs(mod); 
	 }
}
