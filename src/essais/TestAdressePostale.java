package essais;

import entites.AdressePostale;

public class TestAdressePostale {
	
	
	public static void main (String[] args) {
		
		AdressePostale a1 = new AdressePostale(1044, "Chemin du Paradis", "69004", "Lyon");
		
		AdressePostale a2 = new AdressePostale(355, "Route du Sommeil", "84000", "Avignon");
		
		System.out.println(a1); 	// appel de la méthode toString()
		a1.afficheAdressePostale(); // appel de ma méthode afficheAdressePostale()
		
	}
	
}
