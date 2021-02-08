package entites;

public class Personne {

	public String 			nom;
	public String 			prenom;
	public AdressePostale 	adressePostale;

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom; 
		this.adressePostale = adressePostale;
		System.out.println("Nouvelle personne créée");
	}
	
	public void afficheIdentite() {
		System.out.println(this.prenom + " " + this.nom.toUpperCase());
	}
	
	public void setNom(String newNom) {
		this.nom = newNom;
	}
	
	public void setPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}
	
	public void setAdressePostale(AdressePostale newAdresse) {
		this.adressePostale = newAdresse;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdressePostale() {
		return this.adressePostale;
	}
	
}
