package com.example.Sonarqube_Demo;

import com.example.Sonarqube_Demo.entity.AppEntity;
import com.example.Sonarqube_Demo.repository.AppRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final AppRepository repository;

    public DataInitializer(AppRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new AppEntity(1,"Hello World"));
    }
}
