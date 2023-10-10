package tn.esprit.uniiversite.Reosotiris;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.uniiversite.entite.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
