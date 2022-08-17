package fr.diginamic.utils;

import fr.diginamic.entites.Salarie;

public class SalarieFactory {
	
	public static Salarie createSalarie(String str) {
		String[] tabSalarie = str.split(";"); 	
		return new Salarie(tabSalarie[0], tabSalarie[1], Float.parseFloat(tabSalarie[2].replace(" ", "")));
	}
}
