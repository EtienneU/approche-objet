package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie s = new Salarie("Calista", "Veronique", 1905.47);
		Pigiste p = new Pigiste("El Bilaz", "Ilias", (byte)11, 150.0d);
		
		System.out.println("____ Affichage simple");
		System.out.println("Salaire de " + s.getPrenom() + " " + s.getNom().toUpperCase() 
				+ " : " + s.getSalaire() + " €");
		System.out.println("Salaire de " + p.getPrenom() + " " + p.getNom().toUpperCase() 
				+ " : " + p.getSalaire() + " €");
		
		System.out.println("\n____ Affichage générique - methode abstraite afficherDonnees()");
		s.afficherDonnees();
		p.afficherDonnees();
	}

}
