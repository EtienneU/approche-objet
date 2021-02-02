package fr.diginamic.geometrie;

import java.text.DecimalFormat;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		// Instance de DecimalFormat pour appeler la m�thode format()
		// et ainsi n'affciher que 2 chiffres apr�s la virgule
        DecimalFormat df = new DecimalFormat("#.##");

		ObjetGeometrique[] geomArray = {
				new Cercle(6d),
				new Rectangle(4d, 3d)
		};

	System.out.println("Mes objets g�om�triques (u = unit� de longueur): ");
		for (int i = 0; i < geomArray.length; i++) {
			System.out.println("> " + geomArray[i].getClass().getSimpleName()
					+ " - p�rim�tre = " + df.format(geomArray[i].perimetre())
					+ " u, surface = " + df.format(geomArray[i].surface()) + " u�");
		}
		
	}

}
