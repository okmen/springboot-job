package cn.web.ajdatasynweb.service;

public interface SysRegisterTempService {
	/**
	 * 将SysRegisterTemp 表数据从初道数据库取出 并备份到住建局数据库
	 * @return
	 */
	boolean insertQuerySysRegisterTemp();
}
