package com.xjtu.iqa.po;

public class Message {
    private String MESSAGEID;

    private String MESSAGECONTENT;

    private String MESSAGETIME;

    private Integer MESSAGESTATE;

    private String POSTUSERID;

    private String GETUSERID;

    public String getMESSAGEID() {
        return MESSAGEID;
    }

    public void setMESSAGEID(String MESSAGEID) {
        this.MESSAGEID = MESSAGEID == null ? null : MESSAGEID.trim();
    }

    public String getMESSAGECONTENT() {
        return MESSAGECONTENT;
    }

    public void setMESSAGECONTENT(String MESSAGECONTENT) {
        this.MESSAGECONTENT = MESSAGECONTENT == null ? null : MESSAGECONTENT.trim();
    }

    public String getMESSAGETIME() {
        return MESSAGETIME;
    }

    public void setMESSAGETIME(String MESSAGETIME) {
        this.MESSAGETIME = MESSAGETIME == null ? null : MESSAGETIME.trim();
    }

    public Integer getMESSAGESTATE() {
        return MESSAGESTATE;
    }

    public void setMESSAGESTATE(Integer MESSAGESTATE) {
        this.MESSAGESTATE = MESSAGESTATE;
    }

    public String getPOSTUSERID() {
        return POSTUSERID;
    }

    public void setPOSTUSERID(String POSTUSERID) {
        this.POSTUSERID = POSTUSERID == null ? null : POSTUSERID.trim();
    }

    public String getGETUSERID() {
        return GETUSERID;
    }

    public void setGETUSERID(String GETUSERID) {
        this.GETUSERID = GETUSERID == null ? null : GETUSERID.trim();
    }
}