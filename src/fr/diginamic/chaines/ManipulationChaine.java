package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;
import fr.diginamic.utils.SalarieFactory;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine1 = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractère : " + chaine1.charAt(0));
		System.out.println("Longueur de la chaine : " + chaine1.length() + " caractère(s)");
		System.out.println("Index du 1er ';' : " + chaine1.indexOf(';'));
		System.out.println("Nom de famille (MAJ): " + chaine1.substring(0, chaine1.indexOf(';')).toUpperCase());
		System.out.println("Nom de famille (min): " + chaine1.substring(0, chaine1.indexOf(';')).toLowerCase());

		String[] tabSplit = chaine1.split(";"); 	
		System.out.print("tabSplit : [");
		for (int i = 0; i < tabSplit.length; i++) {
			if (i == tabSplit.length - 1) {
				System.out.println(tabSplit[i] + "]");
			} else {
				System.out.print(tabSplit[i] + ", ");
			}
		}
		
		Salarie s1 = new Salarie(tabSplit[0], tabSplit[1], Double.parseDouble(tabSplit[2].replace(" ", "")));
		System.out.println(s1.toString());
		
		// Avec une méthode Factory
		String chaine2 = "garcia;Sophie;3 1 0 1. 0";
		Salarie s2 = SalarieFactory.createSalarie(chaine2);
		System.out.println(s2.toString());

	}

}
