package com.ydw.subsystem.server.imp;

import com.ydw.subsystem.constant.YongyouConstant;
import com.ydw.subsystem.dao.TradeBzjtkZsbMapper;
import com.ydw.subsystem.entity.TradeBzjtkZsb;
import com.ydw.subsystem.model.*;
import com.ydw.subsystem.server.YongYouService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: YongYouServiceImp
 * @Description: 提供给
 * @Author 胡科
 * @Date 2019-08-13 09:37
 * @Version 1.0
 */
@Service
public class YongYouServiceImpl implements YongYouService {


    @Autowired
    TradeBzjtkZsbMapper tradeBzjtkZsbMapper;


    /**
     * @Author hu_ke
     * @Description 查询开票信息
     * @Param [type, beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/

    @Override
    public List<OpenTicketDO> selectByTypeOnOpenDate(String beginDate,String endDate) {
        List list = new ArrayList();
        OpenTicketDO openTicketDO = null;
        List<TradeBzjtkZsb> tradeBzjtkZsbs = tradeBzjtkZsbMapper.selectByTypeOnOpenDate(YongyouConstant.OPENTICKET.getCode(),beginDate,endDate);
        for(TradeBzjtkZsb tradeBzjtkZsb:tradeBzjtkZsbs) {
            openTicketDO = new OpenTicketDO();
            BeanUtils.copyProperties(tradeBzjtkZsb,openTicketDO);
            list.add(openTicketDO);
        }
        return list;
    }



    /**
     * @Author hu_ke
     * @Description 查询退保证金
     * @Param [beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/
    @Override
    public List<RedRptDO> selectRedRptByTypeOnOpenDate(String beginDate, String endDate) {
        List list = new ArrayList();
        RedRptDO redRptDO = null;
        List<TradeBzjtkZsb> tradeBzjtkZsbs = tradeBzjtkZsbMapper.selectByTypeOnDate(YongyouConstant.REDRPTTYPE.getCode(),beginDate,endDate);


        for(TradeBzjtkZsb tradeBzjtkZsb:tradeBzjtkZsbs) {
            redRptDO = new RedRptDO();
            BeanUtils.copyProperties(tradeBzjtkZsb, redRptDO);
            redRptDO.setSseqNo(tradeBzjtkZsb.getSeqNo());
            redRptDO.setRtAmount(tradeBzjtkZsb.getReAmount());
            list.add(redRptDO);
        }
        return list;
    }


    /**
     * @Author hu_ke
     * @Description 付财政转价款和交易服务费
     * @Param [beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.entity.TradeBzjtkZsb>
     **/
    @Override
    public List<TradeDO> selectTradeByTypeOnOpenDate(String beginDate, String endDate) {
        List list = new ArrayList();
        TradeDO tradeDO = null;
        List<TradeBzjtkZsb> tradeBzjtkZsbs = tradeBzjtkZsbMapper.selectByTypeOnDate(YongyouConstant.TRADE.getCode(),beginDate,endDate);
        for(TradeBzjtkZsb tradeBzjtkZsb:tradeBzjtkZsbs) {
            tradeDO = new TradeDO();
            BeanUtils.copyProperties(tradeBzjtkZsb, tradeDO);
            tradeDO.setSseqNo(tradeBzjtkZsb.getSeqNo());
            tradeDO.setRtDate(tradeBzjtkZsb.getRtDate());
            list.add(tradeDO);
        }
        return list;
    }


    /**
     * @Author hu_ke
     * @Description 罚没保证金
     * @Param [beginDate, endDate]
     * @return java.util.List<com.ydw.subsystem.model.FineDepositDO>
     **/

    @Override
    public List<FineDepositDO> selectFineDeposityTypeOnOpenDate(String beginDate, String endDate) {
        List list = new ArrayList();
        FineDepositDO fineDeposit = null;
        List<TradeBzjtkZsb> tradeBzjtkZsbs = tradeBzjtkZsbMapper.selectByTypeOnDate(YongyouConstant.FINEDEPOSIT.getCode(),beginDate,endDate);
        for(TradeBzjtkZsb tradeBzjtkZsb:tradeBzjtkZsbs) {
            fineDeposit = new FineDepositDO();
            BeanUtils.copyProperties(tradeBzjtkZsb, fineDeposit);
            fineDeposit.setSseqNo(fineDeposit.getSseqNo());
            list.add(fineDeposit);
        }
        return list;
    }

   /**
    * @Author hu_ke
    * @Description 交易服务费
    * @Param [beginDate, endDate]
    * @return java.util.List<com.ydw.subsystem.model.FineDepositDO>
    **/

    @Override
    public List<FineDepositDO> selectByTypeOnDateTrade(String beginDate, String endDate) {
        List list = new ArrayList();
        TranserviceDO transervice = null;
        List<TradeBzjtkZsb> tradeBzjtkZsbs = tradeBzjtkZsbMapper.selectByTypeOnDateTrade(YongyouConstant.TRADE.getCode(),beginDate,endDate);
        for(TradeBzjtkZsb tradeBzjtkZsb:tradeBzjtkZsbs) {
            transervice = new TranserviceDO();
            BeanUtils.copyProperties(tradeBzjtkZsb, transervice);
            transervice.setSseqNo(tradeBzjtkZsb.getTseqNo());
            transervice.setRtAmount(tradeBzjtkZsb.getPayAmount());


            list.add(transervice);
        }
        return list;
    }


}
