package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.models.CondidatModel;

public interface CondidatRepository extends JpaRepository<CondidatModel,Long>{
    
}