package cn.web.ajdatasynweb.chudao.dao;

import java.util.List;

import cn.web.ajdatasynweb.entity.SysRegisterTemp;

public interface ChuSysRegisterTempDao {
	/**
	 * 根据id 获取SysRegisterTemp对象
	 * @param id
	 * @return
	 */
	SysRegisterTemp selectSysRegisterTempByPrimaryKey(Integer id); 
    /**
     * 获取SysRegisterTemp对象的集合
     * @return  List<SysRegisterTemp>
     */
    List<SysRegisterTemp> querySysRegisterTempAll();
    /**
     * 获得总记录数
     * @return int
     */
    int querySysRegisterTempTotal();
    /**
     * 删除单个对象
     * @return int
     * @param SysRegisterTemp
     */
    int deleteSysRegisterTempById(SysRegisterTemp sysRegisterTemp);
}
