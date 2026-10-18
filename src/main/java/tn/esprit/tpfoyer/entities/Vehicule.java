package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Agence agence;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    private List<Maintenance> maintenances;

    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;
}
