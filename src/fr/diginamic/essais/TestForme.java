package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {

		Forme[] tabFormes = new Forme[] {new Cercle(6d), new Rectangle(43d, 52d), new Carre(13d)};
		
		for (int i = 0; i < tabFormes.length; i++) {
			AffichageForme.afficher(tabFormes[i]);
		}
		
	}

}
