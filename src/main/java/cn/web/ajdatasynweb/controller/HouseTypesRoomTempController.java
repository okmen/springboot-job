package cn.web.ajdatasynweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseTypesRoomTempDao; 
import cn.web.ajdatasynweb.entity.HouseTypesRoomTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseTypesRoomTempDao;  

@RestController
public class HouseTypesRoomTempController {
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	@Autowired
	private ZhuHouseTypesRoomTempDao zhuHouseTypesRoomTempDao;
	
	@Autowired
	private ChuHouseTypesRoomTempDao chuHouseTypesRoomTempDao;
	
	@RequestMapping("/insertHouseTypesRoomTemp.html")
	public boolean insertHouseTypesRoomTemp(){ 
		long start=System.currentTimeMillis();
		logger.info("insertHouseTypesRoomTemp  初道数据库查询开始" );
		List<HouseTypesRoomTemp> li=chuHouseTypesRoomTempDao.queryHouseTypesRoomTempAll();
		int sum=0;
		boolean flag=false;
		int size= (li == null)?0:li.size();
		logger.info("insertHouseTypesRoomTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
		for(HouseTypesRoomTemp  temp:li){
			int a=zhuHouseTypesRoomTempDao.insertHouseTypesRoomTemp(temp);
			sum +=a;
		}
		logger.info("insertHouseTypesRoomTemp  共添加了----------   "+sum+"   -----条数据" ); 
		if(sum == size){
			flag=true;
		}
		logger.info("insertHouseTypesRoomTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		return flag;
	}
}
