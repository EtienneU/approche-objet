package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {

		HashMap<String, Float> mapSalaires = new HashMap<>();
		
		mapSalaires.put("Paul", 1750f);
		mapSalaires.put("Hicham", 1825f);
		mapSalaires.put("Yu", 2250f);
		mapSalaires.put("Ingrid", 2015f);
		mapSalaires.put("Chantal", 2418f);

		System.out.println("Taille de ma HashMap : " + mapSalaires.size());
	}

}
