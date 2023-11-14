package tn.esprit.uniiversite.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.FoyerRepository;
import tn.esprit.uniiversite.Reosotiris.UniversiteRepository;
import tn.esprit.uniiversite.entite.Foyer;
import tn.esprit.uniiversite.entite.Universite;

import java.util.Optional;


@AllArgsConstructor
@Service
@Getter
@Setter
public class universiteService implements IUniversiteService{
    UniversiteRepository UniversiteRepository;
    FoyerRepository FoyerRepository;

    public Universite affecterFoyerAUniversite (long idFoyer, String nomuniversite){
        Universite Universites = UniversiteRepository.findByNomuniversite(nomuniversite);
        Foyer Foyers = FoyerRepository.findById(idFoyer).get();

        Universites.getFoyers();
        UniversiteRepository.save(Universites);
        return Universites;
    }
    @Override
    public Universite addUniversite(Universite e) {
        return UniversiteRepository.save(e);
    }
}
