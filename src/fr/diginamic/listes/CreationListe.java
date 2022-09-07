package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {

		List<Integer> entiersList = new ArrayList<Integer>();
		// ou bien : ArrayList<Integer> entiersList = new ArrayList<>();
		
		int i = 1;
		while (i <= 100) {
			entiersList.add(i++);
		}
		
		System.out.print("Ma collection de " + entiersList.size() + " élément(s) :\n" + entiersList + " ");
	}
}
