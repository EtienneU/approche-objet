package fr.diginamic.entrypoints;

import fr.diginamic.formesEtSalaries.geometrieClasseAbstraite.Carre;
import fr.diginamic.formesEtSalaries.geometrieClasseAbstraite.Cercle;
import fr.diginamic.formesEtSalaries.geometrieClasseAbstraite.Forme;
import fr.diginamic.formesEtSalaries.geometrieClasseAbstraite.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {

		Forme[] tabFormes = new Forme[] {new Cercle(7d), new Rectangle(43d, 52d), new Carre(14d)};
		
		for (Forme forme: tabFormes) {
			AffichageForme.afficher(forme);
		}
	}
}
