package tn.esprit.uniiversite.Controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.uniiversite.entite.Bloc;
import tn.esprit.uniiversite.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("Bloc")
public class BlocContrller {
    IBlocService blocService;
    @PutMapping("/affecterchambreBloc/{idChambre}/{idBloc}")
    public void affecterchambreBloc (@PathVariable("idChambre")List<Long> numCombre,@PathVariable("idBloc") long idBloc){
        blocService.affecterchambreBloc(numCombre,idBloc);


    }
}
