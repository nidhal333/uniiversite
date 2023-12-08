package tn.esprit.uniiversite.service;

import tn.esprit.uniiversite.entite.Chombre;

import java.util.List;

public interface IChombreService {
    Chombre addchambre (Chombre e);

    void getChambresParBloc(long idBloc);
}
