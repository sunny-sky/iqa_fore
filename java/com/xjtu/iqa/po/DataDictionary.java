package com.xjtu.iqa.po;

public class DataDictionary {
    private String DATADICTIONARYID;

    private String DATANAME;

    private String DATAVALUE;

    private String REMARKS;

    private Integer DATATYPE;

    private String DATARANGE;

    public String getDATADICTIONARYID() {
        return DATADICTIONARYID;
    }

    public void setDATADICTIONARYID(String DATADICTIONARYID) {
        this.DATADICTIONARYID = DATADICTIONARYID == null ? null : DATADICTIONARYID.trim();
    }

    public String getDATANAME() {
        return DATANAME;
    }

    public void setDATANAME(String DATANAME) {
        this.DATANAME = DATANAME == null ? null : DATANAME.trim();
    }

    public String getDATAVALUE() {
        return DATAVALUE;
    }

    public void setDATAVALUE(String DATAVALUE) {
        this.DATAVALUE = DATAVALUE == null ? null : DATAVALUE.trim();
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS == null ? null : REMARKS.trim();
    }

    public Integer getDATATYPE() {
        return DATATYPE;
    }

    public void setDATATYPE(Integer DATATYPE) {
        this.DATATYPE = DATATYPE;
    }

    public String getDATARANGE() {
        return DATARANGE;
    }

    public void setDATARANGE(String DATARANGE) {
        this.DATARANGE = DATARANGE == null ? null : DATARANGE.trim();
    }
}