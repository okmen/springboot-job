package cn.web.ajdatasynweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.web.ajdatasynweb.chudao.dao.ChuApartmentRoomTempDao; 
import cn.web.ajdatasynweb.entity.ApartmentRoomTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuApartmentRoomTempDao;  

@RestController
public class ApartmentRoomTempController {
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuApartmentRoomTempDao zhuApartmentRoomTempDao;
	
	@Autowired
	private ChuApartmentRoomTempDao chuApartmentRoomTempDao;
	
	@RequestMapping("/insertApartmentRoomTemp.html")
	public boolean insertApartmentRoomTemp(){
		long start=System.currentTimeMillis();
		logger.info("insertApartmentRoomTemp");  
		logger.info("insertApartmentRoomTemp  初道数据库查询开始" );
		List<ApartmentRoomTemp> li=chuApartmentRoomTempDao.queryApartmentRoomTempAll();
		int sum=0;
		boolean flag=false;
		int size= (li == null)?0:li.size();
		logger.info("insertApartmentRoomTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
		for(ApartmentRoomTemp  temp:li){
			int a=zhuApartmentRoomTempDao.insertApartmentRoomTemp(temp);
			sum +=a;
		}
		logger.info("insertApartmentRoomTemp  共添加了----------   "+sum+"   -----条数据" ); 
		if(sum == size){
			flag=true;
		}
		logger.info("insertApartmentRoomTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		return flag;
	}
}
