package cn.web.ajdatasynweb.chudao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.HouseTypesRoomTemp;
@Mapper
public interface ChuHouseTypesRoomTempMapper {
	/**
	 * 查询 HouseTypesRoomTemp表的集合
	 * @return   List<HouseTypesRoomTemp>
	 * @param 
	 */
    List<HouseTypesRoomTemp>  queryHouseTypesRoomTempAll();
    /**
	 * 查询 HouseTypesRoomTemp表的数据总数
	 * @return  int
	 * @param 
	 */
    int  queryHouseTypesRoomTempTotal();
    /**
	 * 根据id删除 HouseTypesRoomTemp表的数据
	 * @return  int
	 * @param 
	 */
    int deleteHouseTypesRoomTempById(HouseTypesRoomTemp houseTypesRoomTemp);
}