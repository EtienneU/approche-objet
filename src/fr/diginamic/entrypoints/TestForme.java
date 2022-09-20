package fr.diginamic.entrypoints;

import fr.diginamic.heritageEtPolymorphisme.geometrieClasseAbstraite.Carre;
import fr.diginamic.heritageEtPolymorphisme.geometrieClasseAbstraite.Cercle;
import fr.diginamic.heritageEtPolymorphisme.geometrieClasseAbstraite.Forme;
import fr.diginamic.heritageEtPolymorphisme.geometrieClasseAbstraite.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {

		Forme[] tabFormes = new Forme[] {new Cercle(7d), new Rectangle(43d, 52d), new Carre(14d)};
		
		for (Forme forme: tabFormes) {
			AffichageForme.afficher(forme);
		}
	}
}
