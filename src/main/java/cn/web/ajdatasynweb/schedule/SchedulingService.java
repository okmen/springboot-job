package cn.web.ajdatasynweb.schedule;
 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.web.ajdatasynweb.service.ApartmentRoomTempService;
import cn.web.ajdatasynweb.service.HouseApartmentTempService;
import cn.web.ajdatasynweb.service.HouseCentralizationTempService;
import cn.web.ajdatasynweb.service.HouseTypesRoomTempService;
import cn.web.ajdatasynweb.service.HouseTypesTempService;
import cn.web.ajdatasynweb.service.SysRegisterTempService; 
@Component
public class SchedulingService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ApartmentRoomTempService apartmentRoomTempService;
	@Autowired
	private HouseApartmentTempService houseApartmentTempService;
	@Autowired
	private HouseCentralizationTempService houseCentralizationTempService;
	@Autowired
	private HouseTypesRoomTempService houseTypesRoomTempService;
	@Autowired
	private HouseTypesTempService houseTypesTempService;
	@Autowired
	private SysRegisterTempService sysRegisterTempService;
	
	/**
	 * 将初道数据同步到住建局数据库的定时任务
	 * 定时任务每小时执行一次
	 */
	/*@Scheduled(cron="* 0/10 * * * ?") 
	public void schedulingService(){
		try {
			long start=System.currentTimeMillis();
			logger.info("schedulingService  定时任务启动开始" );
			
			boolean apartmentRoomTempFlag=apartmentRoomTempService.insertQueryApartmentRoomTemp();
			logger.info("schedulingService  定时任务   ApartmentRoomTemp表执行结果为：  "+apartmentRoomTempFlag );
			
			boolean houseApartmentTempFlag=houseApartmentTempService.insertQueryHouseApartmentTemp();
			logger.info("schedulingService  定时任务   HouseApartmentTemp表执行结果为：  "+houseApartmentTempFlag );
			
			boolean houseCentralizationTempFlag=houseCentralizationTempService.insertQueryHouseCentralizationTemp();
			logger.info("schedulingService  定时任务   HouseCentralizationTemp表执行结果为：  "+houseCentralizationTempFlag );
			
			boolean houseTypesRoomTempFlag=houseTypesRoomTempService.insertQueryHouseTypesRoomTemp();
			logger.info("schedulingService  定时任务   HouseTypesRoomTemp表执行结果为：  "+houseTypesRoomTempFlag );
			
			boolean houseTypesTempFlag=houseTypesTempService.insertQueryHouseTypesTemp();
			logger.info("schedulingService  定时任务   HouseTypesTemp表执行结果为：  "+houseTypesTempFlag );
			
			boolean sysRegisterTempFlag=sysRegisterTempService.insertQuerySysRegisterTemp();
			logger.info("schedulingService  定时任务   SysRegisterTemp表执行结果为：  "+sysRegisterTempFlag );
			
			logger.info("schedulingService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
		} catch (Exception e) {
			logger.info("定时任务schedulingService 异常"+e);
		}
	}*/
	
}
