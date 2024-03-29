package fr.diginamic.entrypoints;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

		double a = 12d;
		double b = 4d;
		
		System.out.println(a + " + " + b + " = " + Operations.calcul(a, b, '+'));
		System.out.println(a + " - " + b + " = " + Operations.calcul(a, b, '-'));
		System.out.println(a + " * " + b + " = " + Operations.calcul(a, b, '*'));
		System.out.println(a + " / " + b + " = " + Operations.calcul(a, b, '/'));
		System.out.println(a + " / " + b + " = " + Operations.calcul(a, 0f, '/'));
		System.out.println(a + " & " + b + " = " + Operations.calcul(a, b, '&'));

	}
}
