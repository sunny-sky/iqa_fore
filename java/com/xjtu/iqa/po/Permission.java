package com.xjtu.iqa.po;

public class Permission {
    private String PERMISSIONID;

    private String PERMISSIONPHYSICALNAME;

    private String PERMISSIONLOGICNAME;

    private String TIME;

    public String getPERMISSIONID() {
        return PERMISSIONID;
    }

    public void setPERMISSIONID(String PERMISSIONID) {
        this.PERMISSIONID = PERMISSIONID == null ? null : PERMISSIONID.trim();
    }

    public String getPERMISSIONPHYSICALNAME() {
        return PERMISSIONPHYSICALNAME;
    }

    public void setPERMISSIONPHYSICALNAME(String PERMISSIONPHYSICALNAME) {
        this.PERMISSIONPHYSICALNAME = PERMISSIONPHYSICALNAME == null ? null : PERMISSIONPHYSICALNAME.trim();
    }

    public String getPERMISSIONLOGICNAME() {
        return PERMISSIONLOGICNAME;
    }

    public void setPERMISSIONLOGICNAME(String PERMISSIONLOGICNAME) {
        this.PERMISSIONLOGICNAME = PERMISSIONLOGICNAME == null ? null : PERMISSIONLOGICNAME.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }
}