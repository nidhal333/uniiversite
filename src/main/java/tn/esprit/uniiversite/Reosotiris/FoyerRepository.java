package tn.esprit.uniiversite.Reosotiris;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    @Override
    <S extends Foyer> S save(S entity);
}
