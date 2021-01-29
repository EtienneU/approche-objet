package fr.diginamic.banque.utils;

public abstract class Operation {
	
	private String 	date;
	private float 	montant;
	
	public Operation(String date, float montant) {
		this.date = date;
		this.montant = montant;
//		System.out.println("Opération réalisée");
	}
	
	public abstract String afficherType();

	public String getDate() {
		return date;
	}

	public void setDate(String dateRealisation) {
		this.date = dateRealisation;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

}
