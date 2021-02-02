package fr.diginamic.parseur;

public class Parser {

	private static char[] tabOperateurs = { '+', '-', '*', '/' };

	/**
	 * 
	 * @param 	chaine la chaîne de caractère testée puis parsée en Expression
	 * @return 	Expression avec deux membres et un opérateur, issue du parsage de ma
	 *         	chaine de caractères
	 */
	public static Expression parse(String chaine) {
		String membreGauche = null;
		String membreDroite = null;
		char operateur = '\u0000';

		// Etape de test : si j'ai 0, ou plus de 2 opérateurs (inclu) --> erreur : message + retour null
		short nbOperateur = 0;
		int indexOperateur = 0; // L'occasion de récupérer l'index de l'opérateur unique de la chaine
		for (int i = 0; i < chaine.length(); i++) {
			for (int j = 0; j < tabOperateurs.length; j++) {
				if (chaine.charAt(i) == tabOperateurs[j]) {
					nbOperateur += 1;
					indexOperateur = i;
				}
			}
		}
		if (nbOperateur != 1) {
			System.out.println("ERREUR - la chaine de caractères doit contenir UN OPERATEUR. Ni plus ni moins.");
			return null;
		}

		membreGauche 	= chaine.substring(0, indexOperateur);
		operateur 		= chaine.charAt(indexOperateur);
		membreDroite 	= chaine.substring(indexOperateur + 1, chaine.length());

		return new Expression(membreGauche, operateur, membreDroite);
	}

}
