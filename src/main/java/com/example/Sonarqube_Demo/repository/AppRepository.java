package com.example.Sonarqube_Demo.repository;

import com.example.Sonarqube_Demo.entity.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<AppEntity,Integer> {
}
