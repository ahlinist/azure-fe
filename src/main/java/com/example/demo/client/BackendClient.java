package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("azure-be:8080")
public interface BackendClient {

    @GetMapping("/evening")
    String goodEvening();
}
