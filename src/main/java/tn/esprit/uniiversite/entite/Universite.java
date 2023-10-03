package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "Universte")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private long id;
    @Column(name = "nom_Unversite")
    private String nonUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyers;
}
