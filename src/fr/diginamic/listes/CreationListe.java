package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {

		ArrayList<Integer> entiersList = new ArrayList<>();
		
		int i = 1;
		while (i <= 100) {
			entiersList.add(i++);
		}
		
		System.out.println("Ma collection de " + entiersList.size() + " éléments :\n" + entiersList);
	}

}
