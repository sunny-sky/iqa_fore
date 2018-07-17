package com.xjtu.iqa.po;

public class Department {
    private String DEPARTMENTID;

    private String DEPARTMENTNAME;

    public String getDEPARTMENTID() {
        return DEPARTMENTID;
    }

    public void setDEPARTMENTID(String DEPARTMENTID) {
        this.DEPARTMENTID = DEPARTMENTID == null ? null : DEPARTMENTID.trim();
    }

    public String getDEPARTMENTNAME() {
        return DEPARTMENTNAME;
    }

    public void setDEPARTMENTNAME(String DEPARTMENTNAME) {
        this.DEPARTMENTNAME = DEPARTMENTNAME == null ? null : DEPARTMENTNAME.trim();
    }
}