package projet.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.example.demo.models.CandidatureModel;

public interface CandidatureRepository extends JpaRepository<CandidatureModel,Long>{
    
}