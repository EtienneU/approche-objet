package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char c) {
		
		if (c == '+') {
			return a + b;
		} else if (c == '-') {
			return a - b;
		} else if (c == '*') {
			return a * b;
		} else if (c == '/') {
			return a / b;
		} else {
			System.out.println("Opérateur invalide - somme par défaut");
			return a + b;
		}
	}
}
