package projet.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.example.demo.models.CandidatModel;

public interface CandidatRepository extends JpaRepository<CandidatModel,Long>{
    
}