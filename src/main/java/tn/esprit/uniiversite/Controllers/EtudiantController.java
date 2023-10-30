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
import tn.esprit.uniiversite.service.IEtudiantService;

@RestController
@AllArgsConstructor
//@Slf4j
//@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/etudiants")
public class EtudiantController {
    IEtudiantService etudiantService;
@PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
}
}
