package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne("Boussaïma", "Sofiane",
				new AdressePostale(13, "Route Miriade", "34090", "Montpellier"));

		Personne p2 = new Personne("Clio", "Nathalie", 
				new AdressePostale(209, "Impasse DuGueclin", "34090", "Montpellier"));
		
		p1.afficheIdentite();
		p2.afficheIdentite();
		
		p2.setNom("Carthier");
		p2.afficheIdentite();	
		
		p1.setPrenom("Souhaib");
		p1.afficheIdentite();
		
		p1.setAdressePostale(new AdressePostale(444, "Chemin du Vieil Arbre", "84200", "Carpentras"));
		p1.adressePostale.afficheAdressePostale();
		
		// avec méthode afficheAdressePostale
		System.out.print("p2 : " + p2.getPrenom() + " " + p2.getNom().toUpperCase() + " | adresse : ");
		p2.adressePostale.afficheAdressePostale();
		
		// avec méthode getAdressePostale
		System.out.println("p1 : " + p1.getPrenom() + " " + p1.getNom().toUpperCase() 
				+ " | adresse : " + p1.adressePostale.getAdressePostale()); 
		
		// avec méthode toString (implicite)
		System.out.print("p1 : " + p1.getPrenom() + " " + p1.getNom().toUpperCase() + " | adresse : ");	
		System.out.println(p1.adressePostale);
	}
}
