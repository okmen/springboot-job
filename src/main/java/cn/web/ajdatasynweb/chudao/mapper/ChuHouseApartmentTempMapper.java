package cn.web.ajdatasynweb.chudao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import cn.web.ajdatasynweb.entity.HouseApartmentTemp;
@Mapper
public interface ChuHouseApartmentTempMapper {
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