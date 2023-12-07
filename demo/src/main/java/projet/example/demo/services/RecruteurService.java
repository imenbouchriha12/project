package projet.example.demo.services;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.example.demo.models.CandidatModel;
import projet.example.demo.models.RecruteurModel;
import projet.example.demo.repository.RecruteurRepository;


@Service
public class RecruteurService {
    @Autowired
    RecruteurRepository rep;
    public List<RecruteurModel> getAll(){
        return rep.findAll();
    }
    public RecruteurModel getrecruteur(Long id){
        Optional<RecruteurModel> oRecruteur;
        oRecruteur = rep.findById(id);
        if(oRecruteur.isPresent()){
            return oRecruteur.get();
        }
        else{
            return null;
        }
    }
    
    public RecruteurModel addRecruteur(RecruteurModel Recruteur){
        return rep.save(Recruteur);
    }
}