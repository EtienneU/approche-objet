package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.listes.Ville;

public class TestTriVilles {

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
		
		System.out.println("Mes villes sans tri : \n".toUpperCase() + listeVilles + "\n");
		
		Collections.sort(listeVilles);
		
		System.out.println("Mes villes avec tri : \n".toUpperCase() + listeVilles + "\n");

	}

}
