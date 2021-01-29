package fr.diginamic.operations;

import java.text.DecimalFormat;

public class CalculMoyenne {

	private double[] tab = new double[0];

	public CalculMoyenne() {
	}

	public void ajout(double dbl) {
		double[] temp = new double[tab.length + 1];

		for (int i = 0; i < tab.length; i++) {
			temp[i] = tab[i];
		}
		temp[temp.length - 1] = dbl;
		tab = temp;

	}

	public double calcul() {
		double som = tab[0];
		for (int i = 1; i < tab.length; i++) {
			som += tab[i];
		}
		return som / tab.length;
	}

	public void afficheTab() {
		
	    DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("tab = [");
		for (int i = 0; i < tab.length; i++) {
			if (i == tab.length - 1) {
				System.out.println(df.format(tab[i]) + "]");
			} else {
				System.out.print(df.format(tab[i]) + "  ");
			}
		}
	}

	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}

}
