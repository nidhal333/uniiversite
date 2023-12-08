package tn.esprit.uniiversite.Controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.uniiversite.entite.Bloc;
import tn.esprit.uniiversite.entite.Etudiant;
import tn.esprit.uniiversite.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("Bloc")
public class BlocContrller {
    IBlocService blocService;
    @PutMapping("/affecterchambreBloc/{idBloc}")
    public void affecterchambreBloc (@PathVariable("idChambre")List<Long> numCombre,@PathVariable("idBloc") long idBloc){
        blocService.affecterchambreBloc(numCombre,idBloc);
    }
    @PutMapping("/add-bloc")
    public void addBloc (@RequestBody Bloc e){
        blocService.addBloc(e);
    }
}
