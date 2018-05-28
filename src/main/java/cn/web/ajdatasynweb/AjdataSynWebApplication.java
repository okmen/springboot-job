package cn.web.ajdatasynweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling; 

@EnableScheduling
@SpringBootApplication
public class AjdataSynWebApplication {

	/**
	 * 231
	 * @author lvxl
	 * @date:   2018年5月28日
	 * @Desc :
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AjdataSynWebApplication.class, args);
	}
}