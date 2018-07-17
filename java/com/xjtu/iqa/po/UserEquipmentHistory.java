package com.xjtu.iqa.po;

public class UserEquipmentHistory {
    private String USEREQUIPMENTHISTORYID;

    private String USERID;

    private String EQUIPMENTID;

    private String ALLOCATIONSTARTTIME;

    private String ALLOCATIONENDTIME;

    public String getUSEREQUIPMENTHISTORYID() {
        return USEREQUIPMENTHISTORYID;
    }

    public void setUSEREQUIPMENTHISTORYID(String USEREQUIPMENTHISTORYID) {
        this.USEREQUIPMENTHISTORYID = USEREQUIPMENTHISTORYID == null ? null : USEREQUIPMENTHISTORYID.trim();
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getEQUIPMENTID() {
        return EQUIPMENTID;
    }

    public void setEQUIPMENTID(String EQUIPMENTID) {
        this.EQUIPMENTID = EQUIPMENTID == null ? null : EQUIPMENTID.trim();
    }

    public String getALLOCATIONSTARTTIME() {
        return ALLOCATIONSTARTTIME;
    }

    public void setALLOCATIONSTARTTIME(String ALLOCATIONSTARTTIME) {
        this.ALLOCATIONSTARTTIME = ALLOCATIONSTARTTIME == null ? null : ALLOCATIONSTARTTIME.trim();
    }

    public String getALLOCATIONENDTIME() {
        return ALLOCATIONENDTIME;
    }

    public void setALLOCATIONENDTIME(String ALLOCATIONENDTIME) {
        this.ALLOCATIONENDTIME = ALLOCATIONENDTIME == null ? null : ALLOCATIONENDTIME.trim();
    }
}