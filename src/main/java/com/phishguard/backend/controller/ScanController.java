package com.phishguard.backend.controller;

import com.phishguard.backend.Service.PhishingService;
import com.phishguard.backend.dto.ScanRequest;
import com.phishguard.backend.dto.ScanResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ScanController {

    private final PhishingService phishingService;

    public ScanController(PhishingService phishingService) {
        this.phishingService = phishingService;
    }

    @PostMapping("/scan-email")
    public ScanResponse scanEmail(@RequestBody ScanRequest request) {
        return phishingService.scanEmail(request);
    }

    @GetMapping("/health")
    public String health() {
        return "Backend is running";
    }
}