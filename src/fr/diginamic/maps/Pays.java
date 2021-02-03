package fr.diginamic.maps;

public class Pays {
	
	private String nom;
	private float nbrHab;
	private String continent;
	
	public Pays(String nom, float nbrHab, String continent) {
		this.nom = nom;
		this.nbrHab = nbrHab;
		this.continent = continent;
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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
