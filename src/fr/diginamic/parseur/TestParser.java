package fr.diginamic.parseur;

import java.text.DecimalFormat;

/**
 * L'objectif de ce programme est d'afficher une expression mathemathique simple (2 membres separes par 1 operateur)
 * et d'en determiner la valeur numerique finale apres avoir remplace une variable par un nombre
 */
public class TestParser {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");

		String chaine1 = " 3.4   - z  ";
		Expression expr1 = Parser.parse(chaine1);
		System.out.println("expr1 = \"" + expr1 + "\"");
		// Je remplace z par 2.5
		double resultat1 = expr1.evaluer("z", 2.5);
		System.out.println("Valeur de expr1 : " + df.format(resultat1));

		String chaine2 = "   x / 6";
		Expression expr2 = Parser.parse(chaine2);
		System.out.println("expr2 = \"" + expr2 + "\"");
		double resultat2 = expr2.evaluer("x", 12.0);
		System.out.println("Valeur de expr2 : " + df.format(resultat2));

		String chaine3 = " t r 2";
		Expression expr3 = Parser.parse(chaine3);
		System.out.println("expr3 = \"" + expr3 + "\"");
		double resultat3 = expr3.evaluer("t", 458);
		System.out.println("Valeur de expr3 : " + df.format(resultat3));
	}
}
