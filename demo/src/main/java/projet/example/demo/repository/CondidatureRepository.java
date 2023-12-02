package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.models.CondidatureModel;

public interface CondidatureRepository extends JpaRepository<CondidatureModel,Long>{
    
}