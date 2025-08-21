package com.yarc.yarc_backend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroRestController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
