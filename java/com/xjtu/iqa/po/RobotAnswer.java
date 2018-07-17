package com.xjtu.iqa.po;

public class RobotAnswer {
    private String ROBOTANSWERID;

    private String USERQUESTIONID;

    private String FAQANSWERID;

    private Integer SATICFACTION;

    private Integer QUESTIONSTATE;

    public String getROBOTANSWERID() {
        return ROBOTANSWERID;
    }

    public void setROBOTANSWERID(String ROBOTANSWERID) {
        this.ROBOTANSWERID = ROBOTANSWERID == null ? null : ROBOTANSWERID.trim();
    }

    public String getUSERQUESTIONID() {
        return USERQUESTIONID;
    }

    public void setUSERQUESTIONID(String USERQUESTIONID) {
        this.USERQUESTIONID = USERQUESTIONID == null ? null : USERQUESTIONID.trim();
    }

    public String getFAQANSWERID() {
        return FAQANSWERID;
    }

    public void setFAQANSWERID(String FAQANSWERID) {
        this.FAQANSWERID = FAQANSWERID == null ? null : FAQANSWERID.trim();
    }

    public Integer getSATICFACTION() {
        return SATICFACTION;
    }

    public void setSATICFACTION(Integer SATICFACTION) {
        this.SATICFACTION = SATICFACTION;
    }

    public Integer getQUESTIONSTATE() {
        return QUESTIONSTATE;
    }

    public void setQUESTIONSTATE(Integer QUESTIONSTATE) {
        this.QUESTIONSTATE = QUESTIONSTATE;
    }
}