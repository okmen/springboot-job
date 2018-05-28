package cn.web.ajdatasynweb.datasource;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/** 
 * 多线程执行定时任务   
 */  
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) { 
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(6));
    }
}
