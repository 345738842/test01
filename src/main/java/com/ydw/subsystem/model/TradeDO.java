/**   
 * Copyright © 2019 公司名. All rights reserved.
 * @Title: TradeDO.java 
 * @Prject: trade-engine
 * @Package: com.hotent.trade.model 
 * @Description: TODO
 * @author: huke   
 * @date: 2019年8月12日 上午9:43:55 
 * @version: V1.0   
 */
package com.ydw.subsystem.model;



/**
 * @ClassName: TradeDO
 * @Description: 付财政转价款和交易服务费
 * @author: huke
 * @date: 2019年8月12日 上午9:43:55
 */
public class TradeDO {
    
    /**
     * 项目类型
     */
    private String pjCLass;
    /**
     * 标段 ID 或编码
     */
    private String tdID;
    /**
     * 标段名称
     */
    private String tdName;
    /**
     * 银行付款日期
     */
    private String payDate;
    
    /**
     * 交易中心银行主账号
     */
    private String mainAcc;
    /**
     * 交易中心银行子账号
     */
    private String subAcc;
    /**
     * 交易中心银行名称
     */
    private String cenbkName;
    
    /**
     * 投标单位名称
     */
    private String cusName;
    
    /**
     * 投标单位银行账号
     */
    private String cusbkAcc;
    
    /**
     * 投标单位银行名称
     */
    private String cusbkName;
    
    /**
     * 付款交易流水号
     */
    private String tseqNo;
    
    /**
     * 原收款日期
     */
    private String reDate;
    
    /**
     * 原收款交易流水号
     */
    private String sseqNo;
    
    /**
     * 付款类型
     */
    private String payClass;
    
    /**
     * 付款金额
     */
    private Double payAmount;

    public String getPjCLass() {
        return pjCLass;
    }

    public void setPjCLass(String pjCLass) {
        this.pjCLass = pjCLass;
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

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
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

    public String getPayClass() {
        return payClass;
    }

    public void setPayClass(String payClass) {
        this.payClass = payClass;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    @Override
    public String toString() {
        return "TradeDO{" +
                "pjCLass='" + pjCLass + '\'' +
                ", tdID='" + tdID + '\'' +
                ", tdName='" + tdName + '\'' +
                ", payDate='" + payDate + '\'' +
                ", mainAcc='" + mainAcc + '\'' +
                ", subAcc='" + subAcc + '\'' +
                ", cenbkName='" + cenbkName + '\'' +
                ", cusName='" + cusName + '\'' +
                ", cusbkAcc='" + cusbkAcc + '\'' +
                ", cusbkName='" + cusbkName + '\'' +
                ", tseqNo='" + tseqNo + '\'' +
                ", reDate='" + reDate + '\'' +
                ", sseqNo='" + sseqNo + '\'' +
                ", payClass='" + payClass + '\'' +
                ", payAmount=" + payAmount +
                '}';
    }
}
