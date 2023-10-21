package tn.esprit.uniiversite.service;

import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.EtudiantRepository;
import tn.esprit.uniiversite.entite.Etudiant;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return null;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {

    }
}
