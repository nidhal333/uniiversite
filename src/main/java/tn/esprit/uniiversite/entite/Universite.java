package tn.esprit.uniiversite.entite;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Table(name = "Universte")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private long id;
    @Column(name = "nom_Unversite")
    private String nomuniversite;
    private String adresse;
    @OneToOne(cascade = CascadeType.ALL)
     private Foyer foyers;



}
