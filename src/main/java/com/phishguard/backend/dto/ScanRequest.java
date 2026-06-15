package com.phishguard.backend.dto;

public class ScanRequest {
    private String emailText;

    public ScanRequest() {}

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }
}