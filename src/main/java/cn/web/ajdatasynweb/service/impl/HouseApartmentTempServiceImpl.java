package cn.web.ajdatasynweb.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseApartmentTempDao;
import cn.web.ajdatasynweb.entity.HouseApartmentTemp;
import cn.web.ajdatasynweb.service.HouseApartmentTempService;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseApartmentTempDao;
@Service("houseApartmentTempService")
public class HouseApartmentTempServiceImpl implements HouseApartmentTempService{

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseApartmentTempDao zhuHouseApartmentTempDao;
	
	@Autowired
	private ChuHouseApartmentTempDao chuHouseApartmentTempDao;
	@Override
	public boolean insertQueryHouseApartmentTemp() {
		boolean flag=false;
		try {
			long start=System.currentTimeMillis();   
			logger.info("insertQueryHouseApartmentTemp  初道数据库查询开始" );
			List<HouseApartmentTemp> li=chuHouseApartmentTempDao.queryHouseApartmentTempAll();
			int sum=0; //记录添加数据总数
			int delete=0;//记录初道删除了多少数据
			int size= (li == null)?0:li.size();
			logger.info("insertQueryHouseApartmentTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
			for(HouseApartmentTemp  temp:li){
				int a=zhuHouseApartmentTempDao.insertHouseApartmentTemp(temp);
				if(a == 1){
					int b=chuHouseApartmentTempDao.deleteHouseApartmentTempById(temp);
					delete+=b;
				}
				sum +=a;
			}
			logger.info("insertQueryHouseApartmentTemp  住建局共添加了----------   "+sum+"   -----条数据" ); 
			logger.info("insertQueryHouseApartmentTemp  初道共删除了----------   "+delete+"   -----条数据" );
			if(sum == size){
				flag=true;
			}
			logger.info("insertQueryHouseApartmentTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) {
			logger.info("insertQueryHouseApartmentTemp 异常："+e);
		}
		return flag;
	}

}
