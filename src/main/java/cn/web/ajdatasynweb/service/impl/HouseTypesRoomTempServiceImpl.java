package cn.web.ajdatasynweb.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseTypesRoomTempDao;
import cn.web.ajdatasynweb.entity.HouseTypesRoomTemp;
import cn.web.ajdatasynweb.service.HouseTypesRoomTempService;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseTypesRoomTempDao;
@Service("houseTypesRoomTempService")
public class HouseTypesRoomTempServiceImpl implements HouseTypesRoomTempService{
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseTypesRoomTempDao zhuHouseTypesRoomTempDao;
	@Autowired
	private ChuHouseTypesRoomTempDao chuHouseTypesRoomTempDao;
	
	@Override
	public boolean insertQueryHouseTypesRoomTemp() {
		boolean flag=false;
		try {
			long start=System.currentTimeMillis();
			logger.info("insertQueryHouseTypesRoomTemp  初道数据库查询开始" );
			List<HouseTypesRoomTemp> li=chuHouseTypesRoomTempDao.queryHouseTypesRoomTempAll();
			int sum=0; //记录添加数据总数
			int delete=0;//记录初道删除了多少数据
			int size= (li == null)?0:li.size();
			logger.info("insertQueryHouseTypesRoomTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
			for(HouseTypesRoomTemp  temp:li){
				int a=zhuHouseTypesRoomTempDao.insertHouseTypesRoomTemp(temp);
				if(a == 1){
					int b=chuHouseTypesRoomTempDao.deleteHouseTypesRoomTempById(temp);
					delete+=b;
				}
				sum +=a;
			}
			logger.info("insertQueryHouseTypesRoomTemp  住建局共添加了----------   "+sum+"   -----条数据" ); 
			logger.info("insertQueryHouseTypesRoomTemp  初道共删除了----------   "+delete+"   -----条数据" ); 
			if(sum == size){
				flag=true;
			}
			logger.info("insertQueryHouseTypesRoomTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) {
			logger.info("insertQueryHouseTypesRoomTemp 异常："+e);
		}
		return flag;
	}

}
