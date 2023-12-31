package projet.example.demo.services;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.example.demo.models.CandidatModel;
import projet.example.demo.repository.CandidatRepository;


@Service
public class CandidatService {
    @Autowired
    CandidatRepository rep;
    public List<CandidatModel> getAll(){
        return rep.findAll();
    }
    public CandidatModel getCandidat(Long id){
        Optional<CandidatModel> oCondidat;
        oCondidat = rep.findById(id);
        if(oCondidat.isPresent()){
            return oCondidat.get();
        }
        else{
            return null;
        }
    }
    
    public CandidatModel addCandidat(CandidatModel Candidat){
        return rep.save(Candidat);
    }
    public void deletCandidat(CandidatModel Candidat){
        rep.delete(Candidat);
    }
    public CandidatModel updateCandidat(CandidatModel Candidat){
        return rep.save(Candidat);
    }
}