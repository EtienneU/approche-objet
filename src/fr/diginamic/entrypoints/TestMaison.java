package fr.diginamic.entrypoints;

import fr.diginamic.heritageEtPolymorphisme.maison.Chambre;
import fr.diginamic.heritageEtPolymorphisme.maison.Cuisine;
import fr.diginamic.heritageEtPolymorphisme.maison.Maison;
import fr.diginamic.heritageEtPolymorphisme.maison.Piece;
import fr.diginamic.heritageEtPolymorphisme.maison.SalleDeBain;
import fr.diginamic.heritageEtPolymorphisme.maison.Salon;
import fr.diginamic.heritageEtPolymorphisme.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {

		Piece[] tabPieces1 = {
				new Chambre(15f, (short) 1), 
				new Chambre(13f, (short) 1),
				new Salon(-19f, (short) 0), // test avec mauvaise valeur et demande de saisie intéractive
				new Wc(2f, (short) 1),
				new Wc(4f, (short) 0),
				new SalleDeBain(5f, (short) 1),
				new Cuisine(9f, (short) 0) };

		Maison m1 = new Maison(tabPieces1);

		// Premier affichage - AVANT AJOUTS
		m1.afficheDescription();

		
		m1.ajouterPiece(new SalleDeBain(6f, (short) 2));
		m1.ajouterPiece(new Salon(11f, (short) 2));
		m1.ajouterPiece(null);
		m1.ajouterPiece(new SalleDeBain(-4f, (short) 0)); 	// superficie saisie incorrecte
		m1.ajouterPiece(new Chambre(15f, (short) -2)); 		// etage saisi incorrect
		m1.getTabPieces()[m1.getTabPieces().length - 1].setNumEtage((short) 2); // correction manuelle de l'étage
		
		// Second affichage - APRES AJOUTS
		m1.afficheDescription();
	}
}
