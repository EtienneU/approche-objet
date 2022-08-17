package fr.diginamic.entrypoints;

import java.text.DecimalFormat;
import java.util.Random;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenneDecimalFormat {

	public static void main(String[] args) {
	    DecimalFormat df = new DecimalFormat("#.##");

		CalculMoyenne tab1 = new CalculMoyenne();
		CalculMoyenne tab2 = new CalculMoyenne();
		
		tab1.ajout(12.5);
		tab1.ajout(16);
		tab1.ajout(7.5);
		tab1.ajout(4);
		
		System.out.print("tab1 = ");
		tab1.afficheTab();
		
		double moy = tab1.calcul();
		System.out.println("Moyenne de tab1 = " + df.format(moy));
		

		// Création d'un tableau de 10 doubles aléatoires compris entre 0 et 20)
		Random rand = new Random(); // import de la classe Random de java.util
		int i = 0;
		while(i++ < 10) {
			System.out.println(rand.nextDouble());
			tab2.ajout(0d + (20d - 0d) * rand.nextDouble());
		}
		
		System.out.print("tab2 = ");
		tab2.afficheTab();
		
		moy = tab2.calcul();
		System.out.println("Moyenne de tab2 = " + df.format(moy));
 	}
}
