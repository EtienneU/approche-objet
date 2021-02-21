package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestPaysAvecEnum {

	public static void main(String[] args) {

		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 	65f, 	Continent.EUROPE));
		listePays.add(new Pays("Allemagne", 80f, 	Continent.EUROPE));
		listePays.add(new Pays("Belgique", 	10f, 	Continent.EUROPE));
		listePays.add(new Pays("Russie", 	150f, 	Continent.ASIE));
		listePays.add(new Pays("Chine", 	1_400f, Continent.ASIE));
		listePays.add(new Pays("Indonésie", 220f, 	Continent.OCEANIE));
		listePays.add(new Pays("Australie", 20f, 	Continent.OCEANIE));
		listePays.add(new Pays("Pérou", 	32f, 	Continent.AMERIQUE));
		
		// Affichage de tous les pays de ma liste
		for (Pays p : listePays) {
			System.out.println(p);
		}
		
		// Affichage du nombre de pays de ma liste par continent - via hashmap
		HashMap<Continent, Integer> paysParContinent = new HashMap<>();
		for (int i = 0; i < listePays.size(); i++) {
			
			Pays pays = listePays.get(i);
			Continent continent = pays.getContinent();
			Integer compteur = paysParContinent.get(continent);
			
			// Si le compteur n'existe pas, je le créé et l'initialise à 1
			if (compteur == null) {
				compteur = 1;
			}
			// sinon je l'incrémente de 1
			else {
				compteur++;
			}
			// Je restocke la nouvelle valeur du compteur
			paysParContinent.put(continent, compteur);
		}
		
		// Affichage du comptage par l'affichage direct de la hashMap
		System.out.println("\nNombre de pays par continent : " + paysParContinent);
		
		// Affichage du comptage via un iterator qui parcourt ma hashMap
		System.out.print("\nNombre de pays par continent : \n");
		Iterator<Continent> iterPaysContinent = paysParContinent.keySet().iterator();
		while (iterPaysContinent.hasNext()) {
			Continent continent = iterPaysContinent.next();
			System.out.print(continent.getLibelle() + " : " + paysParContinent.get(continent) + "\n");
		}
	}
}
