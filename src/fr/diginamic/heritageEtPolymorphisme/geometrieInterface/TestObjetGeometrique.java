package fr.diginamic.heritageEtPolymorphisme.geometrieInterface;

import java.text.DecimalFormat;

public class TestObjetGeometrique {

	// TP mettant en lumiere le polymorphism (interfaces) et DecimalFormat
	public static void main(String[] args) {
		
		// Instance de DecimalFormat pour appeler la méthode format()
		// et ainsi n'affciher que 2 chiffres après la virgule
        DecimalFormat df = new DecimalFormat("#.##");

		ObjetGeometrique[] geomArray = {
				new Cercle(6d),
				new Rectangle(4d, 3d)
		};

	System.out.println("Mes objets géométriques (u = unité de longueur): ");
		for (ObjetGeometrique objetGeometrique : geomArray) {
			System.out.println("> " + objetGeometrique.getClass().getSimpleName()
					+ " - périmètre = " + df.format(objetGeometrique.perimetre())
					+ " u, surface = " + df.format(objetGeometrique.surface()) + " u²");
		}
	}
}
