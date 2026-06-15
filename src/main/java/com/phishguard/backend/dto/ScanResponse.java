package com.phishguard.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScanResponse {
    private String prediction;

    @JsonProperty("phishing_probability")
    private double phishingProbability;

    @JsonProperty("safe_probability")
    private double safeProbability;

    private String reason;
    private String error;

    public ScanResponse() {}

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public double getPhishingProbability() {
        return phishingProbability;
    }

    public void setPhishingProbability(double phishingProbability) {
        this.phishingProbability = phishingProbability;
    }

    public double getSafeProbability() {
        return safeProbability;
    }

    public void setSafeProbability(double safeProbability) {
        this.safeProbability = safeProbability;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}