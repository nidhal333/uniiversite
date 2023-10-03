package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "Reservation")

public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_reservation")
    private String id;
    @Column(name = "annee_universitaire")
    private Date anneuniversitaire;
    @Column(name = "est_valide")
    private Boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
