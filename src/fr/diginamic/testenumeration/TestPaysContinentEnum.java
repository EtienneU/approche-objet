package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestPaysContinentEnum {

	public static void main(String[] args) {

		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("Portugal", 	10.3f, 	Continent.EUROPE));
		listePays.add(new Pays("Allemagne", 80f, 	Continent.EUROPE));
		listePays.add(new Pays("Belgique", 	10f, 	Continent.EUROPE));
		listePays.add(new Pays("Japon", 	128.8f, 	Continent.ASIE));
		listePays.add(new Pays("Chine", 	1_400f, Continent.ASIE));
		listePays.add(new Pays("Indonesie", 220f, 	Continent.OCEANIE));
		listePays.add(new Pays("Australie", 20f, 	Continent.OCEANIE));
		listePays.add(new Pays("Perou", 	32f, 	Continent.AMERIQUE));
		listePays.add(new Pays("Gabon", 	2.3f, 	Continent.AFRIQUE));


		// Affichage de tous les pays de ma liste
		for (Pays p : listePays) {
			System.out.println(p);
		}
		
		// Affichage du nombre de pays de ma liste par continent - via une HashMap
		HashMap<Continent, Integer> nombrePaysParContinent = new HashMap<>();
		for (Pays pays : listePays) {
			Continent continent = pays.getContinent();
			Integer compteur = nombrePaysParContinent.get(continent);

			// Si le compteur est null je l'initialise à 1, sinon je l'incrémente de 1
			if (compteur == null) {
				compteur = 1;
			}
			//
			else {
				compteur++;
			}

			// Je restocke la nouvelle valeur du compteur (Mise à jour)
			nombrePaysParContinent.put(continent, compteur);
		}

		// Affichage du comptage par l'affichage direct de la hashMap
		System.out.println("\nNombre de pays par continent (affichage par defaut) : " + nombrePaysParContinent);
		
		// Affichage du comptage via un iterator qui parcourt ma hashMap
		System.out.print("\nNombre de pays par continent (affichage personnalise) : \n");
		Iterator<Continent> iterPaysContinent = nombrePaysParContinent.keySet().iterator();
		while (iterPaysContinent.hasNext()) {
			Continent continent = iterPaysContinent.next();
			System.out.print(continent.getLibelle() + " : " + nombrePaysParContinent.get(continent) + "\n");
		}
	}
}
