package tn.esprit.uniiversite.Controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


}
