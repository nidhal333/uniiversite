package tn.esprit.uniiversite.service;

import tn.esprit.uniiversite.entite.Universite;

public interface IUniversiteService {

    Universite addUniversite(Universite e);
    void desaffecterFoyerAUniversite (long idUniversite);
}
