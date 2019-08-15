package com.ydw.subsystem.entity;

import java.io.Serializable;
/**
 * @Author hu_ke
 * @Description 保证金实体类
 * @Param
 * @return
 **/

public class TradeBzjtkZsb implements Serializable {
    private String sysseqno;

    private String tdid;

    private String pjclass;

    private String tdname;

    private String opendate;

    private String redate;

    private String mainacc;

    private String subacc;

    private String cenbkname;

    private String cusname;

    private String cusbkacc;

    private String cusbkname;

    private String seqno;

    private Double reamount;

    private String rtdate;

    private String tseqno;

    private String paydate;

    private String payclass;

    private Double payamount;

    private String type;

    private static final long serialVersionUID = 1L;

    public String getSysseqno() {
        return sysseqno;
    }

    public void setSysseqno(String sysseqno) {
        this.sysseqno = sysseqno == null ? null : sysseqno.trim();
    }

    public String getTdid() {
        return tdid;
    }

    public void setTdid(String tdid) {
        this.tdid = tdid == null ? null : tdid.trim();
    }

    public String getPjclass() {
        return pjclass;
    }

    public void setPjclass(String pjclass) {
        this.pjclass = pjclass == null ? null : pjclass.trim();
    }

    public String getTdname() {
        return tdname;
    }

    public void setTdname(String tdname) {
        this.tdname = tdname == null ? null : tdname.trim();
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate == null ? null : opendate.trim();
    }

    public String getRedate() {
        return redate;
    }

    public void setRedate(String redate) {
        this.redate = redate == null ? null : redate.trim();
    }

    public String getMainacc() {
        return mainacc;
    }

    public void setMainacc(String mainacc) {
        this.mainacc = mainacc == null ? null : mainacc.trim();
    }

    public String getSubacc() {
        return subacc;
    }

    public void setSubacc(String subacc) {
        this.subacc = subacc == null ? null : subacc.trim();
    }

    public String getCenbkname() {
        return cenbkname;
    }

    public void setCenbkname(String cenbkname) {
        this.cenbkname = cenbkname == null ? null : cenbkname.trim();
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname == null ? null : cusname.trim();
    }

    public String getCusbkacc() {
        return cusbkacc;
    }

    public void setCusbkacc(String cusbkacc) {
        this.cusbkacc = cusbkacc == null ? null : cusbkacc.trim();
    }

    public String getCusbkname() {
        return cusbkname;
    }

    public void setCusbkname(String cusbkname) {
        this.cusbkname = cusbkname == null ? null : cusbkname.trim();
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public Double getReamount() {
        return reamount;
    }

    public void setReamount(Double reamount) {
        this.reamount = reamount;
    }

    public String getRtdate() {
        return rtdate;
    }

    public void setRtdate(String rtdate) {
        this.rtdate = rtdate == null ? null : rtdate.trim();
    }

    public String getTseqno() {
        return tseqno;
    }

    public void setTseqno(String tseqno) {
        this.tseqno = tseqno == null ? null : tseqno.trim();
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate == null ? null : paydate.trim();
    }

    public String getPayclass() {
        return payclass;
    }

    public void setPayclass(String payclass) {
        this.payclass = payclass == null ? null : payclass.trim();
    }

    public Double getPayamount() {
        return payamount;
    }

    public void setPayamount(Double payamount) {
        this.payamount = payamount;
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
        sb.append(", sysseqno=").append(sysseqno);
        sb.append(", tdid=").append(tdid);
        sb.append(", pjclass=").append(pjclass);
        sb.append(", tdname=").append(tdname);
        sb.append(", opendate=").append(opendate);
        sb.append(", redate=").append(redate);
        sb.append(", mainacc=").append(mainacc);
        sb.append(", subacc=").append(subacc);
        sb.append(", cenbkname=").append(cenbkname);
        sb.append(", cusname=").append(cusname);
        sb.append(", cusbkacc=").append(cusbkacc);
        sb.append(", cusbkname=").append(cusbkname);
        sb.append(", seqno=").append(seqno);
        sb.append(", reamount=").append(reamount);
        sb.append(", rtdate=").append(rtdate);
        sb.append(", tseqno=").append(tseqno);
        sb.append(", paydate=").append(paydate);
        sb.append(", payclass=").append(payclass);
        sb.append(", payamount=").append(payamount);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}