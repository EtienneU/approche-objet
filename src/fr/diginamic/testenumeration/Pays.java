package fr.diginamic.testenumeration;

public class Pays {
	
	private String nom;
	private float nbrHab;
	private Continent continent;
	
	public Pays(String nom, float nbrHab, Continent continent) {
		this.nom = nom;
		this.nbrHab = nbrHab;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + ", " + nbrHab + " millions d'habitants, continent : " + continent.getLibelle();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getNbrHab() {
		return nbrHab;
	}

	public void setNbrHab(int nbrHab) {
		this.nbrHab = nbrHab;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
