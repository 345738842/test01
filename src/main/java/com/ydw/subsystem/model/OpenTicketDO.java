/**   
 * Copyright © 2019 公司名. All rights reserved.
 * @Title: OpenTicket.java 
 * @Prject: trade-engine
 * @Package: com.hotent.trade.model 
 * @Description: TODO
 * @author: huke   
 * @date: 2019年8月12日 上午8:45:58 
 * @version: V1.0   
 */
package com.ydw.subsystem.model;

/**
 * @ClassName: OpenTicket
 * @Description: 开标模型
 * @author: huke
 * @date: 2019年8月12日 上午8:45:58
 */
public class OpenTicketDO {
   
    /**
     * 项目类型
     */
    private String pjClass;
    
    /**
     * 标段 ID 或编码
     */
    private String tdID;
    
    /**标段名称
     * 
     */
    private String tdName;
    /**
     * 开标日期
     */
    private String openDate;
    /**
     * 收款日期
     */
    private String reDate;
    
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
    
    /**投标单位名称
     * 
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
     * 收款交易流水号
     */
    private String seqNo;
    
    /**
     * 收保证金金额
     */
    private double reAmount;

    
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

    
    public String getOpenDate() {
        return openDate;
    }

    
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    
    public String getReDate() {
        return reDate;
    }

    
    public void setReDate(String reDate) {
        this.reDate = reDate;
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

    
    public String getSeqNo() {
        return seqNo;
    }

    
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    
    public double getReAmount() {
        return reAmount;
    }

    
    public void setReAmount(double reAmount) {
        this.reAmount = reAmount;
    }



}
