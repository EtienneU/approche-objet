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
			if (b == 0) {
				System.out.println("ERROR : division by zero is forbiden...");
				return Double.MAX_VALUE;
			} else {
				return a / b;
			}
		} else {
			System.out.println("Opérateur invalide - SOMME appliquée par défaut");
			return a + b;
		}
	}
}
