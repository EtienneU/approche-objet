package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public abstract String getStatut();
	
	public void afficherDonnees() {
		System.out.println(this.getPrenom() + " " + this.getNom().toUpperCase() + " - Salaire " + this.getSalaire()
		+ " € - Statut : " + this.getStatut());
		// mieux que this.getClass().getSimpleName()
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
