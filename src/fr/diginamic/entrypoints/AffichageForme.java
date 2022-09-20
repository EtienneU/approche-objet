package fr.diginamic.entrypoints;

import java.text.DecimalFormat;
import fr.diginamic.heritageEtPolymorphisme.geometrieClasseAbstraite.Forme;

public class AffichageForme {
	
	private static DecimalFormat df = new DecimalFormat("#.#");
	
	public static void afficher(Forme shape) {
		System.out.println("> " + shape.getClass().getSimpleName() + " --> Surface = " 
				+ df.format(shape.calculerSurface()) + ", Périmètre = " + df.format(shape.calculerPerimetre()));
	}
}
