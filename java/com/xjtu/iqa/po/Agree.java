package com.xjtu.iqa.po;

public class Agree {
    private String AGREEID;

    private String COMMUNITYANSWERID;

    private String USERID;

    private String TOUSERID;

    private String TIME;

    private Integer ISNOTICE;

    public String getAGREEID() {
        return AGREEID;
    }

    public void setAGREEID(String AGREEID) {
        this.AGREEID = AGREEID == null ? null : AGREEID.trim();
    }

    public String getCOMMUNITYANSWERID() {
        return COMMUNITYANSWERID;
    }

    public void setCOMMUNITYANSWERID(String COMMUNITYANSWERID) {
        this.COMMUNITYANSWERID = COMMUNITYANSWERID == null ? null : COMMUNITYANSWERID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getTOUSERID() {
        return TOUSERID;
    }

    public void setTOUSERID(String TOUSERID) {
        this.TOUSERID = TOUSERID == null ? null : TOUSERID.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public Integer getISNOTICE() {
        return ISNOTICE;
    }

    public void setISNOTICE(Integer ISNOTICE) {
        this.ISNOTICE = ISNOTICE;
    }
}