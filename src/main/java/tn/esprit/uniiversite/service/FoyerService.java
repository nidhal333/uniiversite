package tn.esprit.uniiversite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.FoyerRepository;
import tn.esprit.uniiversite.Reosotiris.UniversiteRepository;
import tn.esprit.uniiversite.entite.Foyer;
import tn.esprit.uniiversite.entite.Universite;


@AllArgsConstructor
@Service
public class FoyerService implements IFoyerService{

    FoyerRepository foyerRepository;
    UniversiteRepository universiteRepository;

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRepository.save(e);
    }
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);

        if (universite != null) {
            foyer.setUniversite(universite);
            Foyer addedFoyer = foyerRepository.save(foyer);
            return addedFoyer;
        }

        return null;
    }
}
