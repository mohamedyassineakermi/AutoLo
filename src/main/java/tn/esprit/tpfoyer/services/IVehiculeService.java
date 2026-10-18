package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long vehiculeId);
    Vehicule addVehicule(Vehicule v);
    Vehicule modifyVehicule(Vehicule v);
    void removeVehicule(Long vehiculeId);
}