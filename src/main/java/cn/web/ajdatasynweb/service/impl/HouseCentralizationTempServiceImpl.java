package cn.web.ajdatasynweb.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.web.ajdatasynweb.chudao.dao.ChuHouseCentralizationTempDao;
import cn.web.ajdatasynweb.entity.HouseCentralizationTemp;
import cn.web.ajdatasynweb.service.HouseCentralizationTempService;
import cn.web.ajdatasynweb.zhujian.dao.ZhuHouseCentralizationTempDao;
@Service("houseCentralizationTempService")
public class HouseCentralizationTempServiceImpl implements HouseCentralizationTempService{
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private ZhuHouseCentralizationTempDao zhuHouseCentralizationTempDao;
	
	@Autowired
	private ChuHouseCentralizationTempDao chuHouseCentralizationTempDao;
	
	@Override
	public boolean insertQueryHouseCentralizationTemp() {
		boolean flag=false;
		try {
			long start=System.currentTimeMillis(); 
			logger.info("insertQueryHouseCentralizationTemp  初道数据库查询开始" );
			List<HouseCentralizationTemp> li=chuHouseCentralizationTempDao.queryHouseCentralizationTempAll();
			int sum=0; //记录添加数据总数
			int delete=0;//记录初道删除了多少数据
			int size= (li == null)?0:li.size();
			logger.info("insertQueryHouseCentralizationTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
			for(HouseCentralizationTemp  temp:li){
				int a=zhuHouseCentralizationTempDao.insertHouseCentralizationTemp(temp);
				if(a == 1){
					int b=chuHouseCentralizationTempDao.deleteHouseCentralizationTempById(temp);
					delete+=b;
				}
				sum +=a;
			}
			logger.info("insertQueryHouseCentralizationTemp  住建局共添加了----------   "+sum+"   -----条数据" ); 
			logger.info("insertQueryHouseCentralizationTemp  初道共删除了----------   "+delete+"   -----条数据" ); 
			if(sum == size){
				flag=true;
			}
			logger.info("insertQueryHouseCentralizationTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) {
			logger.info("insertQueryHouseCentralizationTemp 异常："+e);
		}
		return flag;
	}

}
