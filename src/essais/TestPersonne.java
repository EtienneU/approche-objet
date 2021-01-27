package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p1 = new Personne("Sofiane", "Boussaïma",
				new AdressePostale(13, "Route Miriade", "34090", "Montpellier"));

		Personne p2 = new Personne("Sophie", "Clio",
				new AdressePostale(209, "Impasse DuGueclin", "34090", "Montpellier"));
		
	}

}
