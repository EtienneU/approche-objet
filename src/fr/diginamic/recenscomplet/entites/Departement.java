package fr.diginamic.recenscomplet.entites;

import java.util.ArrayList;
import java.util.List;

public class Departement extends Lieu {
	
	// �l�ments propres � notre d�partement
	private Region region;
	private Pays pays;
	
	public Departement(String code, String nom, Region region, Pays pays) {
		super(nom, code);
		this.region = region;
		this.pays = pays;
		this.pays.ajoutDep(this);
	}
	
	// m�thode d'ajout d'une ville aux attributs de mon d�partement
	public void ajoutVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
	
}
