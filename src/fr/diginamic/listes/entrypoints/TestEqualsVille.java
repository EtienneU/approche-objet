package fr.diginamic.listes.entrypoints;

import fr.diginamic.listes.Ville;

public class TestEqualsVille {

	public static void main(String[] args) {

		Ville v1 = new Ville("Winterfell", 568);
		Ville v2 = new Ville("Winterfell", 568);
		Ville v3 = v2;
		System.out.println("v1.equals(v2) vaut " + v1.equals(v2));
		System.out.println("v1 == v2 vaut " + (v1 == v2)); 
		// false car v1 et v2 pointent vers des emplacements mémoire différents		
		System.out.println("v2 == v3 vaut " + (v2 == v3));

	}

}
