package fr.diginamic.banque.entites;

public class Compte {
	
	private String numero; // je fais le choix du type long pour saisir un grand numéro 
	private float solde;
	
	public Compte(String numero, float solde) {
		this.numero = numero;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [n° " + numero + " - solde = " + solde + " €]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	

}
