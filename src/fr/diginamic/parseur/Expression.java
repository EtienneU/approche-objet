package fr.diginamic.parseur;

import java.text.DecimalFormat;

public class Expression {

	private String mGauche;
	private char operateur;
	private String mDroite;

	/**
	 * Constructeur. un expression est par exemple  "5 / 4"
	 * @param mGauche
	 * @param operateur
	 * @param mDroite
	 */
	public Expression(String mGauche, char operateur, String mDroite) {
		this.mGauche = mGauche;
		this.operateur = operateur;
		this.mDroite = mDroite;
	}

	/**
	 * Retourne la valeur de l'expression
	 * @param variable
	 * @param valeur
	 * @return valeurDeLexpression
	 */
	public double evaluer(String variable, double valeur) {
		
		double valeurDeLexpression = 0;
		// Erreur si aucun des 2 membres ne correspond a la variable passee en parametre
		if (!mGauche.equals(variable) && !mDroite.equals(variable)) {
			System.out.println("INFO - " + variable + " n'apparait pas (isole) dans l'expression...");
		}

		switch (operateur) {
			case '+' :
				valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) + evaluerMembre(mDroite, variable, valeur);
				break;
			case '-' :
				valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) - evaluerMembre(mDroite, variable, valeur);
				break;
			case '*' :
				valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) * evaluerMembre(mDroite, variable, valeur);
				break;
			case '/' :
				valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) / evaluerMembre(mDroite, variable, valeur);
				break;
			case '%' :
				valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) % evaluerMembre(mDroite, variable, valeur);
				break;
			default:

		}

		return valeurDeLexpression;
	}

	/**
	 * Retourne la valeur numerique du membre passe en parametre
	 * @param membre 	membre gauche ou droit de l'Expression
	 * @param variable	variable
	 * @param valeur 	valeur du membre
	 * @return valeurDuMembre
	 */
	public double evaluerMembre(String membre, String variable, double valeur) {
		double valeurDuMembre = 0;
		if (membre.equals(variable)) {
			valeurDuMembre = valeur;
		} else if (isANumber(membre)) {
			valeurDuMembre = Double.parseDouble(membre);
		} else {
			System.out.println("ERREUR - une autre variable que " + variable + " apparaît !");
		}
		return valeurDuMembre;
	}

	/**
	 * Determine si le parametre est un nombre ou non
	 * @param str l'expression litterale
	 * @return true or false
	 */
	public boolean isANumber(String str) {
		boolean isANumber = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != ',') {
				isANumber = false;
			}
		}
		return isANumber;
	}

	/**
	 *	Methode de conversion de l'objet en chaine de caracteres
	 * @return la concatenation de l'expression mathematique simple
	 */
	@Override
	public String toString() {
		return mGauche + " " + operateur + " " + mDroite;
	}
}
