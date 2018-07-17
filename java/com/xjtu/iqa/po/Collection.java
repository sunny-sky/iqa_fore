package com.xjtu.iqa.po;

public class Collection {
    private String COLLECTIONID;

    private String COMMUNITYANSWERID;

    private String FAQQUESTIONID;

    private String USERID;

    private String TIME;

    private Integer ISNOTICE;

    public String getCOLLECTIONID() {
        return COLLECTIONID;
    }

    public void setCOLLECTIONID(String COLLECTIONID) {
        this.COLLECTIONID = COLLECTIONID == null ? null : COLLECTIONID.trim();
    }

    public String getCOMMUNITYANSWERID() {
        return COMMUNITYANSWERID;
    }

    public void setCOMMUNITYANSWERID(String COMMUNITYANSWERID) {
        this.COMMUNITYANSWERID = COMMUNITYANSWERID == null ? null : COMMUNITYANSWERID.trim();
    }

    public String getFAQQUESTIONID() {
        return FAQQUESTIONID;
    }

    public void setFAQQUESTIONID(String FAQQUESTIONID) {
        this.FAQQUESTIONID = FAQQUESTIONID == null ? null : FAQQUESTIONID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
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