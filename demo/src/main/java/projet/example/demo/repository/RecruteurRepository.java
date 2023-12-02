package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.models.RecruteurModel;

public interface RecruteurRepository extends JpaRepository<RecruteurModel,Long>{
    
}