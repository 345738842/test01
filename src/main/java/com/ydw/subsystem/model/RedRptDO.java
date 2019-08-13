/**   
 * Copyright © 2019 公司名. All rights reserved.
 * @Title: RedRpt.java 
 * @Prject: trade-engine
 * @Package: com.hotent.trade.model 
 * @Description: TODO
 * @author: huke   
 * @date: 2019年8月12日 上午9:04:08 
 * @version: V1.0   
 */
package com.ydw.subsystem.model;

/**
 * @ClassName: RedRpt
 * @Description:退保证金
 * @author: huke
 * @date: 2019年8月12日 上午9:04:08
 */
public class RedRptDO {

    /**
     * 项目类型
     */
    public String pjClass;

    /**
     * 标段 ID 或编码
     */
    public String tdID;
    /**
     * 标段名称
     */
    public String tdName;
    /**
     * 银行退款日期
     */
    public String rtDate;
    /**
     * 交易中心银行主账号
     */
    public String mainAcc;
    /**
     * 交易中心银行子账号
     */
    public String subAcc;
    /**
     * 交易中心银行名称
     */
    public String cenbkName;

    /**
     * 投标单位名称
     */
    public String cusName;

    /**
     * 投标单位银行账号
     */
    public String cusbkAcc;

    /**
     * 投标单位银行名称
     */
    public String cusbkName;

    /**
     * 付款交易流水号
     */
    public String tseqNo;

    /**
     * 付款交易流水号
     */
    public String reDate;
    /**
     * 原收款交易流水号
     */
    public String sseqNo;

    /**
     * 保证金本金加利息
     */
    public Double rtAmount;

    public String getPjClass() {
        return pjClass;
    }

    public void setPjClass(String pjClass) {
        this.pjClass = pjClass;
    }

    public String getTdID() {
        return tdID;
    }

    public void setTdID(String tdID) {
        this.tdID = tdID;
    }

    public String getTdName() {
        return tdName;
    }

    public void setTdName(String tdName) {
        this.tdName = tdName;
    }

    public String getRtDate() {
        return rtDate;
    }

    public void setRtDate(String rtDate) {
        this.rtDate = rtDate;
    }

    public String getMainAcc() {
        return mainAcc;
    }

    public void setMainAcc(String mainAcc) {
        this.mainAcc = mainAcc;
    }

    public String getSubAcc() {
        return subAcc;
    }

    public void setSubAcc(String subAcc) {
        this.subAcc = subAcc;
    }

    public String getCenbkName() {
        return cenbkName;
    }

    public void setCenbkName(String cenbkName) {
        this.cenbkName = cenbkName;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusbkAcc() {
        return cusbkAcc;
    }

    public void setCusbkAcc(String cusbkAcc) {
        this.cusbkAcc = cusbkAcc;
    }

    public String getCusbkName() {
        return cusbkName;
    }

    public void setCusbkName(String cusbkName) {
        this.cusbkName = cusbkName;
    }

    public String getTseqNo() {
        return tseqNo;
    }

    public void setTseqNo(String tseqNo) {
        this.tseqNo = tseqNo;
    }

    public String getReDate() {
        return reDate;
    }

    public void setReDate(String reDate) {
        this.reDate = reDate;
    }

    public String getSseqNo() {
        return sseqNo;
    }

    public void setSseqNo(String sseqNo) {
        this.sseqNo = sseqNo;
    }

    public Double getRtAmount() {
        return rtAmount;
    }

    public void setRtAmount(Double rtAmount) {
        this.rtAmount = rtAmount;
    }

    @Override
    public String toString() {
        return "RedRptDO{" +
                "pjClass='" + pjClass + '\'' +
                ", tdID='" + tdID + '\'' +
                ", tdName='" + tdName + '\'' +
                ", rtDate='" + rtDate + '\'' +
                ", mainAcc='" + mainAcc + '\'' +
                ", subAcc='" + subAcc + '\'' +
                ", cenbkName='" + cenbkName + '\'' +
                ", cusName='" + cusName + '\'' +
                ", cusbkAcc='" + cusbkAcc + '\'' +
                ", cusbkName='" + cusbkName + '\'' +
                ", tseqNo='" + tseqNo + '\'' +
                ", reDate='" + reDate + '\'' +
                ", sseqNo='" + sseqNo + '\'' +
                ", rtAmount=" + rtAmount +
                '}';
    }
}
