package fr.diginamic.testenumeration;

public enum Continent {
	
	EUROPE 		("Europe"),
	ASIE   		("Asie"),
	AMERIQUE 	("Amerique"),
	OCEANIE 	("Oceanie"),
	AFRIQUE 	("Afrique");

	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
	
}
