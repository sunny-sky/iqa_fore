package com.xjtu.iqa.po;

public class Patch {
    private String CONFIGUREID;

    private String PATCHNUMBER;

    private String LANGUAGE;

    public String getCONFIGUREID() {
        return CONFIGUREID;
    }

    public void setCONFIGUREID(String CONFIGUREID) {
        this.CONFIGUREID = CONFIGUREID == null ? null : CONFIGUREID.trim();
    }

    public String getPATCHNUMBER() {
        return PATCHNUMBER;
    }

    public void setPATCHNUMBER(String PATCHNUMBER) {
        this.PATCHNUMBER = PATCHNUMBER == null ? null : PATCHNUMBER.trim();
    }

    public String getLANGUAGE() {
        return LANGUAGE;
    }

    public void setLANGUAGE(String LANGUAGE) {
        this.LANGUAGE = LANGUAGE == null ? null : LANGUAGE.trim();
    }
}