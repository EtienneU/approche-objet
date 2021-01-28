package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private float taux;

	public CompteTaux(String numero, float solde, float taux) {
		super(numero, solde);
		this.taux = taux;
	}

	@Override
	public String toString() {
		String compte = super.toString();
		return compte + " Taux = " + taux + " %";
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	
}
