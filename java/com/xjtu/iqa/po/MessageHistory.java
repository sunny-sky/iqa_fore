package com.xjtu.iqa.po;

public class MessageHistory {
    private String MESSAGEHISTORYID;

    private String POSTUSERID;

    private String GETUSERID;

    private String TIMEMARK;

    public String getMESSAGEHISTORYID() {
        return MESSAGEHISTORYID;
    }

    public void setMESSAGEHISTORYID(String MESSAGEHISTORYID) {
        this.MESSAGEHISTORYID = MESSAGEHISTORYID == null ? null : MESSAGEHISTORYID.trim();
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

    public String getTIMEMARK() {
        return TIMEMARK;
    }

    public void setTIMEMARK(String TIMEMARK) {
        this.TIMEMARK = TIMEMARK == null ? null : TIMEMARK.trim();
    }
}