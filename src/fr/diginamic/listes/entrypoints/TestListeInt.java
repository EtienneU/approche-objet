package fr.diginamic.listes.entrypoints;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> listeInt = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		System.out.println("listeInt initiale = " + listeInt);

		int max = listeInt.get(0);
		for (int n : listeInt) {
			if (n >= max) {
				max = n;
			}
		}
		System.out.println("Le max de ma collection est " + max);
		
		// Je declare min comme Objet Integer et pas comme simple int
		// sinon j'ai un probleme avec la methode remove()
		Integer min = listeInt.get(0);
		for (int n : listeInt) {
			if (n <= min) {
				min = n;
			}
		}
		listeInt.remove(min);
		System.out.println("listeInt sans le min = " + listeInt);
		
		for (int i = 0; i < listeInt.size(); i++) {
			if (listeInt.get(i) < 0) {
				listeInt.set(i, - listeInt.get(i));
			}
		}
		System.out.println("listeInt sans le min et en valeurs absolues = " + listeInt);
	}
}
