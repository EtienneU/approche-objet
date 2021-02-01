package fr.diginamic.entites;

public class Spectacle {

	private String nom;
	private String type;  // concert, comédie, improvisation ou danse
	private double tarif; // unitaire
	private int capaciteMax;
	private int nbInscrits;
	
	public Spectacle(String nom, String type, double tarif, int capaciteMax, int nbInscrits) {
		super();
		this.nom = nom;
		this.type = type;
		this.tarif = tarif;
		this.capaciteMax = capaciteMax;
		this.nbInscrits = nbInscrits;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNbInscrits() {
		return nbInscrits;
	}

	public void setNbInscrits(int nbInscrits) {
		this.nbInscrits = nbInscrits;
	}
	
}
