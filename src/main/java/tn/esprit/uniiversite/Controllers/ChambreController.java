package tn.esprit.uniiversite.Controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.uniiversite.entite.Bloc;
import tn.esprit.uniiversite.entite.Chombre;
import tn.esprit.uniiversite.service.IChombreService;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("chambre")
public class ChambreController {
    IChombreService chombreService;
    @PutMapping("/add-chambre")
    public void addChambre (@RequestBody Chombre e){
        chombreService.addchambre(e);
    }
}
