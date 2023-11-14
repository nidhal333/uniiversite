package tn.esprit.uniiversite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.FoyerRepository;
import tn.esprit.uniiversite.entite.Foyer;


@AllArgsConstructor
@Service
public class FoyerService implements IFoyerService{

    FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRepository.save(e);
    }
}
