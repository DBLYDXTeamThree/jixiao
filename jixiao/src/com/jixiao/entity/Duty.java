package com.jixiao.entity;

public class Duty {
    private Integer dutyid;

    private String dutyname;

    private Integer dutylevel;

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public String getDutyname() {
        return dutyname;
    }

    public void setDutyname(String dutyname) {
        this.dutyname = dutyname == null ? null : dutyname.trim();
    }

    public Integer getDutylevel() {
        return dutylevel;
    }

    public void setDutylevel(Integer dutylevel) {
        this.dutylevel = dutylevel;
    }
}