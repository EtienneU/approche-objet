package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private float salaire;

	public Salarie(String nom, String prenom, float salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public float getSalaire() {
		return salaire;
	}

	@Override
	public String getStatut() {
		return "Salarié";
	}

}
