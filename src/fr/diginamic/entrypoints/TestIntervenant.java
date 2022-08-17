package fr.diginamic.entrypoints;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie s = new Salarie("El Bilaz", "Ilias", 1905.47f);
		Pigiste p = new Pigiste("Calista", "Veronique", (byte)11, 150.0f);
		
		System.out.println("____ Affichage élémentaire");
		System.out.println("Salaire de " + s.getPrenom() + " " + s.getNom().toUpperCase() 
				+ " : " + s.getSalaire() + " €");
		System.out.println("Salaire de " + p.getPrenom() + " " + p.getNom().toUpperCase() 
				+ " : " + p.getSalaire() + " €");
		
		System.out.println("\n____ Affichage générique - methode abstraite afficherDonnees()");
		s.afficherDonnees();
		p.afficherDonnees();
	}
}
