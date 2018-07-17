package com.xjtu.iqa.po;

public class Equipments {
    private Integer EQUIPMENT_ID;

    private String BRAND;

    private String CONFIGURE_TIME;

    private String DEPARTMENT;

    private String USER;

    private String CPU;

    private String RAM;

    private String ROM;

    private String OS;

    private String BROWSER;

    private String OFFICE_SOFTWARE;

    private String USED_FOR;

    private String IP_ADDRESS;

    private String MAC_ADDRESS;

    private String REGION;

    public Integer getEQUIPMENT_ID() {
        return EQUIPMENT_ID;
    }

    public void setEQUIPMENT_ID(Integer EQUIPMENT_ID) {
        this.EQUIPMENT_ID = EQUIPMENT_ID;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND == null ? null : BRAND.trim();
    }

    public String getCONFIGURE_TIME() {
        return CONFIGURE_TIME;
    }

    public void setCONFIGURE_TIME(String CONFIGURE_TIME) {
        this.CONFIGURE_TIME = CONFIGURE_TIME == null ? null : CONFIGURE_TIME.trim();
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT == null ? null : DEPARTMENT.trim();
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER == null ? null : USER.trim();
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

    public String getROM() {
        return ROM;
    }

    public void setROM(String ROM) {
        this.ROM = ROM == null ? null : ROM.trim();
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS == null ? null : OS.trim();
    }

    public String getBROWSER() {
        return BROWSER;
    }

    public void setBROWSER(String BROWSER) {
        this.BROWSER = BROWSER == null ? null : BROWSER.trim();
    }

    public String getOFFICE_SOFTWARE() {
        return OFFICE_SOFTWARE;
    }

    public void setOFFICE_SOFTWARE(String OFFICE_SOFTWARE) {
        this.OFFICE_SOFTWARE = OFFICE_SOFTWARE == null ? null : OFFICE_SOFTWARE.trim();
    }

    public String getUSED_FOR() {
        return USED_FOR;
    }

    public void setUSED_FOR(String USED_FOR) {
        this.USED_FOR = USED_FOR == null ? null : USED_FOR.trim();
    }

    public String getIP_ADDRESS() {
        return IP_ADDRESS;
    }

    public void setIP_ADDRESS(String IP_ADDRESS) {
        this.IP_ADDRESS = IP_ADDRESS == null ? null : IP_ADDRESS.trim();
    }

    public String getMAC_ADDRESS() {
        return MAC_ADDRESS;
    }

    public void setMAC_ADDRESS(String MAC_ADDRESS) {
        this.MAC_ADDRESS = MAC_ADDRESS == null ? null : MAC_ADDRESS.trim();
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION == null ? null : REGION.trim();
    }
}