package fr.diginamic.geometrie;

import java.text.DecimalFormat;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		// Instance de DecimalFormat pour appeler la méthode format()
		// et ainsi n'affciher que 2 chiffres après la virgule
        DecimalFormat df = new DecimalFormat("#.##");

		ObjetGeometrique[] geomArray = {
				new Cercle(6d),
				new Rectangle(4d, 3d)
		};

	System.out.println("Mes objets géométriques (u = unité de longueur): ");
		for (int i = 0; i < geomArray.length; i++) {
			System.out.println("> " + geomArray[i].getClass().getSimpleName()
					+ " - périmètre = " + df.format(geomArray[i].perimetre())
					+ " u, surface = " + df.format(geomArray[i].surface()) + " u²");
		}
		
	}

}
