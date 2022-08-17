package fr.diginamic.entites;

/**
 * @author Etienne Urbano
 *
 */
public class Theatre {

	private String 	nom;
	private short	nbrCapacite; // avec le type short je ne dépasse pas 32767 (ça me semble correct pour un théâtre)
	private short	nbrInscrits;
	private float	recette = 0;
	
	public Theatre(String nom, short nbrCapacite, short nbrInscrits, float recette) {
		this.nom = nom;
		this.nbrCapacite = nbrCapacite;
		this.nbrInscrits = nbrInscrits;
		this.recette = recette;
	}
	
	public void inscrire(short nbrClients, float prixPlace) {
		if (nbrInscrits + nbrClients > nbrCapacite) {
			System.err.println("Inscription de " + nbrClients 
					+ " clients impossible. Capacité d'accueil dépassée."
					+ " Reessayer avec moins de " + (nbrCapacite - nbrInscrits) + " inscriptions.");
		} else {
			System.out.print("Inscription de " + nbrClients + " client(s) supplémentaires. ");
			nbrInscrits += nbrClients;
			if ((nbrCapacite - nbrInscrits) <= 1) {
				System.out.println("Il reste " + (nbrCapacite - nbrInscrits) + " place.");
			} else {
				System.out.println("Il reste " + (nbrCapacite - nbrInscrits) + " places.");
			}
			recette += nbrClients * prixPlace;
		}
	}
	
	public void affichageEtat() {
		System.out.println("Theatre \"" + nom + "\" : " + nbrInscrits + " spectareur(s) inscrit(s).\n"
				+ "Capacité : " + nbrCapacite + " places. " + (nbrCapacite - nbrInscrits) + " places restantes.\n"
				+ "Recette actuelle : " + recette + " €\n");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public short getNbrCapacite() {
		return nbrCapacite;
	}

	public void setNbrCapacite(short nbrCapacite) {
		this.nbrCapacite = nbrCapacite;
	}

	public short getNbrInscrits() {
		return nbrInscrits;
	}

	public void setNbrInscrits(short nbrInscrits) {
		this.nbrInscrits = nbrInscrits;
	}

	public float getRecette() {
		return recette;
	}

	public void setRecette(float recette) {
		this.recette = recette;
	}
	
}
