package cn.web.ajdatasynweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseTypesTempDao; 
import cn.web.ajdatasynweb.entity.HouseTypesTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseTypesTempDao; 

@RestController
public class HouseTypesTempController {
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseTypesTempDao zhuHouseTypesTempDao;
	
	@Autowired
	private ChuHouseTypesTempDao chuHouseTypesTempDao;
	
	@RequestMapping("/insertHouseTypesTemp.html")
	public boolean insertHouseTypesTemp(){
		long start=System.currentTimeMillis();
		logger.info("insertHouseTypesTemp");  
		logger.info("insertHouseTypesTemp  初道数据库查询开始" );
		List<HouseTypesTemp> li=chuHouseTypesTempDao.queryHouseTypesTempAll();
		int sum=0;
		boolean flag=false;
		int size= (li == null)?0:li.size();
		logger.info("insertHouseTypesTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
		for(HouseTypesTemp  temp:li){
			int a=zhuHouseTypesTempDao.insertHouseTypesTemp(temp);
			sum +=a;
		}
		logger.info("insertHouseTypesTemp  共添加了----------   "+sum+"   -----条数据" ); 
		if(sum == size){
			flag=true;
		}
		logger.info("insertHouseTypesTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		return flag;
	}
	
	
}
