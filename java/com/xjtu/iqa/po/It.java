package com.xjtu.iqa.po;

public class It {
    private String USERID;

    private String GOODWORK;

    private String WORKAGE;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getGOODWORK() {
        return GOODWORK;
    }

    public void setGOODWORK(String GOODWORK) {
        this.GOODWORK = GOODWORK == null ? null : GOODWORK.trim();
    }

    public String getWORKAGE() {
        return WORKAGE;
    }

    public void setWORKAGE(String WORKAGE) {
        this.WORKAGE = WORKAGE == null ? null : WORKAGE.trim();
    }
}