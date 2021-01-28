package fr.diginamic.banque.utils;

public class Credit extends Operation {

	public Credit(String date, float montant) {
		super(date, montant);
	}
	
	public String afficherType() {
		return "Credit";
	}

}
