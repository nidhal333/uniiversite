package tn.esprit.uniiversite.service;

import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.FoyerRepository;
import tn.esprit.uniiversite.Reosotiris.UniversiteRepository;
import tn.esprit.uniiversite.entite.Foyer;
import tn.esprit.uniiversite.entite.Universite;

@Service
public class universiteService implements IUniversiteService{
    UniversiteRepository UniversiteRepository;
    FoyerRepository FoyerRepository;
    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite){
        Universite Universites = UniversiteRepository.findByNonUniversite(nomUniversite);
        Foyer Foyers = FoyerRepository.findById(idFoyer).get();
// on set le fils dans le parent :
        Universite.setFoyer(Foyers);
        UniversiteRepository.save(Universites);
        return Universites;
    }
    @Override
    public Universite addUniversite(Universite e) {
        return UniversiteRepository.save(e);
    }
}
