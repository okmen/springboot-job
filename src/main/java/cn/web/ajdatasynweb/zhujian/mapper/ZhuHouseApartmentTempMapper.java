package cn.web.ajdatasynweb.zhujian.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.HouseApartmentTemp;
@Mapper
public interface ZhuHouseApartmentTempMapper {
	/**
	 * 添加HouseApartmentTemp对象
	 * @param houseApartmentTemp
	 * @return int
	 */
    int insertHouseApartmentTemp(HouseApartmentTemp houseApartmentTemp); 
}