package com.jixiao.entity;

import java.util.Date;

public class Pendingdoc {
    private Integer pendingdocid;

    private Integer accountid;

    private Integer docid;

    private Integer state;

    private Date finishtime;

    public Integer getPendingdocid() {
        return pendingdocid;
    }

    public void setPendingdocid(Integer pendingdocid) {
        this.pendingdocid = pendingdocid;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }
}