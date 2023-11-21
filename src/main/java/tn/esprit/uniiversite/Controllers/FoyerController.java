package tn.esprit.uniiversite.Controllers;

import jakarta.validation.constraints.Null;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.uniiversite.entite.Etudiant;
import tn.esprit.uniiversite.entite.Foyer;
import tn.esprit.uniiversite.service.FoyerService;
import tn.esprit.uniiversite.service.IFoyerService;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("Foyer")
public class FoyerController {
   IFoyerService foyerService;
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer e){

        return foyerService.addFoyer(e);
    }
    @PostMapping("/ajouterFoyerEtAffecterAUniversite/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,@PathVariable("idUniversite") long idUniversite){
        foyerService.ajouterFoyerEtAffecterAUniversite(foyer,idUniversite);
        return null;
    }


}
