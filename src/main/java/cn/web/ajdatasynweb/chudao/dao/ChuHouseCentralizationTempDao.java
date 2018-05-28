package cn.web.ajdatasynweb.chudao.dao;

import java.util.List;

import cn.web.ajdatasynweb.entity.HouseCentralizationTemp;

public interface ChuHouseCentralizationTempDao {
	/**
	 * 查询 HouseCentralization表的集合
	 * @return   List<HouseCentralizationTemp>
	 * @param 
	 */
    List<HouseCentralizationTemp>  queryHouseCentralizationTempAll();
    /**
	 * 查询 HouseCentralization表的数据总数
	 * @return  int
	 * @param 
	 */
    int  queryHouseCentralizationTempTotal();
    /**
	 * 根据id删除 HouseCentralization表的数据
	 * @return  int
	 * @param 
	 */
    int deleteHouseCentralizationTempById(HouseCentralizationTemp houseCentralizationTemp);
}
