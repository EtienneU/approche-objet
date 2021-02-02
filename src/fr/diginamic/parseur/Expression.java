package fr.diginamic.parseur;

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
		// Si aucun des deux membres ne contient la variable passée en paramètre... Erreur
		if (!mGauche.equals(variable) && !mDroite.equals(variable)) {
			System.out.println("ERREUR - " + variable + " n'apparaît pas dans l'expression... Réessayer.");
			return 0;
		}
		
		
		return 0;
	}
	
	/**
	 * 
	 * @param 	membre gauche ou membre droit (de type String) de l'Expression
	 * @return 	true si ce membre correspond à une valeur numérique (une constante),
	 * 			false si c'est une variable
	 */
	public boolean evaluerMembre(String membre) {
		boolean isANumber = true;
		for (int i = 0; i < membre.length(); i++) {
			if (!Character.isDigit(membre.charAt(i)) && membre.charAt(i) != '.') {
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
