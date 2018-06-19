package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class Errorlogs implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3885192704424524309L;

	private Long id;
    private String className;
    private String logType;
    private String msg;
    private Date createTime;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
    
   
}