package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte 		c1 = new Compte("5465768798L", 3250f);
		CompteTaux 	c2 = new CompteTaux("142637485932L", 132.76f, 2.3f);
		
		System.out.println("c1 : " + c1);
		System.out.println("Solde de c2 : " + c2.getSolde());
		System.out.println("Taux de c2 : " + c2.getTaux() + " %");
		System.out.println("Type de c2 : " + c2.getClass().getSimpleName());
		System.out.println("c2 : " + c2);
		
		Compte[] compteArray = new Compte[] {c1, c2};
		System.out.println("Mon tableau de comptes :");
		for (int i = 0; i < compteArray.length; i++) {
			System.out.println("- " + compteArray[i]);
//			if ( compteArray[i] instanceof CompteTaux) {
//				System.out.println("^ This one is CompteTaux ^");
//			}
			
		}
	}
}
