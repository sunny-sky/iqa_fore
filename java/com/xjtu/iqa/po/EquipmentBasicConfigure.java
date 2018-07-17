package com.xjtu.iqa.po;

public class EquipmentBasicConfigure {
    private String EQUIPMENTBASICCONFIGUREID;

    private String EQUIPMENTID;

    private String BASICCONFIGUREID;

    public String getEQUIPMENTBASICCONFIGUREID() {
        return EQUIPMENTBASICCONFIGUREID;
    }

    public void setEQUIPMENTBASICCONFIGUREID(String EQUIPMENTBASICCONFIGUREID) {
        this.EQUIPMENTBASICCONFIGUREID = EQUIPMENTBASICCONFIGUREID == null ? null : EQUIPMENTBASICCONFIGUREID.trim();
    }

    public String getEQUIPMENTID() {
        return EQUIPMENTID;
    }

    public void setEQUIPMENTID(String EQUIPMENTID) {
        this.EQUIPMENTID = EQUIPMENTID == null ? null : EQUIPMENTID.trim();
    }

    public String getBASICCONFIGUREID() {
        return BASICCONFIGUREID;
    }

    public void setBASICCONFIGUREID(String BASICCONFIGUREID) {
        this.BASICCONFIGUREID = BASICCONFIGUREID == null ? null : BASICCONFIGUREID.trim();
    }
}