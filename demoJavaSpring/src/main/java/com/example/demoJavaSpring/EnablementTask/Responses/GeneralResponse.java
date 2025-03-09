package com.example.demoJavaSpring.EnablementTask.Responses;

public class GeneralResponse {

    private String code;
    private String message;
    private String descriptionEn;
    private String descriptionEr;

    public GeneralResponse(String code, String message, String descriptionEn, String descriptionEr) {
        this.code = code;
        this.message = message;
        this.descriptionEn = descriptionEn;
        this.descriptionEr = descriptionEr;
    }

    public GeneralResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionEr() {
        return descriptionEr;
    }

    public void setDescriptionEr(String descriptionEr) {
        this.descriptionEr = descriptionEr;
    }
}
