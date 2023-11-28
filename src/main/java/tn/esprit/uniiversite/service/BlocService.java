package tn.esprit.uniiversite.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.BlocRepository;
import tn.esprit.uniiversite.Reosotiris.ChombreRepository;
import tn.esprit.uniiversite.entite.Bloc;
import tn.esprit.uniiversite.entite.Chombre;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocService implements IBlocService{
    BlocRepository BlocRepository;
    ChombreRepository chombreRepository;
    public Bloc affecterchambreBloc (List<Long> numCombre, long idBloc){
        Bloc bloc= BlocRepository.findById(idBloc).get();
        List<Chombre> chombres=(List<Chombre>) chombreRepository.findAllById(numCombre);
        for (Chombre chombre:chombres){
            chombre.setBloc(bloc);
            BlocRepository.save(bloc);
        }
        return bloc;
    }
    @Override
    public Bloc addBloc (Bloc e){
        return BlocRepository.save(e);
    }
}
