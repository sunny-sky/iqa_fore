package com.xjtu.iqa.po;

public class FaqPicture {
    private String FAQPICTUREID;

    private String IMGPATH;

    private String DESCRIPTION;

    private String USERID;

    private String TIME;

    private Integer STATE;

    public String getFAQPICTUREID() {
        return FAQPICTUREID;
    }

    public void setFAQPICTUREID(String FAQPICTUREID) {
        this.FAQPICTUREID = FAQPICTUREID == null ? null : FAQPICTUREID.trim();
    }

    public String getIMGPATH() {
        return IMGPATH;
    }

    public void setIMGPATH(String IMGPATH) {
        this.IMGPATH = IMGPATH == null ? null : IMGPATH.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
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

    public Integer getSTATE() {
        return STATE;
    }

    public void setSTATE(Integer STATE) {
        this.STATE = STATE;
    }
}