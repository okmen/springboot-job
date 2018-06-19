package cn.web.ajdatasynweb;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.web.ajdatasynweb.chudao.dao.ChuSysRegisterTempDao;
import cn.web.ajdatasynweb.entity.SysRegisterTemp;
import cn.web.ajdatasynweb.enums.ErrorType;
import cn.web.ajdatasynweb.zhujian.dao.ErrorLogDao;
import cn.web.ajdatasynweb.zhujian.dao.ZhuApartmentRoomTempDao;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class AjdataSynWebApplicationTests {
	@Autowired
//	@Qualifier("zhuSysRegisterTempService")
	private ChuSysRegisterTempDao chuSysRegisterTempDao;
	@Autowired
	private ZhuApartmentRoomTempDao zhuApartRoomsDAO;
	@Autowired
	private ErrorLogDao logMapper;
	@Test
	public void contextLoads() {
		 List<SysRegisterTemp> mod=chuSysRegisterTempDao.querySysRegisterTempAll();
		
		if(mod!=null&&mod.size()>0){
			System.out.println(mod.get(0).getApartmentManagementArea());
		} 

		logMapper.addLog(this.getClass().getName(), "测试导入ewq"+32, ErrorType.INFO);
//		ApartmentRoomTemp temp=new ApartmentRoomTemp();
//		temp.setAreaid("31");
//		temp.setRoomTypeId("32131");
//		temp.setRoomName("ceshi");
//		zhuApartRoomsDAO.insertApartmentRoomTemp(temp);
		System.out.println(1+"sss");
	}

}
