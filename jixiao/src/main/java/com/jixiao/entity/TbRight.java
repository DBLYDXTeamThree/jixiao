package com.jixiao.entity;

public class TbRight {
    private Integer rightid;

    private Integer roleid;

    private String rigthname;

    private String url;

    private String descript;

    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRigthname() {
        return rigthname;
    }

    public void setRigthname(String rigthname) {
        this.rigthname = rigthname == null ? null : rigthname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }
}