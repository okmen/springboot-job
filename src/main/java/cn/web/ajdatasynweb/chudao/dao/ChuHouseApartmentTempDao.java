package cn.web.ajdatasynweb.chudao.dao;

import java.util.List;

import cn.web.ajdatasynweb.entity.HouseApartmentTemp;

public interface ChuHouseApartmentTempDao {
	/**
	 * 查询 HouseApartmentTemp表的集合
	 * @return   List<HouseApartmentTemp>
	 * @param 
	 */
    List<HouseApartmentTemp>  queryHouseApartmentTempAll();
    /**
	 * 查询 HouseApartmentTemp表的数据总数
	 * @return  int
	 * @param 
	 */
    int  queryHouseApartmentTempTotal();
    /**
	 * 根据id删除 HouseApartmentTemp表的数据
	 * @return  int
	 * @param 
	 */
    int deleteHouseApartmentTempById(HouseApartmentTemp houseApartmentTemp);
}
