package com.xjtu.iqa.po;

public class ConfigureHistory {
    private String CONFIGUREHISTORYID;

    private String UPDATETIME;

    private String VERSION;

    private String CONFIGUREID;

    private String URL;

    private String REMARKS;

    public String getCONFIGUREHISTORYID() {
        return CONFIGUREHISTORYID;
    }

    public void setCONFIGUREHISTORYID(String CONFIGUREHISTORYID) {
        this.CONFIGUREHISTORYID = CONFIGUREHISTORYID == null ? null : CONFIGUREHISTORYID.trim();
    }

    public String getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(String UPDATETIME) {
        this.UPDATETIME = UPDATETIME == null ? null : UPDATETIME.trim();
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION == null ? null : VERSION.trim();
    }

    public String getCONFIGUREID() {
        return CONFIGUREID;
    }

    public void setCONFIGUREID(String CONFIGUREID) {
        this.CONFIGUREID = CONFIGUREID == null ? null : CONFIGUREID.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS == null ? null : REMARKS.trim();
    }
}