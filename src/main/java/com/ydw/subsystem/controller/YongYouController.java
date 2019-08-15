package com.ydw.subsystem.controller;
import com.ydw.subsystem.server.imp.YongYouServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ClassName: YongYouController
 * @Description: 用友调用接口
 * @Author 胡科
 * @Date 2019-08-13 08:43
 * @Version 1.0
 */
@Api(value = "用友调用接口文档")
@RestController
@RequestMapping(value = "/yongyou")
public class YongYouController {

    public static final Logger logger = LoggerFactory.getLogger(YongYouController.class);

    @Autowired
    private YongYouServiceImpl yongYouServiceImp;


    /**
     * @Author hu_ke
     * @Description 开票接口
     * @Param [date]Ø
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/

    @ApiOperation(value = "开票接口",notes ="开票接口" )
    @RequestMapping(value = "/getopentender",method = RequestMethod.GET)
    public Map<String,Object> openTicket(@RequestParam(value="startdate") String startdate, @RequestParam(value="enddate")String enddate){
        List list = new ArrayList();
        Map<String,Object> maps = new HashMap<String,Object>(3);
        try {
            list=yongYouServiceImp.selectByTypeOnOpenDate(startdate,enddate);

            result(list, maps);
        } catch (Exception e) {
            errorinfo(list, maps, e);
        }
        return maps;
    }

    private void result(List list, Map<String, Object> maps) {
        if (list.size() == 0) {
            maps.put("isOK", "N");
        } else {
            maps.put("isOK", "Y");
        }
        maps.put("msg", "本次查询返回" + list.size() + "条结果");
        maps.put("rows", list);
    }


    @ApiOperation(value = "退保证金接口",notes ="退保证金接口" )
    @RequestMapping(value = "/getrtfund",method = RequestMethod.GET)

    public Map<String,Object> redRpt(@RequestParam(value="startdate") String startdate, @RequestParam(value="enddate")String enddate){
        List list = new ArrayList();
        Map<String,Object> maps = new HashMap<String,Object>(3);
        try {
            list=yongYouServiceImp.selectRedRptByTypeOnOpenDate(startdate,enddate);

            result(list, maps);
        } catch (Exception e) {
            errorinfo(list, maps, e);
        }
        return maps;
    }

    private void errorinfo(List list, Map<String, Object> maps, Exception e) {
        logger.error("查询开票接口异常：" + e.getMessage(), e);
        maps.put("isOK", "N");
        maps.put("msg", "系统异常：" + e.getMessage());
        maps.put("rows", list);
    }


    @ApiOperation(value = "付财政转价款和交易服务费",notes ="付财政转价款和交易服务费" )
    @RequestMapping(value = "/getpayfinance",method = RequestMethod.GET)
    public Map<String,Object> trade(@RequestParam(value="startdate") String startdate, @RequestParam(value="enddate")String enddate){
        List list = new ArrayList();
        Map<String,Object> maps = new HashMap<String,Object>(3);
        try {
            list=yongYouServiceImp.selectTradeByTypeOnOpenDate(startdate,enddate);

            result(list, maps);
        } catch (Exception e) {
            errorinfo(list, maps, e);
        }
        return maps;
    }



    @ApiOperation(value = "罚没保证金",notes ="罚没保证金" )
    @RequestMapping(value = "/getpaypenalty",method = RequestMethod.GET)

    public Map<String,Object> fineDeposit(@RequestParam(value="startdate") String startdate, @RequestParam(value="enddate")String enddate){
        List list = new ArrayList();
        Map<String,Object> maps = new HashMap<String,Object>(3);
        try {
            list=yongYouServiceImp.selectFineDeposityTypeOnOpenDate(startdate,enddate);
            result(list, maps);
        } catch (Exception e) {
            errorinfo(list, maps, e);
        }
        return maps;
    }



    @ApiOperation(value = "交易服务费",notes ="交易服务费" )
    @RequestMapping(value = "/getrefee",method = RequestMethod.GET)
    public Map<String,Object> tradeservcie(@RequestParam(value="startdate") String startdate, @RequestParam(value="enddate")String enddate){
        List list = new ArrayList();
        Map<String,Object> maps = new HashMap<String,Object>(3);
        try {
            list=yongYouServiceImp.selectByTypeOnDateTrade(startdate,enddate);
            result(list, maps);
        } catch (Exception e) {
            errorinfo(list, maps, e);
        }
        return maps;
    }







}
