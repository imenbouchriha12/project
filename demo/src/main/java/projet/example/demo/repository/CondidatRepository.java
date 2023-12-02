package projet.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.example.demo.models.CondidatModel;

public interface CondidatRepository extends JpaRepository<CondidatModel,Long>{
    
}