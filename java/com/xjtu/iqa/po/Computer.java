package com.xjtu.iqa.po;

public class Computer {
    private String EQUIPMENTID;

    private String GRAPHICCARD;

    private String AUDIOCARD;

    private String NETWORKCARD;

    private String MOTHERBOARD;

    private String OSNAME;

    private String OSID;

    public String getEQUIPMENTID() {
        return EQUIPMENTID;
    }

    public void setEQUIPMENTID(String EQUIPMENTID) {
        this.EQUIPMENTID = EQUIPMENTID == null ? null : EQUIPMENTID.trim();
    }

    public String getGRAPHICCARD() {
        return GRAPHICCARD;
    }

    public void setGRAPHICCARD(String GRAPHICCARD) {
        this.GRAPHICCARD = GRAPHICCARD == null ? null : GRAPHICCARD.trim();
    }

    public String getAUDIOCARD() {
        return AUDIOCARD;
    }

    public void setAUDIOCARD(String AUDIOCARD) {
        this.AUDIOCARD = AUDIOCARD == null ? null : AUDIOCARD.trim();
    }

    public String getNETWORKCARD() {
        return NETWORKCARD;
    }

    public void setNETWORKCARD(String NETWORKCARD) {
        this.NETWORKCARD = NETWORKCARD == null ? null : NETWORKCARD.trim();
    }

    public String getMOTHERBOARD() {
        return MOTHERBOARD;
    }

    public void setMOTHERBOARD(String MOTHERBOARD) {
        this.MOTHERBOARD = MOTHERBOARD == null ? null : MOTHERBOARD.trim();
    }

    public String getOSNAME() {
        return OSNAME;
    }

    public void setOSNAME(String OSNAME) {
        this.OSNAME = OSNAME == null ? null : OSNAME.trim();
    }

    public String getOSID() {
        return OSID;
    }

    public void setOSID(String OSID) {
        this.OSID = OSID == null ? null : OSID.trim();
    }
}