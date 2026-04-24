package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivenessController {

    @GetMapping("/api/liveness")
    public String liveness() {
        return "liveness-ok";
    }

}
