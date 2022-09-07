package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {
	private String nom;
	private int nbHab;
	
	public Ville(String nom, int nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	@Override
	public String toString() {
		return "\n" + nom + " : " + nbHab + " hab";
	}
	
	@Override
	public int compareTo(Ville autreVille) {
		// tri par ordre alphabétique --> Appel à la méthode compareTo() de String
//		return this.nom.compareTo(autreVille.getNom());
		
		if (this.getNbHab() > autreVille.getNbHab()) {
			return 1;
		}
		if (this.getNbHab() < autreVille.getNbHab()) {
			return -1;
		} 
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville) obj;
		return (this.nom.equals(autre.getNom()) && this.getNbHab() == autre.getNbHab()) ;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHab() {
		return nbHab;
	}
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

}
