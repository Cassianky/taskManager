package com.test.doctoranywhere.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Test to check API
    @GetMapping("/123")
    public String home() {
        return "API WORKS";
    }
}
