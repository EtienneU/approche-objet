package fr.diginamic.testenumeration;

import java.util.HashSet;
import java.util.Set;

public enum Saison {
	
	PRINTEMPS	("Printemps",	(byte)1),
	ETE			("Eté", 		(byte)2),
	AUTOMNE		("Automne", 	(byte)3),
	HIVER		("Hiver", 	(byte)4);

	private String libelle;
	private byte ordre;

	// Le constructeur est implicitement d'accès 'private'
	Saison(String libelle, byte ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/**
	 * Retourne l'instance de Saison qui correspond exactement au libelle passe en parametre
	 * @param libelle le libelle saisi
	 * @return l'instance de l'enum qui correspond au libelle
	 */
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

	/**
	 * retourne la liste des instances de l'enum dont le libelle contient le terme passe en paramtre
	 * @param term le terme de la recherche
	 * @return la liste des Saison (enum) qui comporte
	 */
	public static Set<Saison> findAll(String term) {
		Set<Saison> saisonsResultSet = new HashSet<>();
		for (Saison saison: Saison.values()) {
			if (saison.getLibelle().toLowerCase().contains(term.toLowerCase())) {
				saisonsResultSet.add(saison);
			}
		}
		return saisonsResultSet;
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
