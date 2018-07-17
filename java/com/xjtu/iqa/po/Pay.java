package com.xjtu.iqa.po;

public class Pay {
    private String PAYID;

    private String PAYUSERID;

    private String BEPAYUSERID;

    private String TIME;

    public String getPAYID() {
        return PAYID;
    }

    public void setPAYID(String PAYID) {
        this.PAYID = PAYID == null ? null : PAYID.trim();
    }

    public String getPAYUSERID() {
        return PAYUSERID;
    }

    public void setPAYUSERID(String PAYUSERID) {
        this.PAYUSERID = PAYUSERID == null ? null : PAYUSERID.trim();
    }

    public String getBEPAYUSERID() {
        return BEPAYUSERID;
    }

    public void setBEPAYUSERID(String BEPAYUSERID) {
        this.BEPAYUSERID = BEPAYUSERID == null ? null : BEPAYUSERID.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }
}