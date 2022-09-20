package fr.diginamic.operations;

import java.text.DecimalFormat;

public class CalculMoyenne {

	private double[] tab = new double[0];

	public CalculMoyenne() {
	}

	// Méthode d'ajout d'un double au tableau "tab"
	public void ajout(double dbl) {
		double[] temp = new double[tab.length + 1];

		for (int i = 0; i < tab.length; i++) {
			temp[i] = tab[i];
		}
		
		temp[temp.length - 1] = dbl;
		tab = temp;
	}

	// Méthode qui retourne la moyenne des valeurs des éléments de "tab"
	public double calcul() {
		double som = tab[0];
		for (int i = 1; i < tab.length; i++) {
			som += tab[i];
		}
		return som / tab.length;
	}

	// Méthode d'affichage des éléments du tableau "tab"
	public void afficheTab() {
	    DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("[");
		for (int i = 0; i < tab.length; i++) {
			if (i == tab.length - 1) {
				System.out.println(df.format(tab[i]) + "]");
			} else {
				System.out.print(df.format(tab[i]) + " | ");
			}
		}
	}
}
