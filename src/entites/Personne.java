package entites;

public class Personne {

	public String 			nom;
	public String 			prenom;
	public AdressePostale 	adressePostale;

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom; 
		this.adressePostale = adressePostale;
	}
}
