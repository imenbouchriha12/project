package projet.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
import projet.example.demo.services.CandidatureService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
@RequestMapping("/api")
public class CandidatureController {

    @Autowired
    CandidatureService service;
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
        public CandidatureModel addCandidature(@RequestBody CandidatureModel candidature,@RequestParam("cvFile") MultipartFile cvFile) {
             try {
                // Vérifiez si un fichier CV a été fourni
                if (cvFile != null && !cvFile.isEmpty()) {
                    // Obtenez les données du fichier CV en bytes
                    byte[] cvData = cvFile.getBytes();
                    // Attribuez les données du fichier CV à l'objet CandidatureModel
                    candidature.setCv(cvData);
                    // Attribuez le nom du fichier CV à l'objet CandidatureModel
                    candidature.setCvFileName(cvFile.getOriginalFilename());
                }
        } catch (IOException e) {
            e.printStackTrace(); // Gérez les erreurs liées à la lecture du fichier
        }

        // Appelez le service pour ajouter la candidature avec le CV
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
    
     