package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadinessController {

    @GetMapping("/api/readiness")
    public String readiness() {
        return "readiness-ok";
    }

}
