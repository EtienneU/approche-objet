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

		Ville villeMaxHab = listeVilles.get(0); // variable ville la plus peupl�e
		Ville villeMinHab = listeVilles.get(0); // variable ville la moins peupl�e
		int indexVilleMinHab = 0; // variable index de la ville la moins peupl�e
		int seuilHab = 100_000;
		
		for (int i = 0; i < listeVilles.size(); i++) {
			Ville v = listeVilles.get(i);
			// Recherche de la ville la plus peupl�e
			if (v.getNbHab() >= villeMaxHab.getNbHab()) {
				villeMaxHab = v;
			}
			// Recherche de la ville la moins peupl�e
			if (v.getNbHab() <= villeMinHab.getNbHab()) {
				villeMinHab = v;
				indexVilleMinHab = i;
			}
			// Modification du nom des villes d�passant le seuil d'habitants fix�
			if (v.getNbHab() >= seuilHab) {
				v.setNom(listeVilles.get(i).getNom().toUpperCase());
			}
		}
		
		System.out.println("Ville la plus peupl�e : " + villeMaxHab);
		System.out.println("Suppression de la ville la moins peupl�e : " + villeMinHab);
		listeVilles.remove(indexVilleMinHab);
		System.out.println("\nListe des villes apr�s traitements : " + listeVilles + "\n");
	}

}
