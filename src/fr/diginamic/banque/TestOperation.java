package fr.diginamic.banque;

import fr.diginamic.banque.utils.Credit;
import fr.diginamic.banque.utils.Debit;
import fr.diginamic.banque.utils.Operation;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] opArray = {
				new Credit("2020.12.01",  450f), 
				new Debit( "2021.01.23",  33.21f),
				new Debit( "2021.01.25",  290f), 
				new Credit("2021.01.28",  95.12f), 
				new Debit( "2021.01.29",  31.43f)
		};
		
		float montantGlobal = 0f;
		
		System.out.println("Operations enregistrées : ");
		for (int i = 0; i < opArray.length; i++) {
			// avant l'appel de la méthode afficherType(), j'utilisais opArray[i].getClass().getSimpleName()
			System.out.println("> " + opArray[i].afficherType()
					+ " - date : " + opArray[i].getDate()
					+ " | montant : " + opArray[i].getMontant() + " €");
			
			if (opArray[i].afficherType().equals("Crédit")) {
				montantGlobal += opArray[i].getMontant();
			} else if (opArray[i].afficherType().equals("Débit ")){
				montantGlobal -= opArray[i].getMontant();
			}
		}
		
		System.out.print("Montant global : ");
		System.out.printf("%.2f", montantGlobal);
		System.out.println(" €");
	
	}
}
