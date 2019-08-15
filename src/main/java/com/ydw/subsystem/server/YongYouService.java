package com.ydw.subsystem.server;

import com.ydw.subsystem.entity.TradeBzjtkZsb;
import com.ydw.subsystem.model.FineDepositDO;
import com.ydw.subsystem.model.OpenTicketDO;
import com.ydw.subsystem.model.RedRptDO;
import com.ydw.subsystem.model.TradeDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: Test
 * @Description: 用友系统服务
 * @Author 胡科
 * @Date 2019-08-13 09:34
 * @Version 1.0
 */
public interface YongYouService {


    /**
     * @Author hu_ke
     * @Description 根据类型和银行退款日期查询
     * @Param [type, rtDate]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/

    List<RedRptDO> selectRedRptByTypeOnOpenDate(@Param("beginDate") String beginDate, @Param("endDate") String endDate);

    /**
     * @Author hu_ke
     * @Description 根据开票日期和类型查询对应的列表
     * @Param [type, rtDate]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/

    List<OpenTicketDO>  selectByTypeOnOpenDate(@Param("beginDate") String beginDate, @Param("endDate") String endDate);


    /**
     * @Author hu_ke
     * @Description 付财政转价款和交易服务费
     * @Param [beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.model.TradeDO>
     **/

    List<TradeDO> selectTradeByTypeOnOpenDate(@Param("beginDate") String beginDate, @Param("endDate")  String endDate);


    /**
     * @Author hu_ke
     * @Description 罚没保证金
     * @Param [beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.model.FineDepositDO>
     **/

    List<FineDepositDO> selectFineDeposityTypeOnOpenDate(@Param("beginDate")  String beginDate, @Param("endDate")  String endDate);


    /**
     * @Author hu_ke
     * @Description 交易服务费
     * @Param [beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.model.FineDepositDO>
     **/

    List<FineDepositDO> selectByTypeOnDateTrade(@Param("beginDate")  String beginDate, @Param("endDate")  String endDate);
}
