package fr.diginamic.parseur;

import java.text.DecimalFormat;

public class Expression {

	private String mGauche;
	private char operateur;
	private String mDroite;

	public Expression(String mGauche, char operateur, String mDroite) {
		this.mGauche = mGauche;
		this.operateur = operateur;
		this.mDroite = mDroite;
	}

	public double evaluer(String variable, double valeur) {
		
		double valeurDeLexpression = 0;
		// Erreur si aucun des 2 membres ne correspond à la variable passée en paramètre
		if (!mGauche.equals(variable) && !mDroite.equals(variable)) {
			System.out.println("INFO - " + variable + " n'apparaît pas (isolé) dans l'expression...");
		}

		if (operateur == '+') {
			valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) + evaluerMembre(mDroite, variable, valeur);
		} else if (operateur == '-') {
			valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) - evaluerMembre(mDroite, variable, valeur);
		} else if (operateur == '*') {
			valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) * evaluerMembre(mDroite, variable, valeur);
		} else if (operateur == '/') {
			valeurDeLexpression = evaluerMembre(mGauche, variable, valeur) / evaluerMembre(mDroite, variable, valeur);
		}

		return valeurDeLexpression;
	}

	/**
	 * 
	 * @param membre gauche ou membre droit (de type String) de l'Expression
	 *               variable (de type String) et sa valeur (type double)
	 * @return double valeur numérique du membre passé en paramètre
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

	public boolean isANumber(String str) {
		boolean isANumber = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != ',') {
				isANumber = false;
			}
		}
		return isANumber;
	}

	@Override
	public String toString() {
		return mGauche + operateur + mDroite;
	}

}
