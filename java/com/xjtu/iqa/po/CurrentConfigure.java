package com.xjtu.iqa.po;

public class CurrentConfigure {
    private String CURRENTCONFIGUREID;

    private String EQUIPMENTID;

    private String CONFIGUREVERSION;

    private String CONFIGURENAME;

    private String CONFIGURETYPE;

    public String getCURRENTCONFIGUREID() {
        return CURRENTCONFIGUREID;
    }

    public void setCURRENTCONFIGUREID(String CURRENTCONFIGUREID) {
        this.CURRENTCONFIGUREID = CURRENTCONFIGUREID == null ? null : CURRENTCONFIGUREID.trim();
    }

    public String getEQUIPMENTID() {
        return EQUIPMENTID;
    }

    public void setEQUIPMENTID(String EQUIPMENTID) {
        this.EQUIPMENTID = EQUIPMENTID == null ? null : EQUIPMENTID.trim();
    }

    public String getCONFIGUREVERSION() {
        return CONFIGUREVERSION;
    }

    public void setCONFIGUREVERSION(String CONFIGUREVERSION) {
        this.CONFIGUREVERSION = CONFIGUREVERSION == null ? null : CONFIGUREVERSION.trim();
    }

    public String getCONFIGURENAME() {
        return CONFIGURENAME;
    }

    public void setCONFIGURENAME(String CONFIGURENAME) {
        this.CONFIGURENAME = CONFIGURENAME == null ? null : CONFIGURENAME.trim();
    }

    public String getCONFIGURETYPE() {
        return CONFIGURETYPE;
    }

    public void setCONFIGURETYPE(String CONFIGURETYPE) {
        this.CONFIGURETYPE = CONFIGURETYPE == null ? null : CONFIGURETYPE.trim();
    }
}