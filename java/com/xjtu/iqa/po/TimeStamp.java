package com.xjtu.iqa.po;

public class TimeStamp {
    private String TIMEID;

    private String NAME;

    private String TIME;

    private String BEGINTIME;

    public String getTIMEID() {
        return TIMEID;
    }

    public void setTIMEID(String TIMEID) {
        this.TIMEID = TIMEID == null ? null : TIMEID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME == null ? null : TIME.trim();
    }

    public String getBEGINTIME() {
        return BEGINTIME;
    }

    public void setBEGINTIME(String BEGINTIME) {
        this.BEGINTIME = BEGINTIME == null ? null : BEGINTIME.trim();
    }
}