package com.xjtu.iqa.po;

public class Configure {
    private String CONFIGUREID;

    private String CONFIGURETYPE;

    private String CONFIGURENAME;

    private String FILESIZE;

    private String URL;

    private Integer DOWNLOADTIMES;

    private String PRODUCER;

    private String CONFIGURETIME;

    private Integer ISCONFIGURE;

    private String RENAME;

    public String getCONFIGUREID() {
        return CONFIGUREID;
    }

    public void setCONFIGUREID(String CONFIGUREID) {
        this.CONFIGUREID = CONFIGUREID == null ? null : CONFIGUREID.trim();
    }

    public String getCONFIGURETYPE() {
        return CONFIGURETYPE;
    }

    public void setCONFIGURETYPE(String CONFIGURETYPE) {
        this.CONFIGURETYPE = CONFIGURETYPE == null ? null : CONFIGURETYPE.trim();
    }

    public String getCONFIGURENAME() {
        return CONFIGURENAME;
    }

    public void setCONFIGURENAME(String CONFIGURENAME) {
        this.CONFIGURENAME = CONFIGURENAME == null ? null : CONFIGURENAME.trim();
    }

    public String getFILESIZE() {
        return FILESIZE;
    }

    public void setFILESIZE(String FILESIZE) {
        this.FILESIZE = FILESIZE == null ? null : FILESIZE.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public Integer getDOWNLOADTIMES() {
        return DOWNLOADTIMES;
    }

    public void setDOWNLOADTIMES(Integer DOWNLOADTIMES) {
        this.DOWNLOADTIMES = DOWNLOADTIMES;
    }

    public String getPRODUCER() {
        return PRODUCER;
    }

    public void setPRODUCER(String PRODUCER) {
        this.PRODUCER = PRODUCER == null ? null : PRODUCER.trim();
    }

    public String getCONFIGURETIME() {
        return CONFIGURETIME;
    }

    public void setCONFIGURETIME(String CONFIGURETIME) {
        this.CONFIGURETIME = CONFIGURETIME == null ? null : CONFIGURETIME.trim();
    }

    public Integer getISCONFIGURE() {
        return ISCONFIGURE;
    }

    public void setISCONFIGURE(Integer ISCONFIGURE) {
        this.ISCONFIGURE = ISCONFIGURE;
    }

    public String getRENAME() {
        return RENAME;
    }

    public void setRENAME(String RENAME) {
        this.RENAME = RENAME == null ? null : RENAME.trim();
    }
}