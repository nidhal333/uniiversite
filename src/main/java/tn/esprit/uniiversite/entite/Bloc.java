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
@Table(name = "Bloc")

public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Bloc")
    private long id;
    @Column(name = "nom_Bloc")
    private String nombloc;
    @Column(name = "capacite_Bloc")
    private long capaciteBloc;

    @ManyToOne
    Foyer foyers;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Bloc")
    private Set<Chombre> Chombres;
}
