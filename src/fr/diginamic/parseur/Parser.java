package fr.diginamic.parseur;

public class Parser {

	private static char[] tabOperateurs = { '+', '-', '*', '/', '%' };
	private static String strTabOperateurs = "";

	/**
	 * @param 	chaine		la chaine de caractère testee puis parsee en Expression
	 * @return 	Expression 	expression avec 2 membres et un opérateur central, issue du parsage de ma
	 *         	chaine de caractères
	 */
	public static Expression parse(String chaine) {
		String membreGauche = null;
		String membreDroite = null;
		char operateur = '\u0000';

		// Etape de test : si j'ai 0, ou plus de 2 operateurs (inclus) --> erreur : message + retour null
		short nbOperateur = 0;
		int indexOperateur = 0; // L'occasion de recuperer l'index de l'operateur unique de la chaine
		for (int i = 0; i < chaine.length(); i++) {
			for (int j = 0; j < tabOperateurs.length; j++) {
				if (chaine.charAt(i) == tabOperateurs[j]) {
					nbOperateur += 1;
					indexOperateur = i;
				}
			}
		}

		if (nbOperateur != 1) {
			for (char oper : tabOperateurs) {
				strTabOperateurs = strTabOperateurs.concat(Character.toString(oper)).concat(" ");
			}
			System.out.println("ERREUR - la chaine de caractères doit contenir 1 OPERATEUR parmi les suivants : " + strTabOperateurs);
			return null;
		}

		membreGauche 	= chaine.substring(0, indexOperateur);
		operateur 		= chaine.charAt(indexOperateur);
		membreDroite 	= chaine.substring(indexOperateur + 1, chaine.length());

		// L'appel a la methode trim() permet d'ignorer les eventuels espaces saisis
		return new Expression(membreGauche.trim(), operateur, membreDroite.trim());
	}
}
