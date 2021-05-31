package com.example.demo.controller;

import com.example.demo.client.BackendClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/")
    public String health() {
        return "OK";
    }

    @GetMapping("/invoices")
    public List<Integer> invoices() {
        return List.of(1,2,3);
    }

    @PostMapping("/invoices/{id}")
    public String processInvoice(@PathVariable Integer id) {

        if (id == 2) {
            throw new RuntimeException("ERROR!!!");
        }

        return "Invoice " + id + " has been processed";
    }

    @GetMapping("/invoices/stats")
    public Map<String, String> getStats() {
        return Map.of(
                "todayTotal", "3000",
                "todaySuccessful", "2999",
                "todayFailed", "1"
        );
    }
}
