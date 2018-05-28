package cn.web.ajdatasynweb.zhujian.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.HouseTypesRoomTemp;
@Mapper
public interface ZhuHouseTypesRoomTempMapper {
	/**
	 * 添加HouseTypesRoomTemp对象 
	 * @param houseTypesRoomTemp
	 * @return  int
	 */
    int insertHouseTypesRoomTemp(HouseTypesRoomTemp houseTypesRoomTemp); 
}