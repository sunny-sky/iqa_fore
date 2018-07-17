package com.xjtu.iqa.po;

public class FaqVideo {
    private String FAQVIDEOID;

    private String URL;

    private String DESCRIPTION;

    private String FAQANSWERID;

    public String getFAQVIDEOID() {
        return FAQVIDEOID;
    }

    public void setFAQVIDEOID(String FAQVIDEOID) {
        this.FAQVIDEOID = FAQVIDEOID == null ? null : FAQVIDEOID.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    public String getFAQANSWERID() {
        return FAQANSWERID;
    }

    public void setFAQANSWERID(String FAQANSWERID) {
        this.FAQANSWERID = FAQANSWERID == null ? null : FAQANSWERID.trim();
    }
}