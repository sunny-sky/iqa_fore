package com.xjtu.iqa.po;

public class PatchWithBLOBs extends Patch {
    private String OS;

    private String PATCHINTRODUCTION;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS == null ? null : OS.trim();
    }

    public String getPATCHINTRODUCTION() {
        return PATCHINTRODUCTION;
    }

    public void setPATCHINTRODUCTION(String PATCHINTRODUCTION) {
        this.PATCHINTRODUCTION = PATCHINTRODUCTION == null ? null : PATCHINTRODUCTION.trim();
    }
}