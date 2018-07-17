package com.xjtu.iqa.po;

public class Driver {
    private String CONFIGUREID;

    private String OS;

    private String DRIVERTYPE;

    private String FITNESS;

    private String DRIVERINTRODUCTION;

    public String getCONFIGUREID() {
        return CONFIGUREID;
    }

    public void setCONFIGUREID(String CONFIGUREID) {
        this.CONFIGUREID = CONFIGUREID == null ? null : CONFIGUREID.trim();
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS == null ? null : OS.trim();
    }

    public String getDRIVERTYPE() {
        return DRIVERTYPE;
    }

    public void setDRIVERTYPE(String DRIVERTYPE) {
        this.DRIVERTYPE = DRIVERTYPE == null ? null : DRIVERTYPE.trim();
    }

    public String getFITNESS() {
        return FITNESS;
    }

    public void setFITNESS(String FITNESS) {
        this.FITNESS = FITNESS == null ? null : FITNESS.trim();
    }

    public String getDRIVERINTRODUCTION() {
        return DRIVERINTRODUCTION;
    }

    public void setDRIVERINTRODUCTION(String DRIVERINTRODUCTION) {
        this.DRIVERINTRODUCTION = DRIVERINTRODUCTION == null ? null : DRIVERINTRODUCTION.trim();
    }
}