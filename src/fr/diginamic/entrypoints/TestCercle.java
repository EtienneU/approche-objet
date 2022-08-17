package fr.diginamic.entrypoints;

import java.text.DecimalFormat;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		// Classe de formatage native Java
		DecimalFormat df = new DecimalFormat("#.##");

		Cercle c1 = new Cercle(14);
		System.out.println(c1.perimetre());
		
//		Cercle[] circleArray = { new Cercle(32d), new Cercle(14d), };
		Cercle[] circleArray = { CercleFactory.generateCercle(32d), CercleFactory.generateCercle(14d)};

		System.out.println("Mes cercles : ");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.println("> " + circleArray[i].getClass().getSimpleName() + " - périmètre = "
					+ df.format(circleArray[i].perimetre()) + ", surface = " + df.format(circleArray[i].surface()));
		}
	}

}
