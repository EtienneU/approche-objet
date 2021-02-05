package fr.diginamic.recenscomplet.entites;

import java.util.ArrayList;
import java.util.List;

public class Pays extends Lieu {

	private List<Lieu> listeDep 	= new ArrayList<>();
	private List<Lieu> listeRegion 	= new ArrayList<>();
	
	public Pays(String code) {
		super(code, code);
	}
	
	public void ajoutVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
	
	public void ajoutDep(Departement dep) {
		this.listeDep.add(dep);
	}
	
	public void ajoutRegion(Region region) {
		this.listeRegion.add(region);
	}

	public List<Lieu> getListeDep() {
		return listeDep;
	}

	public List<Lieu> getListeRegion() {
		return listeRegion;
	}

}
