package projet.example.demo.services;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.example.demo.models.CandidatureModel;
import projet.example.demo.repository.CandidatureRepository;


@Service
public class CandidatureService {
    @Autowired
    CandidatureRepository rep;
    public List<CandidatureModel> getAll(){
        return rep.findAll();
    }
    public CandidatureModel getCandidature(Long id){
        Optional<CandidatureModel> oCondidat;
        oCondidat = rep.findById(id);
        if(oCondidat.isPresent()){
            return oCondidat.get();
        }
        else{
            return null;
        }
    }
    
    public CandidatureModel addCandidature(CandidatureModel Candidature){
        return rep.save(Candidature);
    }
    public void deletCandidature(CandidatureModel Candidature){
        rep.delete(Candidature);
    }
    public CandidatureModel updateCandidature(CandidatureModel Candidature){
        return rep.save(Candidature);
    }
}