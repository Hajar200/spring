package com.ensa.gi4.service.api;

import java.util.ArrayList;
import java.util.List;

import com.ensa.gi4.modele.Materiel;

public interface GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Materiel materiel);
    void chercherMateriel(int id);
    void modifierMateriel(Materiel materiel);
	void supprimerMateriel(String name, String type);
}
