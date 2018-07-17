package com.xjtu.iqa.po;

public class UserQuestion {
    private String USERQUESTIONID;

    private String QUESTIONTITLE;

    private String QUESTIONTIME;

    private Integer ISFAQ;

    private String USERID;

    public String getUSERQUESTIONID() {
        return USERQUESTIONID;
    }

    public void setUSERQUESTIONID(String USERQUESTIONID) {
        this.USERQUESTIONID = USERQUESTIONID == null ? null : USERQUESTIONID.trim();
    }

    public String getQUESTIONTITLE() {
        return QUESTIONTITLE;
    }

    public void setQUESTIONTITLE(String QUESTIONTITLE) {
        this.QUESTIONTITLE = QUESTIONTITLE == null ? null : QUESTIONTITLE.trim();
    }

    public String getQUESTIONTIME() {
        return QUESTIONTIME;
    }

    public void setQUESTIONTIME(String QUESTIONTIME) {
        this.QUESTIONTIME = QUESTIONTIME == null ? null : QUESTIONTIME.trim();
    }

    public Integer getISFAQ() {
        return ISFAQ;
    }

    public void setISFAQ(Integer ISFAQ) {
        this.ISFAQ = ISFAQ;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }
}