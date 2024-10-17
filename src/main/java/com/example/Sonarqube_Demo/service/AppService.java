package com.example.Sonarqube_Demo.service;

import com.example.Sonarqube_Demo.entity.AppEntity;
import com.example.Sonarqube_Demo.repository.AppRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppService {
    private final AppRepository repository;

    public AppService(AppRepository repository) {
        this.repository = repository;
    }

    public String getMessage() {
        return repository.findById(1).get().getMessage();
    }
}
