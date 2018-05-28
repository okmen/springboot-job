package cn.web.ajdatasynweb.zhujian.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.web.ajdatasynweb.entity.HouseCentralizationTemp;
@Mapper
public interface ZhuHouseCentralizationTempMapper { 
	/**
	 * 添加HouseCentralizationTemp对象
	 * @param houseCentralizationTemp
	 * @return int
	 */
    int insertHouseCentralizationTemp(HouseCentralizationTemp houseCentralizationTemp); 
}