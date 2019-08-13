/**   
 * Copyright © 2019 公司名. All rights reserved.
 * @Title: TransactionService.java 
 * @Prject: trade-engine
 * @Package: com.hotent.trade.model 
 * @Description: TODO
 * @author: huke   
 * @date: 2019年8月12日 上午10:11:33 
 * @version: V1.0   
 */
package com.ydw.subsystem.model;

/**
 * @ClassName: TransactionService
 * @Description: 交易服务费
 * @author: huke
 * @date: 2019年8月12日 上午10:11:33
 */
public class TranserviceDO {

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
     * 收费日期
     */
    private String reDate;

    /**
     * 银行交易流水号
     */
    private String seqNo;

    /**
     * 收费金额
     */
    private Double reAmount;

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

    public String getReDate() {
        return reDate;
    }

    public void setReDate(String reDate) {
        this.reDate = reDate;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public Double getReAmount() {
        return reAmount;
    }

    public void setReAmount(Double reAmount) {
        this.reAmount = reAmount;
    }

    @Override
    public String toString() {
        return "TranserviceDO{" +
                "pjCLass='" + pjCLass + '\'' +
                ", tdID='" + tdID + '\'' +
                ", tdName='" + tdName + '\'' +
                ", cusName='" + cusName + '\'' +
                ", cusbkAcc='" + cusbkAcc + '\'' +
                ", cusbkName='" + cusbkName + '\'' +
                ", reDate='" + reDate + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", reAmount=" + reAmount +
                '}';
    }
}
