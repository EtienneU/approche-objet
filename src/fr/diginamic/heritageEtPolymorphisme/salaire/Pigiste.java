package fr.diginamic.heritageEtPolymorphisme.salaire;

public class Pigiste extends Intervenant {
	private byte nbrJoursTravailMensuel;
	private float tauxJournalier;

	public Pigiste(String nom, String prenom, byte nbrJoursTravailMensuel, float tauxJournalier) {
		super(nom, prenom);
		this.nbrJoursTravailMensuel = nbrJoursTravailMensuel;
		this.tauxJournalier = tauxJournalier;
	}

	@Override
	public float getSalaire() {
		return nbrJoursTravailMensuel * tauxJournalier;
	}

	@Override
	public String getStatut() {
		return "Pigiste";
	}
}
