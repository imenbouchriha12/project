package projet.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projet.example.demo.models.*;
import projet.example.demo.services.CandidatService;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
@RequestMapping("/api")
public class CandidatController {

    @Autowired
    CandidatService service;
    @RequestMapping(value="/Candidats", method=RequestMethod.GET)
    List<CandidatModel> getAll(){
         List<CandidatModel> candidas= service.getAll();
         for (CandidatModel candidatModel : candidas) {
            candidatModel.setMdp("****");
         }
         return candidas;
    }
    @RequestMapping(value = "/Candidats/{id}",method = RequestMethod.GET)
    CandidatModel getCandidatbyid(@PathVariable Long id){
            CandidatModel Candidat= service.getCandidat(id);
            Candidat.setMdp("****");
           return Candidat;



     }
     @PostMapping("/addCandidat")
     CandidatModel addCandidat(@RequestBody CandidatModel Candidat){
        byte[] photoBytes = Base64.getDecoder().decode(Candidat.getPhotoBase64());
        Candidat.setPhoto(photoBytes);

        return service.addCandidat(Candidat);
     }
     @PostMapping("/loginCandidat")
     public CandidatModel checkUser(@RequestBody CandidatModel candidat) {
         //TODO: process POST request
         List<CandidatModel> candidats=service.getAll();
         for (CandidatModel candidatModel : candidats) {
            if(candidatModel.getEmail().equals(candidat.getEmail()) && candidatModel.getMdp().equals(candidat.getMdp())){
                 CandidatModel loggedCandidat=candidatModel;
            loggedCandidat.setMdp("****");
              return loggedCandidat;

            }
         }
       
         return null ;

     }
     @RequestMapping(value = "/deleteCandidat/{id}",method = RequestMethod.DELETE)
     public void deleteCandidatById(@PathVariable Long id){
        CandidatModel Candidat = service.getCandidat(id);
        service.deletCandidat(Candidat);
     }
     @RequestMapping(value="/updateCandidat", method=RequestMethod.PUT)
         public void updateCandidatById(@RequestBody CandidatModel Candidat){
            CandidatModel c=service.getCandidat(Candidat.getId_candidat());

c.setNom(Candidat.getNom());
c.setPrenom(Candidat.getPrenom());
c.setEmail(Candidat.getEmail());
c.setSecteur(Candidat.getSecteur());
c.setPhoto(Candidat.getPhoto());
c.setDescPhoto(Candidat.getDescPhoto());
c.setDescription(Candidat.getDescription());
c.setTel(Candidat.getTel());
c.setDate_naissance(Candidat.getDate_naissance());
c.setPhotoBase64(Candidat.getPhotoBase64());
             service.updateCandidat(c);
         }

      @RequestMapping(value="/addFavorite/{id}", method=RequestMethod.PUT)
         public void addFavorite(@PathVariable Long id,@RequestBody OffreEmploieModel favoris){
            CandidatModel candidat=service.getCandidat(id);
            candidat.getFavoris().add(favoris);
            service.updateCandidat(candidat);
         }
         @RequestMapping(value = "/deleteFavorite/{id}", method=RequestMethod.DELETE)
         public void deleteFavorite(@PathVariable Long id, @RequestBody OffreEmploieModel favoris) {
             CandidatModel candidat = service.getCandidat(id);
             candidat.getFavoris().remove(favoris);
             service.updateCandidat(candidat);
         }


}

     
    