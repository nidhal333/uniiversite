package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "Chambre")
public class Chombre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Chambre")
    private long idchambre;
    @Column(name = "numero_Chambre")
    private String numeroChambre;
    @Column(name = "Type_Chambre")
    private TypeChambre TypeC;
    @ManyToOne
    Bloc Bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
