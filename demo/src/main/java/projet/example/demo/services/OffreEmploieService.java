package projet.example.demo.services;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.example.demo.models.OffreEmploieModel;
import projet.example.demo.repository.OffreEmploieRepository;


@Service
public class OffreEmploieService {
    @Autowired
    OffreEmploieRepository rep;
    public List<OffreEmploieModel> getAll(){
        return rep.findAll();
    }
    public OffreEmploieModel getOffreEmploie(Long id){
        Optional<OffreEmploieModel> oCondidat;
        oCondidat = rep.findById(id);
        if(oCondidat.isPresent()){
            return oCondidat.get();
        }
        else{
            return null;
        }
    }
    
    public OffreEmploieModel addOffreEmploie(OffreEmploieModel OffreEmploie){
        return rep.save(OffreEmploie);
    }
    public void deletOffreEmploie(OffreEmploieModel OffreEmploie){
        rep.delete(OffreEmploie);
    }
    public OffreEmploieModel updateOffreEmploie(OffreEmploieModel OffreEmploie){
        return rep.save(OffreEmploie);
    }
}