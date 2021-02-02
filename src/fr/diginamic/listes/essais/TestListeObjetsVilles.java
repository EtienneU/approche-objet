package fr.diginamic.listes.essais;

import java.util.ArrayList;
import fr.diginamic.listes.Ville;

public class TestListeObjetsVilles {

	public static void main(String[] args) {

		ArrayList<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(new Ville("Nice", 343000));
		listeVilles.add(new Ville("Carcassonne", 47800));
		listeVilles.add(new Ville("Narbonne", 53400));
		listeVilles.add(new Ville("Lyon", 484000));
		listeVilles.add(new Ville("Foix", 9700));
		listeVilles.add(new Ville("Pau", 77200));
		listeVilles.add(new Ville("Marseille", 850700));
		listeVilles.add(new Ville("Tarbes", 40600));
		
		System.out.println("\nListe des villes : " + listeVilles + "\n");

		Ville villeMaxHab = listeVilles.get(0); // variable ville la plus peuplée
		Ville villeMinHab = listeVilles.get(0); // variable ville la moins peuplée
		int seuilHab = 100000;

		for (Ville v : listeVilles) {
			if (v.getNbHab() >= villeMaxHab.getNbHab()) {
				villeMaxHab = v;
			}
			if (v.getNbHab() <= villeMinHab.getNbHab()) {
				villeMinHab = v;
			}
		}
		System.out.println("Ville la plus peuplée : " + villeMaxHab);
		System.out.println("Suppression de la ville la moins peuplée : " + villeMinHab);
		listeVilles.remove(villeMinHab);

		for (int i = 0; i < listeVilles.size(); i++) {
			if (listeVilles.get(i).getNbHab() >= seuilHab) {
				listeVilles.get(i).setNom(listeVilles.get(i).getNom().toUpperCase());
			}
		}
		System.out.println("\nListe des villes après traitements : " + listeVilles + "\n");
	}

}
