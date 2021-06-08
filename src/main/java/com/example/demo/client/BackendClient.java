package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "backend", url = "https://azure-be.azurewebsites.net")
public interface BackendClient {

    @GetMapping("/evening")
    String goodEvening();
}
