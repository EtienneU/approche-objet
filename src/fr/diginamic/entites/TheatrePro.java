package fr.diginamic.entites;

public class TheatrePro {

	private String nom;
	private Spectacle[] tabSpectacles;

	public TheatrePro(String nom, Spectacle[] tabSpectacles) {
		super();
		this.nom = nom;
		this.tabSpectacles = tabSpectacles;
	}

	public void ajouterSpectacle(Spectacle spectacle) {
		Spectacle[] temp = new Spectacle[tabSpectacles.length + 1];
		for (int i = 0; i < tabSpectacles.length; i++) {
			temp[i] = tabSpectacles[i];
		}
		temp[temp.length - 1] = spectacle;
		tabSpectacles = temp;
	}

	public Spectacle getSpectacle(String nom) {
		for (int i = 0; i < tabSpectacles.length; i++) {
			if (tabSpectacles[i].getNom().equals(nom)) {
				return tabSpectacles[i];
			}
		}
		System.out.println("Aucun spectacle intitulé '" + nom + "'");
		return null;
	}

	public void afficheAll() {
		if (tabSpectacles == null || tabSpectacles.length == 0) {
			System.out.println("\nLe théâtre " + nom.toUpperCase() + " ne propose pas encore de spectacle...");
		} else if (tabSpectacles.length == 1) {
			System.out.println("\nLe théâtre " + nom.toUpperCase() + " propose 1 spectacle : \n - ");
			tabSpectacles[0].afficheData();
		} else {
			System.out.println(
					"\nLe théâtre " + nom.toUpperCase() + " propose " + tabSpectacles.length + " spectacles :\n");
			for (int i = 0; i < tabSpectacles.length; i++) {
				System.out.print(" " + (i + 1) + ". ");
				tabSpectacles[i].afficheData();
			}
		}
	}

	public void inscrire(int nbClients, String nom) {
		if (nom == null) {
			System.out.println("ERREUR - Aucun nom de spectacle saisi... Reessayer.");
		} else {
			Spectacle spec = null;
			for (int i = 0; i < tabSpectacles.length; i++) {
				if (tabSpectacles[i].getNom().equals(nom)) {
					spec = tabSpectacles[i];
					if (nbClients > tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits()) {
						System.out.println("ERREUR - Inscription de " + nbClients
								+ " clients non réalisée (capacité dépassée). " + "Réessayer avec moins de "
								+ (tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits())
								+ " réservations.");
					} else {
						tabSpectacles[i].setNbInscrits(tabSpectacles[i].getNbInscrits() + nbClients);
					}
				}
			}
			if (spec == null) {
				System.out.println("ERREUR - " + nom.toUpperCase() + " n'est pas un spectacle proposé par "
						+ this.getNom().toUpperCase());
			}
		}
	}
	
	public double getRecetteTotale() {
		double somme = 0;
		if (this.getTabSpectacles() == null) {
			System.out.println("ERREUR - Aucun tableau de spectacles renseigné.");
			return 0;
		}
		for (int i = 0; i < tabSpectacles.length; i++) {
			somme += tabSpectacles[i].getTarif() * tabSpectacles[i].getNbInscrits();
		}
		return somme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Spectacle[] getTabSpectacles() {
		return tabSpectacles;
	}

	public void setTabSpectacles(Spectacle[] tabSpectacles) {
		this.tabSpectacles = tabSpectacles;
	}

}
