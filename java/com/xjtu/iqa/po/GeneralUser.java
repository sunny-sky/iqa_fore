package com.xjtu.iqa.po;

public class GeneralUser {
    private String USERID;

    private String EMPLOYER;

    private String DEPARTMENT;

    private String REALNAME;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getEMPLOYER() {
        return EMPLOYER;
    }

    public void setEMPLOYER(String EMPLOYER) {
        this.EMPLOYER = EMPLOYER == null ? null : EMPLOYER.trim();
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT == null ? null : DEPARTMENT.trim();
    }

    public String getREALNAME() {
        return REALNAME;
    }

    public void setREALNAME(String REALNAME) {
        this.REALNAME = REALNAME == null ? null : REALNAME.trim();
    }
}