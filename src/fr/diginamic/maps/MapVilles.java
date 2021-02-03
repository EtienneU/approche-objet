package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		
		ArrayList<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(new Ville("Nice", 343_000));
		listeVilles.add(new Ville("Carcassonne", 47_800));
		listeVilles.add(new Ville("Narbonne", 53_400));
		listeVilles.add(new Ville("Lyon", 484_000));
		listeVilles.add(new Ville("Foix", 9_700));
		listeVilles.add(new Ville("Pau", 77_200));
		listeVilles.add(new Ville("Marseille", 850_700));
		listeVilles.add(new Ville("Tarbes", 40_600));

		HashMap<String, Ville> mapVilles = new HashMap<>();
		
		// Insertion de mes couples Nom-Ville dans ma HashMap
		for (Ville v : listeVilles) {
			mapVilles.put(v.getNom(), v);
		}
		
		// Recherche et suppression de la ville la moins peuplée
		Iterator<String> iterVilles = mapVilles.keySet().iterator();
		String villeMinHab = iterVilles.next(); // 1er élément de mon iterator = 1er clé de ma map
		while (iterVilles.hasNext()) {
			String ville = iterVilles.next();
			if (mapVilles.get(ville).getNbHab() <= mapVilles.get(villeMinHab).getNbHab()) {
				villeMinHab = ville;
			}
		}
		// S'assurer que l'on place en paramètre la clé et non pas la valeur
		System.out.println("Suppression de " + villeMinHab + "\n");
		mapVilles.remove(villeMinHab); 
		
		// Affichage des villes ma HashMap
		System.out.print("HashMap mapVilles : [".toUpperCase());
		iterVilles = mapVilles.keySet().iterator();
		while (iterVilles.hasNext()) {
			String v = iterVilles.next();
			if (iterVilles.hasNext()) {
				System.out.print(mapVilles.get(v) + ", ");
			} else {
				System.out.println(mapVilles.get(v) + "]");
			}
		}
	}

}
