package cn.web.ajdatasynweb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.web.ajdatasynweb.chudao.dao.ChuSysRegisterTempDao; 
import cn.web.ajdatasynweb.entity.SysRegisterTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuSysRegisterTempDao; 

@RestController
public class SysRegisterTempController {
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired 
	private ZhuSysRegisterTempDao zhuSysRegisterTempDao;
	
	@Autowired 
	private ChuSysRegisterTempDao chuSysRegisterTempDao;
	
	@RequestMapping("/sysRegisterTemp.html")
	public Map<String,Object> checkSysRegisterTemp(String name){
		logger.info("checkSysRegisterTemp"+ name);
		System.out.println("-------------------"+name);
		Map<String,Object> map=new HashMap<String,Object>();
		logger.info("checkSysRegisterTemp  初道数据库查询开始" );
		List<SysRegisterTemp> li=chuSysRegisterTempDao.querySysRegisterTempAll();
		for(SysRegisterTemp  temp:li){
			System.out.println("li"+temp);
		}
		logger.info("checkSysRegisterTemp  初道数据库查询结束" );
		logger.info("checkSysRegisterTemp  住建局数据库查询开始" );
		List<SysRegisterTemp> list=zhuSysRegisterTempDao.querySysRegisterTempAll();
		for(SysRegisterTemp  temp:list){
			System.out.println("list"+temp); 
		}
		logger.info("checkSysRegisterTemp  住建局数据库查询结束" );
		map.put("list", list);
		map.put("li", li);
		map.put("name", name);
		return map;
	}
	
	
	@RequestMapping("/insertSysRegisterTemp.html")
	public boolean insertSysRegisterTemp(){
		long start=System.currentTimeMillis();
		logger.info("insertSysRegisterTemp");  
		logger.info("insertSysRegisterTemp  初道数据库查询开始" );
		List<SysRegisterTemp> li=chuSysRegisterTempDao.querySysRegisterTempAll();
		int sum=0;
		boolean flag=false;
		int size= (li == null)?0:li.size();
		logger.info("insertSysRegisterTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
		for(SysRegisterTemp  temp:li){
			int a=zhuSysRegisterTempDao.insertSysRegisterTemp(temp);
			sum +=a;
		}
		logger.info("insertSysRegisterTemp  共添加了----------   "+sum+"   -----条数据" ); 
		if(sum == size){
			flag=true;
		}
		logger.info("insertSysRegisterTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		return flag;
	}
}














