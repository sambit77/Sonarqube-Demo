package com.example.Sonarqube_Demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyMessages")

public class AppEntity {

    @Id
    Integer id;
    String Message;
    public AppEntity(Integer id, String message) {
        this.id = id;
        Message = message;
    }

    public AppEntity() {
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }





}
