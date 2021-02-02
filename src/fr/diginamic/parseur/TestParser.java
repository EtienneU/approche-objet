package fr.diginamic.parseur;

import java.text.DecimalFormat;

public class TestParser {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");

		String chaine = "3.4-z";
		Expression expr = Parser.parse(chaine);
		System.out.println("expr = \"" + expr + "\"");
		double resultat = expr.evaluer("z", 2.5);
		System.out.println("Valeur de expr : " + df.format(resultat)); 
	}

}
