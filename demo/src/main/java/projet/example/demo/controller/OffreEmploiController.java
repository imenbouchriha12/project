package projet.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projet.example.demo.models.OffreEmploieModel;
import projet.example.demo.services.OffreEmploieService;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
@RequestMapping("/api")
public class OffreEmploiController {

    @Autowired
    OffreEmploieService service;
    @RequestMapping(value="/OffreEmplois", method=RequestMethod.GET)
    List<OffreEmploieModel> getAll(){
        return service.getAll();
    }
    @RequestMapping(value = "/OffreEmplois/{id}",method = RequestMethod.GET)
    OffreEmploieModel getOffreEmploibyid(@PathVariable Long id){
        return service.getOffreEmploie(id);
     }
     @PostMapping("/addOffreEmploi")
     OffreEmploieModel addOffreEmploi(@RequestBody OffreEmploieModel OffreEmploi){
        return service.addOffreEmploie(OffreEmploi);
     }
     @RequestMapping(value = "/deleteOffreEmploi/{id}",method = RequestMethod.DELETE)
     public void deleteOffreEmploiById(@PathVariable Long id){
        OffreEmploieModel OffreEmploi = service.getOffreEmploie(id);
        service.deletOffreEmploie(OffreEmploi);
     }
     @RequestMapping(value="/updateOffreEmploi/{id}", method=RequestMethod.PUT)
         public OffreEmploieModel updateOffreEmploiById(@PathVariable Long id, @RequestBody OffreEmploieModel OffreEmploi){
            return service.updateOffreEmploie(OffreEmploi);
         }
     
    }