package fr.diginamic.listes.entrypoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> listeVilles = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon",
						"Foix", "Pau", "Marseille", "Tarbes", "Avignon"
				)
		);
		System.out.println("Liste initiale de villes : " + listeVilles);

		// Afficher la ville portant le nom le plus long
		String longueVille = listeVilles.get(0);
		for (String ville : listeVilles) {
			if (ville.length() >= longueVille.length()) {
				longueVille = ville;
			}
		}
		System.out.println("Ville possedant le plus de lettres : " + longueVille);

		// Changer chaque nom de ville en passant tous ses caracteres en MAJUSCULE
		for (int i = 0; i < listeVilles.size(); i++) {
			listeVilles.set(i, listeVilles.get(i).toUpperCase());
		}
		System.out.println("Villes en Majuscule : " + listeVilles);

		// Avec un objet Iterator, supprimer de la liste les villes qui contiennent la lettre 'n'
		Iterator<String> iter = listeVilles.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.toLowerCase().contains("n")) {
				iter.remove();
			}
		}
		System.out.println("Villes excluant la lettre 'N' : " + listeVilles);
	}
}
