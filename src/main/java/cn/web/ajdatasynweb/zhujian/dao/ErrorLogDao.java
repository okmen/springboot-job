package cn.web.ajdatasynweb.zhujian.dao;

import cn.web.ajdatasynweb.enums.ErrorType;

public interface ErrorLogDao {
	  /**
     * 插入日志记录
     * @author max
     * @date:   2018年6月19日
     * @Desc :
     * @param className
     * @param msg
     * @param type
     * @return
     */
    int addLog(String className,String msg ,ErrorType type);
}
