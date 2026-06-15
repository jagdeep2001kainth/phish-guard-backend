package com.phishguard.backend.Service;

import com.phishguard.backend.dto.ScanRequest;
import com.phishguard.backend.dto.ScanResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PhishingService {

    private final RestClient restClient;

    public PhishingService(@Value("${ml.service.url}") String mlServiceUrl) {
        this.restClient = RestClient.builder()
                .baseUrl(mlServiceUrl)
                .build();
    }

    public ScanResponse scanEmail(ScanRequest request) {
        return restClient.post()
                .uri("/predict")
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                .body(java.util.Map.of("email_text", request.getEmailText()))
                .retrieve()
                .body(ScanResponse.class);
    }
}