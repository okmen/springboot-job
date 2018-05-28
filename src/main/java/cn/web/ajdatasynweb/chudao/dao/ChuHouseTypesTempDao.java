package cn.web.ajdatasynweb.chudao.dao;

import java.util.List;

import cn.web.ajdatasynweb.entity.HouseTypesTemp;

public interface ChuHouseTypesTempDao {
	/**
	 * 查询HouseTypesTemp全部数据集合
	 * @return List<HouseTypesTemp>
	 * @param 
	 */
    List<HouseTypesTemp>  queryHouseTypesTempAll();
    /**
	 * 查询HouseTypesTemp全部数据总数
	 * @return  
	 * @param int
	 */
    int  queryHouseTypesTempTotal();
    /**
	 * 查询HouseTypesTemp全部数据集合
	 * @return int
	 * @param  HouseTypesTemp
	 */
    int  deleteHouseTypesTempById(HouseTypesTemp houseTypesTemp);
}
