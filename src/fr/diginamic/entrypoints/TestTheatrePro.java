package fr.diginamic.entrypoints;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		
		Spectacle[] tabSpectacles = new Spectacle[] {
				new Spectacle("Chromatica", 			"concert", 			190d,	700, 113),
				new Spectacle("La Cantatrice Chauve", 	"comédie", 			25d, 	350, 345),
				new Spectacle("Fluides", 				"danse", 			53d,	420, 290),
				new Spectacle("Jeux de Maux", 			"improvisation", 	19d, 	200, 159),
				new Spectacle("Nora Tour", 				"concert", 			48d, 	829, 767),
				new Spectacle("Faux Amis", 				"comédie", 			21d, 	245, 27	)
		};

		TheatrePro thPro = new TheatrePro("L'Autruche à Bulles", tabSpectacles);
		thPro.afficheAll();
		thPro.ajouterSpectacle(new Spectacle("Tadayoshi", "danse", 58d, 318, 47));
		
		// Test methode getSpectacle(String nom)
		Spectacle spec = thPro.getSpectacle("Nora Tour");
		System.out.println("\nIl reste " + (spec.getCapaciteMax() - spec.getNbInscrits()) + " place(s) "
				+ "pour le spectacle " + spec.getNom().toUpperCase());
		
		// Test methode inscrire(int nbClients, String nom)
		thPro.inscrire(25, "La Cantatrice Chauve"); // avec erreur "dépassement de capacité"
		thPro.inscrire(4,  "Les Misérables"); 		// avec erreur "Spectacle introuvable"
		thPro.inscrire(45, null); 					// avec erreur "spectacle = null"
		thPro.inscrire(7,  "Jeux de Maux"); 		// sans erreur
		thPro.afficheAll();
		
		System.out.println("Recette totale du théâtre " + thPro.getNom().toUpperCase() + " : "
				+  thPro.getRecetteTotale() + " €");
		
		
		// Je teste l'affichage pour un théatre qui ne propose pas de spectacle
		TheatrePro thProNul = new TheatrePro("Silence Revolver", null);
		thProNul.afficheAll();
		System.out.println("Recette totale du théâtre " + thProNul.getNom().toUpperCase() + " : "
				+  thProNul.getRecetteTotale() + " €");

	}
}
