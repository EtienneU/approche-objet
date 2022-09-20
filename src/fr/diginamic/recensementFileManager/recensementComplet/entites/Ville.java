package fr.diginamic.recensementFileManager.recensementComplet.entites;

public class Ville extends Lieu {
	
	private Region region;
	private Departement dep;
	private Pays pays;
	
	public Ville (String code, String nom, Departement dep, Region region, int population, Pays pays) {
		super(nom, code);
		this.region = region;
		this.dep = dep;
		this.population = population;
		this.pays = pays;
		this.dep.ajoutVille(this);
		this.region.ajoutVille(this);
		this.pays.ajoutVille(this);
	}

}
