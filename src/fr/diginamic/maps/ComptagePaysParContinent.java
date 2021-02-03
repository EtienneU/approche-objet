package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 65f, "Europe"));
		listePays.add(new Pays("Allemagne", 80f, "Europe"));
		listePays.add(new Pays("Belgique", 10f, "europe"));
		listePays.add(new Pays("Russie", 150f, "Asie"));
		listePays.add(new Pays("Chine", 1_400f, "ASIE"));
		listePays.add(new Pays("Indon�sie", 220f, "Oceanie"));
		listePays.add(new Pays("Australie", 20f, "OCEanie"));
		listePays.add(new Pays("P�rou", 32f, "Amerique du Sud"));
		
		HashMap<String, Integer> paysParContinent = new HashMap<>();
				
		// Je parcours ma liste de Pays pour compter combien il y en a par continent
		for (int i = 0; i < listePays.size(); i++) {
			
			Pays pays = listePays.get(i); // pays courant (celui � l'indice i de la listePays)
			String continent = pays.getContinent().toUpperCase(); // r�cup�ration de son attribut continent
			
			// Je check dans ma Hashmap si le compteur pour le continent du Pays courant 
			// a �t� initialis� ou non (null)
			Integer compteur = paysParContinent.get(continent);
			
			// Si le compteur n'existe pas, je le cr�� et l'initialise � 1
			if (compteur==null) {
				compteur = 1;
			}
			else {
				// S'il existe je l'incr�mente de 1
				compteur++;
			}
			// Je restocke la nouvelle valeur du compteur
			paysParContinent.put(continent.toUpperCase(), compteur);
		}
		
		// Affichage du comptage
		System.out.println("Nombre de pays par continent : " + paysParContinent);

	}

}
