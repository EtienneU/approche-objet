package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;
import fr.diginamic.utils.SalarieFactory;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		// Prise en main des méthodes basiques de String Class
		String chaine1 = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractère : " 		+ chaine1.charAt(0));
		System.out.println("Longueur de la chaine : " 	+ chaine1.length() + " caractère(s)");
		System.out.println("Index du 1er ';' : " 		+ chaine1.indexOf(';'));
		System.out.println("NOM DE FAMILLE (MAJ): " 	+ chaine1.substring(0, chaine1.indexOf(';')).toUpperCase());
		System.out.println("Nom de famille (min): " 	+ chaine1.substring(0, chaine1.indexOf(';')).toLowerCase());

		// Affichage du tableau résultant du split()
		String[] tabSplit = chaine1.split(";"); 	
		System.out.print("\ntabSplit : [");
		for (int i = 0; i < tabSplit.length; i++) {
			if (i == tabSplit.length - 1) {
				System.out.println(tabSplit[i] + "]");
			} else {
				System.out.print(tabSplit[i] + ", ");
			}
		}
		
		// Exemple de construction d'un objet à partir des éléments de mon tableau split()
		Salarie s1 = new Salarie(tabSplit[0], tabSplit[1], Float.parseFloat(tabSplit[2].replace(" ", "")));
		// Appel implicite a la methode toString() de l'objet s1
		System.out.println("\n" + s1);
		
		// De même avec une Factory et une méthode de construction 
		String chaine2 = "garcia;Sophie;3 1 0 1. 0";
		Salarie s2 = SalarieFactory.createSalarie(chaine2);
		// Appel implicite a la methode toString() de l'objet s2
		System.out.println(s2);
	}
}
