package tn.esprit.uniiversite.Reosotiris;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Universite;


@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByNonUniversite(String name);

    @Override
    <S extends Universite> S save(S entity);
}
