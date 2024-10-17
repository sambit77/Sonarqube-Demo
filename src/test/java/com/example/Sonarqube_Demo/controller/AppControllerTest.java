package com.example.Sonarqube_Demo.controller;

import com.example.Sonarqube_Demo.entity.AppEntity;
import com.example.Sonarqube_Demo.service.AppService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.engine.TestExecutionResult;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
class AppControllerTest {

    @MockBean
    private AppService appService;

    @InjectMocks
    private AppController appController;

    private AppEntity appEntity;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setUp() {
        appEntity = new AppEntity(1,"Hello World");
    }

    @Test
    void testGetMessageAPI() throws Exception {
        //Mockito.when(appService.getMessage()).thenReturn(appEntity.getMessage());
        mvc.perform(MockMvcRequestBuilders.get("/message")).andExpect(status().isOk());
    }
    @AfterEach
    void tearDown() {
        appEntity = null;
    }
}