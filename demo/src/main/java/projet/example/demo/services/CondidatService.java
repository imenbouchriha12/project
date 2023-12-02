package com.project.demo.services;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.models.CondidatModel;
import com.project.demo.repository.CondidatRepository;


@Service
public class CondidatService {
    @Autowired
    CondidatRepository rep;
    public List<CondidatModel> getAll(){
        return rep.findAll();
    }
    public CondidatModel getCondidat(Long id){
        Optional<CondidatModel> oCondidat;
        oCondidat = rep.findById(id);
        if(oCondidat.isPresent()){
            return oCondidat.get();
        }
        else{
            return null;
        }
    }
    
    public CondidatModel addCondidat(CondidatModel Condidat){
        return rep.save(Condidat);
    }
}