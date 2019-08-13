package com.ydw.subsystem.entity;

import java.io.Serializable;
/**
 * @Author hu_ke
 * @Description 保证金实体类
 * @Param
 * @return
 **/

public class TradeBzjtkZsb implements Serializable {
    private String tdID;

    private String payClass;

    private String pjClass;

    private String tdName;

    private String openDate;

    private String reDate;

    private String mainAcc;

    private String subAcc;

    private String cenbkName;

    private String cusName;

    private String cusbkAcc;

    private String cusbkName;

    private String seqNo;

    private Double reAmount;

    private String rtDate;

    private String tseqNo;

    private String sseqNo;

    private Double rtAmount;

    private String payDate;

    private Double payAmount;

    private String type;

    private static final long serialVersionUID = 1L;

    public String getTdID() {
        return tdID;
    }

    public void setTdID(String tdID) {
        this.tdID = tdID == null ? null : tdID.trim();
    }

    public String getPayClass() {
        return payClass;
    }

    public void setPayClass(String payClass) {
        this.payClass = payClass == null ? null : payClass.trim();
    }

    public String getPjClass() {
        return pjClass;
    }

    public void setPjClass(String pjClass) {
        this.pjClass = pjClass == null ? null : pjClass.trim();
    }

    public String getTdName() {
        return tdName;
    }

    public void setTdName(String tdName) {
        this.tdName = tdName == null ? null : tdName.trim();
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate == null ? null : openDate.trim();
    }

    public String getReDate() {
        return reDate;
    }

    public void setReDate(String reDate) {
        this.reDate = reDate == null ? null : reDate.trim();
    }

    public String getMainAcc() {
        return mainAcc;
    }

    public void setMainAcc(String mainAcc) {
        this.mainAcc = mainAcc == null ? null : mainAcc.trim();
    }

    public String getSubAcc() {
        return subAcc;
    }

    public void setSubAcc(String subAcc) {
        this.subAcc = subAcc == null ? null : subAcc.trim();
    }

    public String getCenbkName() {
        return cenbkName;
    }

    public void setCenbkName(String cenbkName) {
        this.cenbkName = cenbkName == null ? null : cenbkName.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusbkAcc() {
        return cusbkAcc;
    }

    public void setCusbkAcc(String cusbkAcc) {
        this.cusbkAcc = cusbkAcc == null ? null : cusbkAcc.trim();
    }

    public String getCusbkName() {
        return cusbkName;
    }

    public void setCusbkName(String cusbkName) {
        this.cusbkName = cusbkName == null ? null : cusbkName.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public Double getReAmount() {
        return reAmount;
    }

    public void setReAmount(Double reAmount) {
        this.reAmount = reAmount;
    }

    public String getRtDate() {
        return rtDate;
    }

    public void setRtDate(String rtDate) {
        this.rtDate = rtDate == null ? null : rtDate.trim();
    }

    public String getTseqNo() {
        return tseqNo;
    }

    public void setTseqNo(String tseqNo) {
        this.tseqNo = tseqNo == null ? null : tseqNo.trim();
    }

    public String getSseqNo() {
        return sseqNo;
    }

    public void setSseqNo(String sseqNo) {
        this.sseqNo = sseqNo == null ? null : sseqNo.trim();
    }

    public Double getRtAmount() {
        return rtAmount;
    }

    public void setRtAmount(Double rtAmount) {
        this.rtAmount = rtAmount;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate == null ? null : payDate.trim();
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tdID=").append(tdID);
        sb.append(", payClass=").append(payClass);
        sb.append(", pjClass=").append(pjClass);
        sb.append(", tdName=").append(tdName);
        sb.append(", openDate=").append(openDate);
        sb.append(", reDate=").append(reDate);
        sb.append(", mainAcc=").append(mainAcc);
        sb.append(", subAcc=").append(subAcc);
        sb.append(", cenbkName=").append(cenbkName);
        sb.append(", cusName=").append(cusName);
        sb.append(", cusbkAcc=").append(cusbkAcc);
        sb.append(", cusbkName=").append(cusbkName);
        sb.append(", seqNo=").append(seqNo);
        sb.append(", reAmount=").append(reAmount);
        sb.append(", rtDate=").append(rtDate);
        sb.append(", tseqNo=").append(tseqNo);
        sb.append(", sseqNo=").append(sseqNo);
        sb.append(", rtAmount=").append(rtAmount);
        sb.append(", payDate=").append(payDate);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}