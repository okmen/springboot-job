package cn.web.ajdatasynweb.zhujian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.SysRegisterTemp; 
@Mapper
public interface ZhuSysRegisterTempMapper {
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
     * 添加SysRegisterTemp 对象
     * @return int
     */
    int  insertSysRegisterTemp(SysRegisterTemp sysRegisterTemp);
}