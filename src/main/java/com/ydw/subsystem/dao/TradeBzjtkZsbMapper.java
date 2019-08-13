package com.ydw.subsystem.dao;

import com.ydw.subsystem.entity.TradeBzjtkZsb;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @Author hu_ke
 * @Description 用友服务接口
 * @Param
 * @return
 **/

@Mapper
public interface TradeBzjtkZsbMapper {
    int deleteByPrimaryKey(@Param("tdID") String tdID, @Param("payClass") String payClass);

    int insert(TradeBzjtkZsb record);

    TradeBzjtkZsb selectByPrimaryKey(@Param("tdID") String tdID, @Param("payClass") String payClass);

    List<TradeBzjtkZsb> selectAll();

    int updateByPrimaryKey(TradeBzjtkZsb record);


    /**
     * @Author hu_ke
     * @Description 根据类型和退款日期查询列表
     * @Param [tdID, payClass]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/

    List<TradeBzjtkZsb>  selectByTypeOnDate(@Param("type") String type, @Param("beginDate") String beginDate,@Param("endDate") String endDate);

    /**
     * @Author hu_ke
     * @Description 根据类型和开票日期查询列表
     * @Param [type, rtDate]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/

    List<TradeBzjtkZsb>  selectByTypeOnOpenDate(@Param("type") String type, @Param("beginDate") String beginDate,@Param("endDate") String endDate);


}