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
        return service.getAll();
    }
    @RequestMapping(value = "/Candidats/{id}",method = RequestMethod.GET)
    CandidatModel getCandidatbyid(@PathVariable Long id){
        return service.getCandidat(id);
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
     
    }