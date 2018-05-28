package cn.web.ajdatasynweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseCentralizationTempDao; 
import cn.web.ajdatasynweb.entity.HouseCentralizationTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseCentralizationTempDao; 

@RestController
public class HouseCentralizationTempContreller {
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseCentralizationTempDao zhuHouseCentralizationTempDao;
	
	@Autowired
	private ChuHouseCentralizationTempDao chuHouseCentralizationTempDao;
	
	@RequestMapping("/insertHouseCentralizationTemp.html")
	public boolean insertHouseCentralizationTemp(){
		long start=System.currentTimeMillis();
		logger.info("insertHouseCentralizationTemp");  
		logger.info("insertHouseCentralizationTemp  初道数据库查询开始" );
		List<HouseCentralizationTemp> li=chuHouseCentralizationTempDao.queryHouseCentralizationTempAll();
		int sum=0;
		boolean flag=false;
		int size= (li == null)?0:li.size();
		logger.info("insertHouseCentralizationTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
		for(HouseCentralizationTemp  temp:li){
			int a=zhuHouseCentralizationTempDao.insertHouseCentralizationTemp(temp);
			sum +=a;
		}
		logger.info("insertHouseCentralizationTemp  共添加了----------   "+sum+"   -----条数据" ); 
		if(sum == size){
			flag=true;
		}
		logger.info("insertHouseCentralizationTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		return flag;
	}
}
