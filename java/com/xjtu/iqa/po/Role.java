package com.xjtu.iqa.po;

public class Role {
    private String ROLEID;

    private String ROLENAME;

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID == null ? null : ROLEID.trim();
    }

    public String getROLENAME() {
        return ROLENAME;
    }

    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME == null ? null : ROLENAME.trim();
    }
}