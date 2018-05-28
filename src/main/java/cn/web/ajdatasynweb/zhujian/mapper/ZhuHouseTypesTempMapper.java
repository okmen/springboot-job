package cn.web.ajdatasynweb.zhujian.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.HouseTypesTemp;
@Mapper
public interface ZhuHouseTypesTempMapper { 
	/**
	 * 添加HouseTypesTemp对象
	 * @param houseTypesTemp
	 * @return int
	 */
    int insertHouseTypesTemp(HouseTypesTemp houseTypesTemp); 
}