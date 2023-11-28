package tn.esprit.uniiversite.service;

import tn.esprit.uniiversite.entite.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc affecterchambreBloc (List<Long> numCombre, long idBloc);

    Bloc addBloc(Bloc e);
}
