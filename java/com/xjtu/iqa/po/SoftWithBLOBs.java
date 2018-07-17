package com.xjtu.iqa.po;

public class SoftWithBLOBs extends Soft {
    private String INTRODUCTION;

    private String DESCRIPTION;

    private String NEWVERSIONINTRODUCTION;

    private String NEWVERSIONDESCRIPTION;

    public String getINTRODUCTION() {
        return INTRODUCTION;
    }

    public void setINTRODUCTION(String INTRODUCTION) {
        this.INTRODUCTION = INTRODUCTION == null ? null : INTRODUCTION.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    public String getNEWVERSIONINTRODUCTION() {
        return NEWVERSIONINTRODUCTION;
    }

    public void setNEWVERSIONINTRODUCTION(String NEWVERSIONINTRODUCTION) {
        this.NEWVERSIONINTRODUCTION = NEWVERSIONINTRODUCTION == null ? null : NEWVERSIONINTRODUCTION.trim();
    }

    public String getNEWVERSIONDESCRIPTION() {
        return NEWVERSIONDESCRIPTION;
    }

    public void setNEWVERSIONDESCRIPTION(String NEWVERSIONDESCRIPTION) {
        this.NEWVERSIONDESCRIPTION = NEWVERSIONDESCRIPTION == null ? null : NEWVERSIONDESCRIPTION.trim();
    }
}