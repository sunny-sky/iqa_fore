package com.xjtu.iqa.po;

public class Equipment {
    private String EQUIPMENTID;

    private String MACADDRESS;

    private String EQUIPMENTMODEL;

    private String BUYTIME;

    private String CPU;

    private String RAM;

    private String STORAGE;

    private String IP;

    private Integer STATE;

    public String getEQUIPMENTID() {
        return EQUIPMENTID;
    }

    public void setEQUIPMENTID(String EQUIPMENTID) {
        this.EQUIPMENTID = EQUIPMENTID == null ? null : EQUIPMENTID.trim();
    }

    public String getMACADDRESS() {
        return MACADDRESS;
    }

    public void setMACADDRESS(String MACADDRESS) {
        this.MACADDRESS = MACADDRESS == null ? null : MACADDRESS.trim();
    }

    public String getEQUIPMENTMODEL() {
        return EQUIPMENTMODEL;
    }

    public void setEQUIPMENTMODEL(String EQUIPMENTMODEL) {
        this.EQUIPMENTMODEL = EQUIPMENTMODEL == null ? null : EQUIPMENTMODEL.trim();
    }

    public String getBUYTIME() {
        return BUYTIME;
    }

    public void setBUYTIME(String BUYTIME) {
        this.BUYTIME = BUYTIME == null ? null : BUYTIME.trim();
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU == null ? null : CPU.trim();
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM == null ? null : RAM.trim();
    }

    public String getSTORAGE() {
        return STORAGE;
    }

    public void setSTORAGE(String STORAGE) {
        this.STORAGE = STORAGE == null ? null : STORAGE.trim();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
    }

    public Integer getSTATE() {
        return STATE;
    }

    public void setSTATE(Integer STATE) {
        this.STATE = STATE;
    }
}