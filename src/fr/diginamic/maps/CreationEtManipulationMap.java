package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String args[]) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		// Ajout d'un couple de clé-valeur
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Affichage de mes départements (clés de ma HashMap)
		System.out.print("Départements (clés) : [");
		Iterator<Integer> iterDep = mapVilles.keySet().iterator();
		while (iterDep.hasNext()) {
			int dep = iterDep.next();
			if (iterDep.hasNext()) {
				System.out.print(dep + ", ");
			} else {
				System.out.println(dep + "]");
			}
		}

		// Affichage de mes villes (valeurs de ma HashMap)
		System.out.print("Villes (valeurs) : [");
		Iterator<String> iterVilles = mapVilles.values().iterator();
		while (iterVilles.hasNext()) {
			String ville = iterVilles.next();
			if (iterVilles.hasNext()) {
				System.out.print(ville + ", ");
			} else {
				System.out.println(ville + "]");				
			}
		}

		System.out.println("\nMa HashMap de taille " + mapVilles.size() + " : \n" + mapVilles);

	}

}
