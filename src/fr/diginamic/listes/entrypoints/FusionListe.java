package fr.diginamic.listes.entrypoints;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
	
	public static void main(String args[]) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Jaune");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste1.add("Jaune");
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		for (String str : liste1) {
			liste3.add(str);
		}
		for (String str : liste2) {
			liste3.add(str);
		}
		
		System.out.println(liste3);
	}
}
