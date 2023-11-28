package tn.esprit.uniiversite.Reosotiris;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Bloc;

import java.util.Optional;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    @Override
    <S extends Bloc> S save(S entity);
}

