package cn.web.ajdatasynweb.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.web.ajdatasynweb.chudao.dao.ChuSysRegisterTempDao;
import cn.web.ajdatasynweb.entity.SysRegisterTemp;
import cn.web.ajdatasynweb.service.SysRegisterTempService;
import cn.web.ajdatasynweb.zhujian.dao.ZhuSysRegisterTempDao;
@Service("sysRegisterTempService")
public class SysRegisterTempServiceImpl implements SysRegisterTempService{
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired 
	private ZhuSysRegisterTempDao zhuSysRegisterTempDao;
	@Autowired 
	private ChuSysRegisterTempDao chuSysRegisterTempDao;
	
	@Override
	public boolean insertQuerySysRegisterTemp() {
		boolean flag=false;
		try {
			long start=System.currentTimeMillis(); 
			logger.info("insertQuerySysRegisterTemp  初道数据库查询开始" );
			List<SysRegisterTemp> li=chuSysRegisterTempDao.querySysRegisterTempAll();
			int sum=0;//记录添加数据总数
			int size= (li == null)?0:li.size();
			int delete=0;//记录初道删除了多少数据
			logger.info("insertQuerySysRegisterTemp  初道数据库查询结束  共有-----   "+size+"   ----条数据" );
			for(SysRegisterTemp  temp:li){
				int a=zhuSysRegisterTempDao.insertSysRegisterTemp(temp);
				if(a == 1){
					int b=chuSysRegisterTempDao.deleteSysRegisterTempById(temp);
					delete+=b;
				}
				sum +=a;
			}
			logger.info("insertQuerySysRegisterTemp  住建局共添加了----------   "+sum+"   -----条数据" ); 
			logger.info("insertQuerySysRegisterTemp  初道共删除了----------   "+delete+"   -----条数据" ); 
			if(sum == size){
				flag=true;
			}
			logger.info("insertQuerySysRegisterTemp 总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) {
			logger.info("insertQuerySysRegisterTemp 异常："+e);
		}
		return flag;
	}

}
