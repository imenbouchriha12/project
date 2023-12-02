package projet.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projet.example.demo.models.*;

import java.util.List;

@RestController
public class CandidatController {
    @Autowired
    CondidatService service;
    @RequestMapping(value="/Condidats", method=RequestMethod.GET)
    List<CandidatModel> getAll(){
        return service.getAll();
    }
    @RequestMapping(value = "/Condidats/{id}",method = RequestMethod.GET)
    CandidatModel getCondidatbyid(@PathVariable Long id){
        return service.getCondidat(id);
     }
     @PostMapping("/addCondidat")
     CandidatModel addCondidat(@RequestBody CandidatModel Condidat){
        return service.addCondidat(Condidat);
     }
    }