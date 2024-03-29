package fr.diginamic.entites;

public class Salarie {
	
	private String nom;
	private String prenom;
	private float salaire;
	
	public Salarie(String nom, String prenom, float salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Salarié : [Nom = " + nom.toUpperCase() + ", Prenom = " + prenom + ", Salaire = " + salaire + " €/mois]";
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

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

}
