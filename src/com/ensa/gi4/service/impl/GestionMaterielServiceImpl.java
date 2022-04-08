package com.ensa.gi4.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here
	ArrayList<Chaise> chaises;
	ArrayList<Livre> livres;
    public GestionMaterielServiceImpl(){
    init();	
    }

    @Override
    public void init() {
       System.out.println("inititialisation du service");
    	chaises = new ArrayList<>();
    	livres = new ArrayList<>();
    }

    
    @Override
    public void listerMateriel() {
        System.out.println("Liste de matériel :\n" + chaises.size() + " chaises"+"\n"+livres.size()+ " livres");
    	
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        // à completer
    	System.out.println("entrer le nom du materiel");
    	Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        materiel.setName(s);
    	if(materiel instanceof Chaise) {
    		
    		chaises.add((Chaise) materiel);

    	}
    	else if(materiel instanceof Livre) {
    		
    		livres.add((Livre) materiel);
    	}
    	System.out.println("L'ajout du materiel " + materiel.getName() + " effectuer avec succes !");
    }

	@Override
	public void chercherMateriel(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void supprimerMateriel(String name, String type) {
		if(type.equals("Livre")) {
			Livre livre=null;
			if(livres.size()==0) {
				System.out.println("pas des livres");
			}else {
				for (Livre l : livres) {
					
				      if(l.getName().equals(name)) {
				    	livre=l;
				      }
				    }
				if(livre==null) {
					System.out.println("ce livre n'existe pas");
				}else {
					livres.remove(livre);	
				}	
				}
			}
		
			else if(type.equals("Chaise")) {
			Chaise ch=new Chaise();
			if(livres.size()==0) {
				System.out.println("pas des chaises");
			}else {
				for (Chaise c : chaises) {
				      if(ch.getName().equals(name)) {
				    	ch=c;
				      }
				    }
				if(ch==null) {
					System.out.println("ce chaise n'existe pas");
				}else {
					chaises.remove(ch);	
				}	
				}
			}	
	}
	

		

	@Override
	public void modifierMateriel(Materiel materiel) {
		
		
	}

	
}
