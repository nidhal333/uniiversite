package tn.esprit.uniiversite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.ChombreRepository;
import tn.esprit.uniiversite.entite.Bloc;
import tn.esprit.uniiversite.entite.Chombre;

@Service
@AllArgsConstructor
public class ChombreService implements IChombreService{
    ChombreRepository chombreRepository;
    @Override
    public Chombre addchambre (Chombre e){
        return chombreRepository.save(e);
    }
}
