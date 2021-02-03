package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {
	
	private String nom;
	private int nbHab;
	
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	@Override
	public String toString() {
		return "\n" + nom + " : " + nbHab + " hab";
	}
	
	@Override
	public int compareTo(Ville autreVille) {
		// tri par ordre alphab�tique --> Appel � la m�thode compareTo() de String
//		return this.nom.compareTo(autreVille.getNom());
		
		if (this.getNbHab() > autreVille.getNbHab()) {
			return 1;
		}
		if (this.getNbHab() < autreVille.getNbHab()) {
			return -1;
		} 
		return 0;
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
