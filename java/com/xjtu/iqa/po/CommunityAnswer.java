package com.xjtu.iqa.po;

public class CommunityAnswer {
    private String COMMUNITYANSWERID;

    private String TIME;

    private Integer ISBESTANSWER;

    private String COMMUNITYQUESTIONID;

    private String USERID;

    private Integer ISNOTICE;

    private String CONTENT;

    public String getCOMMUNITYANSWERID() {
        return COMMUNITYANSWERID;
    }

    public void setCOMMUNITYANSWERID(String COMMUNITYANSWERID) {
        this.COMMUNITYANSWERID = COMMUNITYANSWERID == null ? null : COMMUNITYANSWERID.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public Integer getISBESTANSWER() {
        return ISBESTANSWER;
    }

    public void setISBESTANSWER(Integer ISBESTANSWER) {
        this.ISBESTANSWER = ISBESTANSWER;
    }

    public String getCOMMUNITYQUESTIONID() {
        return COMMUNITYQUESTIONID;
    }

    public void setCOMMUNITYQUESTIONID(String COMMUNITYQUESTIONID) {
        this.COMMUNITYQUESTIONID = COMMUNITYQUESTIONID == null ? null : COMMUNITYQUESTIONID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public Integer getISNOTICE() {
        return ISNOTICE;
    }

    public void setISNOTICE(Integer ISNOTICE) {
        this.ISNOTICE = ISNOTICE;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }
}