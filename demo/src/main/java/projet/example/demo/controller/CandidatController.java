package projet.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projet.example.demo.models.*;
import projet.example.demo.services.CandidatService;

import java.util.List;

@RestController
public class CandidatController {
    @Autowired
    CandidatService service;
    @RequestMapping(value="/api/Candidats", method=RequestMethod.GET)
    List<CandidatModel> getAll(){
        return service.getAll();
    }
    @RequestMapping(value = "/api/Candidats/{id}",method = RequestMethod.GET)
    CandidatModel getCandidatbyid(@PathVariable Long id){
        return service.getCandidat(id);
     }
     @PostMapping("/api/addCandidat")
     CandidatModel addCandidat(@RequestBody CandidatModel Candidat){
        
        return service.addCandidat(Candidat);
     }
    }