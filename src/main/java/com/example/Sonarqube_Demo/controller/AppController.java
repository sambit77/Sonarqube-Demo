package com.example.Sonarqube_Demo.controller;

import com.example.Sonarqube_Demo.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

    private final AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping("/message")
    public String getMessage()
    {
        return service.getMessage();
    }
}
