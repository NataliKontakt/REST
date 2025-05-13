package com.example.Rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String home() {
        return "✅ Authorization Service is running.\n" +
                "➡ Use endpoint: /authorize?user=YOUR_USERNAME&password=YOUR_PASSWORD";
    }
}
