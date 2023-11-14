package tn.esprit.uniiversite.service;

import tn.esprit.uniiversite.entite.Universite;

public interface IUniversiteService {

    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);
    Universite addUniversite(Universite e);
}
