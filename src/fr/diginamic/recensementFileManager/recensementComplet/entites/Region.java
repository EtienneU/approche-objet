package fr.diginamic.recensementFileManager.recensementComplet.entites;

import java.util.ArrayList;
import java.util.List;

public class Region extends Lieu {

	// liste de département propres à notre Region
	private List<Lieu> listeDep = new ArrayList<>();
	private Pays pays; 

	public Region(String code, String nom, Pays pays) {
		super(nom, code);
		this.pays = pays;
		this.pays.ajoutRegion(this);
	}
	
	public void ajoutVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
	
	public void ajoutDep(Departement dep) {
		this.listeDep.add(dep);
	}

}
