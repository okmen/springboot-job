package cn.web.ajdatasynweb.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest; 
import org.springframework.test.context.junit4.SpringRunner;
 
import cn.web.ajdatasynweb.chudao.dao.ChuSysRegisterTempDao; 
import cn.web.ajdatasynweb.chudao.mapper.ChuSysRegisterTempMapper;
import cn.web.ajdatasynweb.entity.SysRegisterTemp;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ZhuJianTest {
	
	@Autowired
	@Qualifier("zhuSysRegisterTempService")
	private ChuSysRegisterTempDao chuSysRegisterTempDao;
	
	@Autowired  
	@Qualifier("zhuSysRegisterTempMapper")
    private ChuSysRegisterTempMapper chuSysRegisterTempMapper;  
	
	@Test
	public void checkSysRegisterTemp(){
		List<SysRegisterTemp> list=chuSysRegisterTempDao.querySysRegisterTempAll();
		for(SysRegisterTemp  temp:list){
			System.out.println("list"+temp);
		}
	}
}
