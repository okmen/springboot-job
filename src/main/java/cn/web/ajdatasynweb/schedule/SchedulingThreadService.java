package cn.web.ajdatasynweb.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.web.ajdatasynweb.enums.ErrorType;
import cn.web.ajdatasynweb.service.ApartmentRoomTempService;
import cn.web.ajdatasynweb.service.HouseApartmentTempService;
import cn.web.ajdatasynweb.service.HouseCentralizationTempService;
import cn.web.ajdatasynweb.service.HouseTypesRoomTempService;
import cn.web.ajdatasynweb.service.HouseTypesTempService;
import cn.web.ajdatasynweb.service.SysRegisterTempService;
import cn.web.ajdatasynweb.zhujian.dao.ErrorLogDao;
@Component
public class SchedulingThreadService {
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
	@Autowired
	private ErrorLogDao logMapper;
	
	
	@Scheduled(cron="0/30 * * * * ?") 
	public void schedulingApartmentRoomTempService(){
		try{
			long start=System.currentTimeMillis();
			logger.info("schedulingApartmentRoomTempService  定时任务启动开始" +start);
			
			boolean apartmentRoomTempFlag=apartmentRoomTempService.insertQueryApartmentRoomTemp();
			
			logger.info("schedulingApartmentRoomTempService  定时任务   ApartmentRoomTemp表执行结果为：  "+apartmentRoomTempFlag );
			logger.info("schedulingApartmentRoomTempService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
			//记录日志
			logMapper.addLog(this.getClass().getName(), "schedulingApartmentRoomTempService 定时任务执行完成，执行结果数据："+apartmentRoomTempFlag+"条记录， 耗时："+(System.currentTimeMillis() -start), ErrorType.INFO);
		} catch (Exception e) {
			logger.info("定时任务schedulingApartmentRoomTempService 异常"+e);
			logMapper.addLog(this.getClass().getName(), "定时任务schedulingApartmentRoomTempService 异常"+e, ErrorType.ERROR);
		}
	}
	
	
	@Scheduled(cron="0/30 * * * * ?") 
	public void schedulingHouseApartmentTempService(){
		try{
			long start=System.currentTimeMillis();
			logger.info("schedulingHouseApartmentTempService  定时任务启动开始" +start);
			
			boolean houseApartmentTempFlag=houseApartmentTempService.insertQueryHouseApartmentTemp();
			
			logger.info("schedulingHouseApartmentTempService  定时任务   ApartmentRoomTemp表执行结果为：  "+houseApartmentTempFlag );
			logger.info("schedulingHouseApartmentTempService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
			logMapper.addLog(this.getClass().getName(), "schedulingHouseApartmentTempService 定时任务执行完成，执行结果数据："+houseApartmentTempFlag+"条记录， 耗时："+(System.currentTimeMillis() -start), ErrorType.INFO);
			
		} catch (Exception e) {
//			logger.info("定时任务schedulingHouseApartmentTempService 异常"+e);
			logMapper.addLog(this.getClass().getName(), "定时任务schedulingApartmentRoomTempService 异常"+e, ErrorType.ERROR);
		}
	}
	
	@Scheduled(cron="0/30 * * * * ?") 
	public void schedulingHouseCentralizationTempService(){
		try{
			long start=System.currentTimeMillis();
			logger.info("schedulingHouseCentralizationTempService  定时任务启动开始" +start);
			
			boolean houseCentralizationTempFlag=houseCentralizationTempService.insertQueryHouseCentralizationTemp();
			
			logger.info("schedulingHouseCentralizationTempService  定时任务   HouseCentralizationTemp表执行结果为：  "+houseCentralizationTempFlag );
			logger.info("schedulingHouseCentralizationTempService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
			logMapper.addLog(this.getClass().getName(), "schedulingHouseCentralizationTempService 定时任务执行完成，执行结果数据："+houseCentralizationTempFlag+"条记录， 耗时："+(System.currentTimeMillis() -start), ErrorType.INFO);
			
		} catch (Exception e) {
			logger.info("定时任务schedulingHouseCentralizationTempService 异常"+e);
			logMapper.addLog(this.getClass().getName(), "定时任务schedulingHouseCentralizationTempService 异常"+e, ErrorType.ERROR);
		}
	}
	
	@Scheduled(cron="0/30 * * * * ?") 
	public void schedulingHouseTypesRoomTempService(){
		try{
			long start=System.currentTimeMillis();
			logger.info("schedulingHouseTypesRoomTempService  定时任务启动开始" +start);
			
			boolean houseTypesRoomTempFlag=houseTypesRoomTempService.insertQueryHouseTypesRoomTemp();
			logger.info("schedulingHouseTypesRoomTempService  定时任务   HouseTypesRoomTemp表执行结果为：  "+houseTypesRoomTempFlag );
			
			logger.info("schedulingHouseTypesRoomTempService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
			logMapper.addLog(this.getClass().getName(), "schedulingHouseTypesRoomTempService 定时任务执行完成，执行结果数据："+houseTypesRoomTempFlag+"条记录， 耗时："+(System.currentTimeMillis() -start), ErrorType.INFO);
			
		} catch (Exception e) {
			logger.info("定时任务schedulingHouseTypesRoomTempService 异常"+e);
			logMapper.addLog(this.getClass().getName(), "定时任务schedulingHouseTypesRoomTempService 异常"+e, ErrorType.ERROR);
		}
	}
	
	
	@Scheduled(cron="0/30 * * * * ?") 
	public void schedulingHouseTypesTempService(){
		try{
			long start=System.currentTimeMillis();
			logger.info("schedulingHouseTypesTempService  定时任务启动开始" +start);
			
			boolean houseTypesTempFlag=houseTypesTempService.insertQueryHouseTypesTemp();
			logger.info("schedulingHouseTypesTempService  定时任务   HouseTypesTemp表执行结果为：  "+houseTypesTempFlag );
			
			logger.info("schedulingHouseTypesTempService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
			logMapper.addLog(this.getClass().getName(), "schedulingHouseTypesTempService 定时任务执行完成，执行结果数据："+houseTypesTempFlag+"条记录， 耗时："+(System.currentTimeMillis() -start), ErrorType.INFO);
			
		} catch (Exception e) {
			logger.info("定时任务schedulingHouseTypesTempService 异常"+e);
			logMapper.addLog(this.getClass().getName(), "定时任务schedulingHouseTypesTempService 异常"+e, ErrorType.ERROR);
		}
	}
	
	
	@Scheduled(cron="0/30 * * * * ?") 
	public void schedulingQuerySysRegisterTempService(){
		try{
			long start=System.currentTimeMillis();
			logger.info("schedulingQuerySysRegisterTempService  定时任务启动开始" +start);
			
			boolean sysRegisterTempFlag=sysRegisterTempService.insertQuerySysRegisterTemp();
			logger.info("schedulingQuerySysRegisterTempService  定时任务   SysRegisterTemp表执行结果为：  "+sysRegisterTempFlag );
			
			logger.info("schedulingQuerySysRegisterTempService 定时任务结束，总用时为： "+(System.currentTimeMillis() -start)); 
			logMapper.addLog(this.getClass().getName(), "schedulingQuerySysRegisterTempService 定时任务执行完成，执行结果数据："+sysRegisterTempFlag+"条记录， 耗时："+(System.currentTimeMillis() -start), ErrorType.INFO);
			
		} catch (Exception e) {
			logger.info("定时任务schedulingQuerySysRegisterTempService 异常"+e);
			logMapper.addLog(this.getClass().getName(), "定时任务schedulingQuerySysRegisterTempService 异常"+e, ErrorType.ERROR);
		}
	}
}
