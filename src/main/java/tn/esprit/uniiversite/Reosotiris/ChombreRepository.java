package tn.esprit.uniiversite.Reosotiris;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Chombre;


@Repository
public interface ChombreRepository extends JpaRepository<Chombre,Long> {

}
