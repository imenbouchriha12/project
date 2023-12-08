package projet.example.demo.controller;

import java.util.Base64;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import projet.example.demo.models.RecruteurModel;
import projet.example.demo.services.RecruteurService;

@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
@RequestMapping("/api")
public class RecruteurController {
    
    @Autowired
        RecruteurService service;
        @RequestMapping(value="/Recruteur", method=RequestMethod.GET)
          List<RecruteurModel> getAll(){
        return service.getAll();
    }

  @RequestMapping(value = "/Recruteurs/{id}",method = RequestMethod.GET)
    RecruteurModel getRecruteurbyid(@PathVariable Long id){
        return service.getrecruteur(id);
     }

       @PostMapping("/addRecruteur")
     RecruteurModel addRecruteur(@RequestBody RecruteurModel Recruteur){
        byte[] photoBytes = Base64.getDecoder().decode(Recruteur.getPhotoBase64());
        Recruteur.setPhoto(photoBytes);

        return service.addRecruteur(Recruteur);
     }

          @PostMapping("/loginRecruteur")
     public RecruteurModel checkUser(@RequestBody RecruteurModel recruteur) {
         //TODO: process POST request
         List<RecruteurModel> recruteurs=service.getAll();
         for (RecruteurModel recruteurModel : recruteurs) {
            if(recruteurModel.getEmail().equals(recruteur.getEmail()) && recruteurModel.getMdp().equals(recruteur.getMdp())){
                 RecruteurModel loggedRecruteur=recruteurModel;
            loggedRecruteur.setMdp("****");
              return loggedRecruteur;

            }
         }
       
         return null ;

     }
          @RequestMapping(value = "/deleteRecruteur/{id}",method = RequestMethod.DELETE)
     public void deleteRecruteurById(@PathVariable Long id){
        RecruteurModel Recruteur = service.getrecruteur(id);
        service.deletRecruteur(Recruteur);
     }
     @RequestMapping(value="/updateRecruteur/{id}", method=RequestMethod.PUT)
         public RecruteurModel updateRecruteurById(@PathVariable Long id, @RequestBody RecruteurModel Recruteur){
            return service.updateRecruteur(Recruteur);
         }
}