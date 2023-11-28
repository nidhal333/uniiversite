package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Chambre")
public class Chombre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Chambre")
    private long id;
    @Column(name = "numero_Chambre")
    private String numerochambre;
    @Column(name = "Type_Chambre")
    private TypeChambre TypeC;
    @ManyToOne
    Bloc Bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
