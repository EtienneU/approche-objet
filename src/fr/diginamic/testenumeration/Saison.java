package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS	("Printemps",	(byte)1),
	ETE			("Eté", 		(byte)2),
	AUTOMNE		("Automne", 	(byte)3),
	HIVER		("Hiver", 		(byte)4);
	
	private String libelle;
	private byte ordre;
	
	private Saison(String libelle, byte ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}
	
	public static Saison find(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison s : saisons) {
			if (s.getLibelle().equals(libelle)) {
				return s;
			}
		}
		return null;
//		return new NoResultException("Aucune saison trouvée avec le libellé '" + libelle + "'");
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public byte getOrdre() {
		return ordre;
	}

	public void setOrdre(byte ordre) {
		this.ordre = ordre;
	}

}
