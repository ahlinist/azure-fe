package com.example.demo.controller;

import com.example.demo.client.BackendClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final BackendClient backendClient;

    @GetMapping("/morning")
    public String goodMorning() {
        return "Good morning, Sir!";
    }

    @GetMapping("/evening")
    public String goodEvening() {
        return backendClient.goodEvening();
    }
}
