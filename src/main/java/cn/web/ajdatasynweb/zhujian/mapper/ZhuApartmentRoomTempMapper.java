package cn.web.ajdatasynweb.zhujian.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.ApartmentRoomTemp;
import cn.web.ajdatasynweb.entity.Errorlogs;
@Mapper
public interface ZhuApartmentRoomTempMapper { 
	/**
	 * 添加ApartmentRoomTemp对象
	 * @param apartmentRoomTemp
	 * @return  int
	 */
    int insertApartmentRoomTemp(ApartmentRoomTemp apartmentRoomTemp); 
    
    int addLogs(Errorlogs log);
}