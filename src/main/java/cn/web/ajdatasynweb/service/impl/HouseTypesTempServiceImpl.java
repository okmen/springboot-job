package cn.web.ajdatasynweb.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseTypesTempDao;
import cn.web.ajdatasynweb.entity.HouseTypesTemp;
import cn.web.ajdatasynweb.service.HouseTypesTempService;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseTypesTempDao;

@Service("houseTypesTempService")
public class HouseTypesTempServiceImpl implements HouseTypesTempService{
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseTypesTempDao zhuHouseTypesTempDao;
	@Autowired
	private ChuHouseTypesTempDao chuHouseTypesTempDao;
	
	@Override
	public boolean insertQueryHouseTypesTemp() {
		boolean flag=false;
		try {
			long start=System.currentTimeMillis(); 
			logger.info("insertQueryHouseTypesTemp  初道数据库查询开始" );
			List<HouseTypesTemp> li=chuHouseTypesTempDao.queryHouseTypesTempAll();
			int sum=0; //记录添加数据总数
			int delete=0;//记录初道删除了多少数据
			int size= (li == null)?0:li.size();
			logger.info("insertQueryHouseTypesTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
			for(HouseTypesTemp  temp:li){
				int a=zhuHouseTypesTempDao.insertHouseTypesTemp(temp);
				if(a == 1){
					int b =chuHouseTypesTempDao.deleteHouseTypesTempById(temp);
					delete+=b;
				}
				sum +=a;
			}
			logger.info("insertQueryHouseTypesTemp  住建局共添加了----------   "+sum+"   -----条数据" ); 
			logger.info("insertQueryHouseTypesTemp  初道共删除了----------   "+delete+"   -----条数据" ); 
			if(sum == size){
				flag=true;
			}
			logger.info("insertQueryHouseTypesTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) {
			logger.info("insertQueryHouseTypesTemp 异常："+e);
		}
		return flag;
	}

}
