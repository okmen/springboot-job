package cn.web.ajdatasynweb.service;

public interface HouseApartmentTempService {
	/**
	 * 将HouseApartmentTemp 表数据从初道数据库取出 并备份到住建局数据库
	 * @return boolean
	 */
	boolean insertQueryHouseApartmentTemp();
}
