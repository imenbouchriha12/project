package projet.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.example.demo.models.RecruteurModel;

public interface RecruteurRepository extends JpaRepository<RecruteurModel,Long>{
    
}