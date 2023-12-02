package projet.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.example.demo.models.CondidatureModel;

public interface CondidatureRepository extends JpaRepository<CondidatureModel,Long>{
    
}