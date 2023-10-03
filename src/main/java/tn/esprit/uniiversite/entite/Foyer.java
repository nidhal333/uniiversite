package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table (name = "foyer")

public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    private long id;
    @Column(name = "nom_du_Foyer")
    private String nomFoyer;
    @Column(name = "Capacite_du_foyer")
    private long capacitFoyer;

    @OneToOne(mappedBy = "foyers")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyers")
    private List<Bloc> Blocs;

}