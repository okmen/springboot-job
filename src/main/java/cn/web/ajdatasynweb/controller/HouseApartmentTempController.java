package cn.web.ajdatasynweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseApartmentTempDao; 
import cn.web.ajdatasynweb.entity.HouseApartmentTemp;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseApartmentTempDao; 

@RestController
public class HouseApartmentTempController {
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseApartmentTempDao zhuHouseApartmentTempDao;
	
	@Autowired
	private ChuHouseApartmentTempDao chuHouseApartmentTempDao;
	
	@RequestMapping("/insertHouseApartmentTemp.html")
	public boolean insertHouseApartmentTemp(){
		long start=System.currentTimeMillis();
		logger.info("insertHouseApartmentTemp");  
		logger.info("insertHouseApartmentTemp  初道数据库查询开始" );
		List<HouseApartmentTemp> li=chuHouseApartmentTempDao.queryHouseApartmentTempAll();
		int sum=0;
		boolean flag=false;
		int size= (li == null)?0:li.size();
		logger.info("insertHouseApartmentTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
		for(HouseApartmentTemp  temp:li){
			int a=zhuHouseApartmentTempDao.insertHouseApartmentTemp(temp);
			sum +=a;
		}
		logger.info("insertHouseApartmentTemp  共添加了----------   "+sum+"   -----条数据" ); 
		if(sum == size){
			flag=true;
		}
		logger.info("insertHouseApartmentTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		return flag;
	}
}
