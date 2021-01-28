package fr.diginamic.geometrie;

import java.text.DecimalFormat;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
        DecimalFormat df = new DecimalFormat("#.##");

		ObjetGeometrique[] geomArray = {
				new Cercle(45d),
				new Rectangle(61d, 23d),
				new Cercle(12d),
				new Rectangle(13d, 4d)
		};

	System.out.println("Mes objets géométriques : ");
		for (int i = 0; i < geomArray.length; i++) {
			System.out.println("> " + geomArray[i].getClass().getSimpleName()
					+ " - périmètre = " + df.format(geomArray[i].perimetre())
					+ ", surface = " + df.format(geomArray[i].surface()));
		}
		
	}

}
