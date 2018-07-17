package com.xjtu.iqa.po;

public class CurrentEquipment {
    private String EQUIPMENTID;

    private String MACADDRESS;

    private String EQUIPMENTMODEL;

    private String EQUIPMENTTIME;

    private String IP;

    private String CPU;

    private String RAM;

    private String HARDDRIVER;

    private String HARDDRIVERMODEL;

    private String STORAGE;

    private String NETWORKCARD;

    private String MOTHERBOARD;

    private String OSNAME;

    private String OSTYPE;

    private String OSVERSION;

    private String OSID;

    private String USERID;

    private Integer ISNOTICE;

    private String GRAPHICCARD;

    private String AUDIOCARD;

    private String TIMEREMARKS;

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

    public String getEQUIPMENTTIME() {
        return EQUIPMENTTIME;
    }

    public void setEQUIPMENTTIME(String EQUIPMENTTIME) {
        this.EQUIPMENTTIME = EQUIPMENTTIME == null ? null : EQUIPMENTTIME.trim();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
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

    public String getHARDDRIVER() {
        return HARDDRIVER;
    }

    public void setHARDDRIVER(String HARDDRIVER) {
        this.HARDDRIVER = HARDDRIVER == null ? null : HARDDRIVER.trim();
    }

    public String getHARDDRIVERMODEL() {
        return HARDDRIVERMODEL;
    }

    public void setHARDDRIVERMODEL(String HARDDRIVERMODEL) {
        this.HARDDRIVERMODEL = HARDDRIVERMODEL == null ? null : HARDDRIVERMODEL.trim();
    }

    public String getSTORAGE() {
        return STORAGE;
    }

    public void setSTORAGE(String STORAGE) {
        this.STORAGE = STORAGE == null ? null : STORAGE.trim();
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

    public String getOSTYPE() {
        return OSTYPE;
    }

    public void setOSTYPE(String OSTYPE) {
        this.OSTYPE = OSTYPE == null ? null : OSTYPE.trim();
    }

    public String getOSVERSION() {
        return OSVERSION;
    }

    public void setOSVERSION(String OSVERSION) {
        this.OSVERSION = OSVERSION == null ? null : OSVERSION.trim();
    }

    public String getOSID() {
        return OSID;
    }

    public void setOSID(String OSID) {
        this.OSID = OSID == null ? null : OSID.trim();
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

    public String getTIMEREMARKS() {
        return TIMEREMARKS;
    }

    public void setTIMEREMARKS(String TIMEREMARKS) {
        this.TIMEREMARKS = TIMEREMARKS == null ? null : TIMEREMARKS.trim();
    }
}