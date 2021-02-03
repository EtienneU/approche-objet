package fr.diginamic.listes.essais;

import java.util.ArrayList;
import java.util.Iterator;

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

		Ville villeMaxHab = listeVilles.get(0); // variable ville la plus peuplée
		Ville villeMinHab = listeVilles.get(0); // variable ville la moins peuplée
		int indexVilleMinHab = 0; // variable index de la ville la moins peuplée
		int seuilHab = 100_000;
		
		for (int i = 0; i < listeVilles.size(); i++) {
			Ville v = listeVilles.get(i);
			// Recherche de la ville la plus peuplée
			if (v.getNbHab() >= villeMaxHab.getNbHab()) {
				villeMaxHab = v;
			}
			// Recherche de la ville la moins peuplée
			if (v.getNbHab() <= villeMinHab.getNbHab()) {
				villeMinHab = v;
				indexVilleMinHab = i;
			}
			// Modification du nom des villes dépassant le seuil d'habitants fixé
			if (v.getNbHab() >= seuilHab) {
				v.setNom(listeVilles.get(i).getNom().toUpperCase());
			}
		}
		
		System.out.println("Ville la plus peuplée : " + villeMaxHab);
		System.out.println("Suppression de la ville la moins peuplée : " + villeMinHab);
		listeVilles.remove(indexVilleMinHab);
		System.out.println("\nListe des villes après traitements : " + listeVilles + "\n");
	}

}
