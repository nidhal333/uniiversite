package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "Etudiant")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Etudiant")
    private long id;
    @Column(name = "nom_etudiant")
    private String nomEt;
    @Column(name = "prenom_Etudiant")
    private String prenomEt;
    private long cin;
    private String ecole;
    @Column(name ="Date_Naissance")
    private Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
