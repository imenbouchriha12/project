package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.models.CondidatModel;
import com.project.demo.services.CondidatService;
import java.util.List;

@RestController
public class CondidatController {
    @Autowired
    CondidatService service;
    @RequestMapping(value="/Condidats", method=RequestMethod.GET)
    List<CondidatModel> getAll(){
        return service.getAll();
    }
    @RequestMapping(value = "/Condidats/{id}",method = RequestMethod.GET)   
     CondidatModel getCondidatbyid(@PathVariable Long id){
        return service.getCondidat(id);
     }
     @PostMapping("/addCondidat")
     CondidatModel addCondidat(@RequestBody CondidatModel Condidat){
        return service.addCondidat(Condidat);
     }
    }