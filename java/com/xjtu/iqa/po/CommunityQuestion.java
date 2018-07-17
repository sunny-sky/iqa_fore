package com.xjtu.iqa.po;

public class CommunityQuestion {
    private String COMMUNITYQUESTIONID;

    private String TIME;

    private String TITLE;

    private String CLASSIFYID;

    private String USERID;

    private String SCAN;

    private Integer QUESTIONSTATE;

    private Integer ISANSWER;

    private String CONTENT;

    public String getCOMMUNITYQUESTIONID() {
        return COMMUNITYQUESTIONID;
    }

    public void setCOMMUNITYQUESTIONID(String COMMUNITYQUESTIONID) {
        this.COMMUNITYQUESTIONID = COMMUNITYQUESTIONID == null ? null : COMMUNITYQUESTIONID.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    public String getCLASSIFYID() {
        return CLASSIFYID;
    }

    public void setCLASSIFYID(String CLASSIFYID) {
        this.CLASSIFYID = CLASSIFYID == null ? null : CLASSIFYID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getSCAN() {
        return SCAN;
    }

    public void setSCAN(String SCAN) {
        this.SCAN = SCAN == null ? null : SCAN.trim();
    }

    public Integer getQUESTIONSTATE() {
        return QUESTIONSTATE;
    }

    public void setQUESTIONSTATE(Integer QUESTIONSTATE) {
        this.QUESTIONSTATE = QUESTIONSTATE;
    }

    public Integer getISANSWER() {
        return ISANSWER;
    }

    public void setISANSWER(Integer ISANSWER) {
        this.ISANSWER = ISANSWER;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }
}