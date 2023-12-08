package tn.esprit.uniiversite.Reosotiris;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Chombre;

import java.util.List;
import java.util.Optional;


@Repository
public interface ChombreRepository extends JpaRepository<Chombre,Long> {
    @Override
    Optional<Chombre> findById(Long aLong);

    @Override
    <S extends Chombre> S save(S entity);


    List<Chombre> findByBloc(long id);
}
