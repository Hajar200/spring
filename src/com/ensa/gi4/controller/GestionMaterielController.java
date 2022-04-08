package com.ensa.gi4.controller;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;

public class GestionMaterielController {
	 //dependancy:(injection du dependance)
    private GestionMaterielService gestionMaterielService;
    private Materiel m;
    //lister les materiaux
    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }
    //ajouter un materiel
    public void ajouterNouveauMateriel(Materiel materiel) {
        gestionMaterielService.ajouterNouveauMateriel(materiel);
    }
    
    //supprimer un materiel
    public void supprimerMateriel(String name,String materiel) {
    	gestionMaterielService.supprimerMateriel(name, materiel);
    }
    
    public void afficherMenu() {
        System.out.println("1- pour lister le matériel, entrer 1");
        System.out.println("2- pour ajouter un nouveau matériel, entrer 2");
        System.out.println("2- pour supprimer un nouveau matériel, entrer 3");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {
       	 System.out.println("1- pour livre, entrer 1");
         System.out.println("2- pour chaise, entrer 2");
    	 Scanner sc = new Scanner(System.in);
         String materiel = sc.next();
         if("1".equals(materiel)) {
        	 Livre livre=new Livre();
        	 ajouterNouveauMateriel(livre);
         }else if("2".equals(materiel)){
        	 Chaise chaise=new Chaise();
        	 ajouterNouveauMateriel(chaise);
         }
         
        }else if("3".equals(next)) {
             //Materiel ma = null;
             //ma.setName(mat);
        	 //supprimerMateriel(ma);
             
             System.out.println("1- pour livre, entrer 1");
             System.out.println("2- pour chaise, entrer 2");
             Scanner scan = new Scanner(System.in);
             String mat = scan.next();
             System.out.println("Donner le nom du materiel a supprimer");
             Scanner scann = new Scanner(System.in);
             String name = scann.next();
             if ("1".equals(mat)) {
            	 supprimerMateriel(name, "Livre");
             }else if("2".equals(mat)) {
                 supprimerMateriel(name, "Chaise");
             }
        } 
        
        else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}
