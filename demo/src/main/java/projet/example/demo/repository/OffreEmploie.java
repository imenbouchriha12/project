package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.models.Offre_emploieModel;

public interface Offre_emploieRepository extends JpaRepository<Offre_emploieModel,Long>{
    
}