package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void afficher(Forme shape) {
		System.out.println("> " + shape.getClass().getSimpleName() + " --> Surface = " 
				+ shape.calculerSurface() + ", P�rim�tre = " + shape.calculerPerimetre());
	}
	
}
