package tn.esprit.uniiversite.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tn.esprit.uniiversite.Reosotiris.ChombreRepository;
import tn.esprit.uniiversite.Reosotiris.EtudiantRepository;
import tn.esprit.uniiversite.Reosotiris.ReservationRepository;
import tn.esprit.uniiversite.entite.Chombre;
import tn.esprit.uniiversite.entite.Etudiant;
import tn.esprit.uniiversite.entite.Reservation;

import java.time.LocalDate;
import java.time.Month;

@AllArgsConstructor
@Service
@Getter
@Setter
public class ReservationService implements IreservatinService{
   ChombreRepository chombreRepository;
   EtudiantRepository etudiantRepository;
   ReservationRepository reservationRepository;

   @Override
   public Reservation ajouterReservation(long idChambre, long cinEtudiant) {
      Chombre chambre = chombreRepository.findById(idChambre).orElse(null);
      Etudiant etudiant = etudiantRepository.findByCin(cinEtudiant);

      String numReservation = chambre.getNumerochambre();
      LocalDate debutAnneeUniv = LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 1);
      Boolean estValide = true;

      Reservation reservation = new Reservation();
      reservation.setId(numReservation);
      reservation.setAnneuniversitaire(debutAnneeUniv);
      reservation.setEstValide(estValide);

      chambre.getReservations().add(reservation);
      etudiant.getReservations().add(reservation);
      reservationRepository.save(reservation);

      chombreRepository.save(chambre);
      etudiantRepository.save(etudiant);

      return reservation;
   }
}
