package fr.diginamic.recensementFileManager.recensementComplet.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensementFileManager.recensementComplet.Recensement;
import fr.diginamic.recensementFileManager.recensementComplet.entites.Lieu;

public class Recherche10PopMax extends MenuService {
	
	public Recherche10PopMax(int choixMenu, String typeRecherche) {
		this.choixMenu = choixMenu;
		this.typeRecherche = typeRecherche;
	}
	
	public void traiter(Scanner scanner, Recensement recens) {
		List<Lieu> choixListe = new ArrayList<>();
		
		if (choixMenu == 4 || choixMenu == 5 || choixMenu == 8 )  {
			System.out.println("Top10");
			if (choixMenu == 4) { // Pour les 10 regions les plus peuplées de France
				choixListe = recens.getPays().getListeRegion();
			} else if (choixMenu == 5){
				choixListe = recens.getPays().getListeDep();	
			} else {
				choixListe = recens.getPays().getListeVille();	
			}
			
		} else { // choixMenu == 6 ou 7
			List<Lieu> choixNumber2= new ArrayList<>();
			if (choixMenu == 6) {
				System.out.print("Saisir un code département : ");
				choixNumber2 = recens.getPays().getListeDep();
				this.choixRecherche = scanner.nextLine();
			} else {
				System.out.print("Saisir un code Region : ");
				choixNumber2 = recens.getPays().getListeRegion();
				this.choixRecherche = scanner.nextLine();
			}
			
			choixRecherche = verifSiEntreeExiste(choixNumber2, choixRecherche, scanner);
			if (choixRecherche.equals("Quit")) {
				return;
			}
			
			for (Lieu lieu : choixNumber2) {
				// On ne rentre qu'une fois dans le corps de ma condition
				if(choixRecherche.equals(lieu.getCode())) {
					choixListe = lieu.getListeVille();
					System.out.println("Top10 des villes pour le/la " + typeRecherche + " " + lieu.getNom() );
				}
			}
		}

		// Appel à ma fonction d'affichage de ma classe MenuService
		this.displayTop10(choixListe);
		
		System.out.println("\nAppuyer sur une touche pour continuer");
		scanner.nextLine();
		return;
	}

}
