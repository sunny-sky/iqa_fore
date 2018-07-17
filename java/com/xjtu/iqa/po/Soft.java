package com.xjtu.iqa.po;

public class Soft {
    private String CONFIGUREID;

    private String SOFTID;

    private String SCORE;

    private String LOGO;

    private String VERSIONTYPE;

    private String VERSION;

    private String SOFTTYPE;

    private String SPAREURL;

    private String OS;

    private String WEBSITE;

    public String getCONFIGUREID() {
        return CONFIGUREID;
    }

    public void setCONFIGUREID(String CONFIGUREID) {
        this.CONFIGUREID = CONFIGUREID == null ? null : CONFIGUREID.trim();
    }

    public String getSOFTID() {
        return SOFTID;
    }

    public void setSOFTID(String SOFTID) {
        this.SOFTID = SOFTID == null ? null : SOFTID.trim();
    }

    public String getSCORE() {
        return SCORE;
    }

    public void setSCORE(String SCORE) {
        this.SCORE = SCORE == null ? null : SCORE.trim();
    }

    public String getLOGO() {
        return LOGO;
    }

    public void setLOGO(String LOGO) {
        this.LOGO = LOGO == null ? null : LOGO.trim();
    }

    public String getVERSIONTYPE() {
        return VERSIONTYPE;
    }

    public void setVERSIONTYPE(String VERSIONTYPE) {
        this.VERSIONTYPE = VERSIONTYPE == null ? null : VERSIONTYPE.trim();
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION == null ? null : VERSION.trim();
    }

    public String getSOFTTYPE() {
        return SOFTTYPE;
    }

    public void setSOFTTYPE(String SOFTTYPE) {
        this.SOFTTYPE = SOFTTYPE == null ? null : SOFTTYPE.trim();
    }

    public String getSPAREURL() {
        return SPAREURL;
    }

    public void setSPAREURL(String SPAREURL) {
        this.SPAREURL = SPAREURL == null ? null : SPAREURL.trim();
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS == null ? null : OS.trim();
    }

    public String getWEBSITE() {
        return WEBSITE;
    }

    public void setWEBSITE(String WEBSITE) {
        this.WEBSITE = WEBSITE == null ? null : WEBSITE.trim();
    }
}