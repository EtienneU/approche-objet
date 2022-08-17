package fr.diginamic.entrypoints;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {

		Forme[] tabFormes = new Forme[] {new Cercle(7d), new Rectangle(43d, 52d), new Carre(14d)};
		
		for (Forme forme: tabFormes) {
			AffichageForme.afficher(forme);
		}
	}
}
