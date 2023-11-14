package tn.esprit.uniiversite.Controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.uniiversite.entite.Foyer;
import tn.esprit.uniiversite.entite.Universite;
import tn.esprit.uniiversite.service.IUniversiteService;
import tn.esprit.uniiversite.service.universiteService;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("Universite")
public class UniversiteController {
    IUniversiteService universiteServices;
    @PutMapping("/affecter/{idFoyer}/{nomUniversite}")
    public void affecgterfoyer(@PathVariable("idFoyer") Long idFoyer,
                                             @PathVariable("nomUniversite") String nomUniversite) {
        universiteServices.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
    @PostMapping("/addUniversite")
    public Universite addFoyer(@RequestBody Universite e){

        return universiteServices.addUniversite(e);
    }
}
