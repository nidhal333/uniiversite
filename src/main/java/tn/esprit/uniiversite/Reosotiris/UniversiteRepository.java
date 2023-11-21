package tn.esprit.uniiversite.Reosotiris;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Universite;


@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    Universite findByNomuniversite(String name);
    @Override
    <S extends Universite> S save(S entity);
    Universite findUniversiteById(Long id);
}
