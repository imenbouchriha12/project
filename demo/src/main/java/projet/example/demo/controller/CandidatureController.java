package projet.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import projet.example.demo.models.*;
import projet.example.demo.services.CandidatService;
import projet.example.demo.services.CandidatureService;
import projet.example.demo.services.OffreEmploieService;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
@RequestMapping("/api")
public class CandidatureController {

    @Autowired
    CandidatureService service;
    @Autowired
    CandidatService serviceC;
    @Autowired
    OffreEmploieService serviceO;
    @RequestMapping(value="/Candidatures", method=RequestMethod.GET)
    List<CandidatureModel> getAll(){
        List<CandidatureModel> candidatures= service.getAll();
        for (CandidatureModel candidatureModel : candidatures) {
            candidatureModel.getCandidat().setMdp("****");
        }
        return candidatures;
    }
    @RequestMapping(value = "/Candidatures/{id}",method = RequestMethod.GET)
    CandidatureModel getCandidaturebyid(@PathVariable Long id){
        return service.getCandidature(id);
     }
   @PostMapping("/addCandidature")
public CandidatureModel addCandidature(
        @RequestParam("date")   Date date,
        @RequestParam("statut") int statut,
        @RequestParam("candidatId") Long candidatId,
        @RequestParam("offreId") Long offreId,
        @RequestParam("cvFile") String cvBase64,
        @RequestParam("cvFileName") String cvFileName
 ) {

    // Create a CandidatureModel object
    CandidatureModel candidature = new CandidatureModel();

    // Set fields other than the file
    candidature.setDate(date);
    candidature.setStatut(statut);

    // Fetch and set CandidatModel using candidatId (you need a service method for this)
    CandidatModel candidat = serviceC.getCandidat(candidatId);
    candidature.setCandidat(candidat);

    // Fetch and set OffreEmploieModel using offreId (you need a service method for this)
    OffreEmploieModel offreEmploie = serviceO.getOffreEmploie(offreId);
    candidature.setOffreEmploie(offreEmploie);

    byte[] cvData = Base64.getDecoder().decode(cvBase64);
    candidature.setCv(cvData);
    candidature.setCvFileName(cvFileName);

    // Call the service to add the candidature with the CV
    return service.addCandidature(candidature);
}
     @RequestMapping(value = "/deleteCandidature/{id}",method = RequestMethod.DELETE)
     public void deleteCandidatureById(@PathVariable Long id){
        CandidatureModel Candidature = service.getCandidature(id);
        service.deletCandidature(Candidature);
     }
     @RequestMapping(value="/updateCandidature", method=RequestMethod.PUT)
         public CandidatureModel updateCandidatureById( @RequestBody CandidatureModel Candidature){
            return service.updateCandidature(Candidature);
         }
}
    
     