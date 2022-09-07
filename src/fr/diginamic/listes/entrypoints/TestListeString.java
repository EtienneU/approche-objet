package fr.diginamic.listes.entrypoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> listeVilles = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon",
						"Foix", "Pau", "Marseille", "Tarbes"));
		
		System.out.println("Liste de villes : " + listeVilles);
		
		String longueVille = listeVilles.get(0);
		for (String ville : listeVilles) {
			if(ville.length() >= longueVille.length()) {
				longueVille = ville;
			}
		}
		
		System.out.println("Ville possédant le plus de lettres : " + longueVille);
		
		for (int i = 0; i < listeVilles.size(); i++) {
			listeVilles.set(i, listeVilles.get(i).toUpperCase());
		}
		
		System.out.println("Villes en Majuscule : " + listeVilles);
		
		Iterator<String> iter = listeVilles.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.charAt(0) == 'n' || ville.charAt(0) == 'N' ) {
				iter.remove();
			}
		}
		
		System.out.println("Villes après traitements : " + listeVilles);
	}

}
