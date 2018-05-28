package cn.web.ajdatasynweb.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.web.ajdatasynweb.chudao.dao.ChuApartmentRoomTempDao;
import cn.web.ajdatasynweb.entity.ApartmentRoomTemp;
import cn.web.ajdatasynweb.service.ApartmentRoomTempService;
import cn.web.ajdatasynweb.zhujian.dao.ZhuApartmentRoomTempDao;
@Service("apartmentRoomTempService")
public class ApartmentRoomTempServiceImpl implements ApartmentRoomTempService{
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	@Autowired
	private ZhuApartmentRoomTempDao zhuApartmentRoomTempDao;
	
	@Autowired
	private ChuApartmentRoomTempDao chuApartmentRoomTempDao;
	
	@Override
	public boolean insertQueryApartmentRoomTemp(){ 
		boolean flag=false;
		try {
			long start=System.currentTimeMillis();  
			logger.info("insertQueryApartmentRoomTemp  初道数据库查询开始" );
			List<ApartmentRoomTemp> li=chuApartmentRoomTempDao.queryApartmentRoomTempAll();
			int sum=0; //用来记录添加了多少条数据
			int delete=0;//用来记录删除了多少条数据
			int size= (li == null)?0:li.size();
			logger.info("insertQueryApartmentRoomTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
			for(ApartmentRoomTemp  temp:li){
				int a=zhuApartmentRoomTempDao.insertApartmentRoomTemp(temp);
				//当添加成功后，将初道数据库中的这条数据删除
				if(a == 1){
					int b=chuApartmentRoomTempDao.deleteApartmentRoomTempById(temp);
					delete+=b;
				}
				sum +=a;
			}
			logger.info("insertQueryApartmentRoomTemp  住建局共添加了----------   "+sum+"   -----条数据" ); 
			logger.info("insertQueryApartmentRoomTemp  初道共删除了----------   "+delete+"   -----条数据" );
			if(sum == size){
				flag=true;
			}
			logger.info("insertQueryApartmentRoomTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) { 
			logger.info("insertQueryApartmentRoomTemp 异常:  "+e);
		}
		return flag;
	}

}
