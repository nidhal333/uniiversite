package tn.esprit.uniiversite.service;

import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.ChombreRepository;
import tn.esprit.uniiversite.entite.Chombre;

import java.util.List;

@Service
@AllArgsConstructor
public class ChombreService implements IChombreService{
    ChombreRepository chombreRepository;
    @Override
    public Chombre addchambre (Chombre e){
        return chombreRepository.save(e);
    }
    @Override
    @Scheduled(fixedRate = 60000)
    public void getChambresParBloc(long idBloc) {
        List<Chombre> listch= chombreRepository.findByBloc(idBloc);

    }
}
