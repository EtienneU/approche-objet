package fr.diginamic.listes.entrypoints;

import java.util.ArrayList;

import fr.diginamic.listes.Ville;

public class TestListeObjetsVilles {

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
		
		System.out.println("\nListe des villes avant traitements : " + listeVilles + "\n");

		Ville villeMaxHab = listeVilles.get(0); // variable ville la plus peuplee
		Ville villeMinHab = listeVilles.get(0); // variable ville la moins peuplee
		int indexVilleMinHab = 0; // variable index de la ville la moins peuplee
		int seuilHab = 100_000;


		for (Ville ville: listeVilles) {
			// Recherche de la ville la plus peuplee
			if (ville.getNbHab() >= villeMaxHab.getNbHab()) {
				villeMaxHab = ville;
			}
			// Recherche de la ville la plus peuplee
			if (ville.getNbHab() <= villeMinHab.getNbHab()) {
				villeMinHab = ville;
			}
			// Mise en capitale du nom des villes dépassant le seuil d'habitants fixé
			if (ville.getNbHab() >= seuilHab) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		System.out.println("Ville la plus peuplee : " + villeMaxHab);
		System.out.println("\nSuppression de la ville la moins peuplee : " + villeMinHab);
		listeVilles.remove(listeVilles.indexOf(villeMinHab));
		System.out.println("\nListe des villes apres traitements : " + listeVilles + "\n");
	}
}
