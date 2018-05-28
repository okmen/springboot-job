package cn.web.ajdatasynweb.chudao.dao;

import java.util.List;

import cn.web.ajdatasynweb.entity.ApartmentRoomTemp;

public interface ChuApartmentRoomTempDao {
	/**
	 * 查询 ApartmentRoomTemp表的集合
	 * @return   List<HouseApartmentTemp>
	 * @param 
	 */
    List<ApartmentRoomTemp>  queryApartmentRoomTempAll();
    /**
	 * 查询 ApartmentRoomTemp表的数据总数
	 * @return  int
	 * @param 
	 */
    int  queryApartmentRoomTempTotal();
    /**
	 * 根据id删除 ApartmentRoomTemp表的数据
	 * @return  int
	 * @param 
	 */
    int deleteApartmentRoomTempById(ApartmentRoomTemp apartmentRoomTemp);
}
