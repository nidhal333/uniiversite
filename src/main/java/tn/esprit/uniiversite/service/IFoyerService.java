package tn.esprit.uniiversite.service;

import tn.esprit.uniiversite.entite.Foyer;

public interface IFoyerService {
    Foyer addFoyer (Foyer e);
    Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite);

}
