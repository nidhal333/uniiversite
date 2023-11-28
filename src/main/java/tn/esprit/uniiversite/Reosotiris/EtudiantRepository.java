package tn.esprit.uniiversite.Reosotiris;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Etudiant;

import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    @Override
    <S extends Etudiant> S save(S entity);


    @Override
    Optional<Etudiant> findById(Long aLong);

    Etudiant findByCin(long cin);
}
