package com.xjtu.iqa.po;

public class BasicConfigure {
    private String BASICCONFIGURE;

    private String CONFIGUREID;

    private String DEPARTMENTID;

    public String getBASICCONFIGURE() {
        return BASICCONFIGURE;
    }

    public void setBASICCONFIGURE(String BASICCONFIGURE) {
        this.BASICCONFIGURE = BASICCONFIGURE == null ? null : BASICCONFIGURE.trim();
    }

    public String getCONFIGUREID() {
        return CONFIGUREID;
    }

    public void setCONFIGUREID(String CONFIGUREID) {
        this.CONFIGUREID = CONFIGUREID == null ? null : CONFIGUREID.trim();
    }

    public String getDEPARTMENTID() {
        return DEPARTMENTID;
    }

    public void setDEPARTMENTID(String DEPARTMENTID) {
        this.DEPARTMENTID = DEPARTMENTID == null ? null : DEPARTMENTID.trim();
    }
}