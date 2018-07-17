package com.xjtu.iqa.po;

public class RolePermission {
    private String ROLEPERMISSIONID;

    private String ROLEID;

    private String PERMISSIONID;

    public String getROLEPERMISSIONID() {
        return ROLEPERMISSIONID;
    }

    public void setROLEPERMISSIONID(String ROLEPERMISSIONID) {
        this.ROLEPERMISSIONID = ROLEPERMISSIONID == null ? null : ROLEPERMISSIONID.trim();
    }

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID == null ? null : ROLEID.trim();
    }

    public String getPERMISSIONID() {
        return PERMISSIONID;
    }

    public void setPERMISSIONID(String PERMISSIONID) {
        this.PERMISSIONID = PERMISSIONID == null ? null : PERMISSIONID.trim();
    }
}