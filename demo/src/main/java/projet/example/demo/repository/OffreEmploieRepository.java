package projet.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.example.demo.models.OffreEmploieModel;

public interface OffreEmploieRepository extends JpaRepository<OffreEmploieModel,Long>{
    
}