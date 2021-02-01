package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private byte nbrJoursTravailMensuel;
	private double tauxJournalier;

	public Pigiste(String nom, String prenom, byte nbrJoursTravailMensuel, double tauxJournalier) {
		super(nom, prenom);
		this.nbrJoursTravailMensuel = nbrJoursTravailMensuel;
		this.tauxJournalier = tauxJournalier;
	}

	@Override
	public double getSalaire() {
		return nbrJoursTravailMensuel * tauxJournalier;
	}

	@Override
	public String getStatut() {
		return "Pigiste";
	}

}
