package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

	@Override
	public String getStatut() {
		return "Salarié";
	}

}
