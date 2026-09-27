package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;
    private Double tarifJournalier;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
}