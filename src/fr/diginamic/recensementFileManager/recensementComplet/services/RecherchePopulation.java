package fr.diginamic.recensementFileManager.recensementComplet.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensementFileManager.recensementComplet.Recensement;
import fr.diginamic.recensementFileManager.recensementComplet.entites.Lieu;

public class RecherchePopulation extends MenuService {
	
	public RecherchePopulation(int choixMenu, String typeRecherche) {
		this.choixMenu = choixMenu;
		this.typeRecherche = typeRecherche;
	}
	
	public void traiter(Scanner scanner, Recensement recensement ) {
		System.out.print("Saisir un(e) " + typeRecherche + " : ");
		choixRecherche = scanner.nextLine();
		// création de notre liste générique de lieu (Ville, Dep, Region ou Pays)
		List<Lieu> choixListe;
		if (choixMenu == 1) {
			// je vais chercher ma liste de Villes dans mon attribut Pays
			choixListe = recensement.getPays().getListeVille();
		} else if (choixMenu == 2){
			choixListe = recensement.getPays().getListeDep();
		} else { // choix 3
			choixListe = recensement.getPays().getListeRegion();
		} 
		
		choixRecherche = verifSiEntreeExiste(choixListe, choixRecherche, scanner);
		if (choixRecherche.equals("Quit")) {
			return;
		}

		// recherche de l'occurence dans ma liste de lieu générique
		for (Lieu lieu : choixListe) {
			if(choixRecherche.equals(lieu.getCode())) {
				lieu.getInfos();
			}
		}
		System.out.println("\nAppuyer sur une touche pour continuer");
		scanner.nextLine();
	}
}
