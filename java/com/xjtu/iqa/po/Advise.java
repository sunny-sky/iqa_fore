package com.xjtu.iqa.po;

public class Advise {
    private String ADVISEID;

    private String EMAIL;

    private String NAME;

    private String PHONE;

    private String TEXT;

    private String ANNEX;

    private String USERID;

    private Integer STATES;

    private String ADVISETIME;

    public String getADVISEID() {
        return ADVISEID;
    }

    public void setADVISEID(String ADVISEID) {
        this.ADVISEID = ADVISEID == null ? null : ADVISEID.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE == null ? null : PHONE.trim();
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT == null ? null : TEXT.trim();
    }

    public String getANNEX() {
        return ANNEX;
    }

    public void setANNEX(String ANNEX) {
        this.ANNEX = ANNEX == null ? null : ANNEX.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public Integer getSTATES() {
        return STATES;
    }

    public void setSTATES(Integer STATES) {
        this.STATES = STATES;
    }

    public String getADVISETIME() {
        return ADVISETIME;
    }

    public void setADVISETIME(String ADVISETIME) {
        this.ADVISETIME = ADVISETIME == null ? null : ADVISETIME.trim();
    }
}