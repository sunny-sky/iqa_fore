package com.xjtu.iqa.po;

public class Score {
    private String SCOREID;

    private String USERID;

    private String FAQQUESTIONID;

    private Float SCORE;

    private String TIME;

    public String getSCOREID() {
        return SCOREID;
    }

    public void setSCOREID(String SCOREID) {
        this.SCOREID = SCOREID == null ? null : SCOREID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getFAQQUESTIONID() {
        return FAQQUESTIONID;
    }

    public void setFAQQUESTIONID(String FAQQUESTIONID) {
        this.FAQQUESTIONID = FAQQUESTIONID == null ? null : FAQQUESTIONID.trim();
    }

    public Float getSCORE() {
        return SCORE;
    }

    public void setSCORE(Float SCORE) {
        this.SCORE = SCORE;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }
}