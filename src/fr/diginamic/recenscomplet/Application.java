package fr.diginamic.recenscomplet;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recenscomplet.services.MenuService;
import fr.diginamic.recenscomplet.services.Recherche10PopMax;
import fr.diginamic.recenscomplet.services.RecherchePopulation;

public class Application {

	public static void main(String[] args) throws IOException {

		String filePath = "C:/Users/urban/OneDrive/OD-Documents/DEV/Diginamic/Java/workspaceSTS/approche-objet/src/fr/diginamic/recenscomplet/recensement.csv";
		Recensement recens = new Recensement(filePath);
		
//		System.out.println("Notre recensement compte " + recens.getCompteurVilles() + " villes françaises.\n");
		
		Scanner scanner = new Scanner(System.in);
		
		int choix = 0;
		while (choix != 9) {
			choix = Integer.parseInt(MenuService.displayMenu(scanner));
			if (choix < 1 || choix > 9) {
				System.out.println("Saisir une option entre 1 et 9 : ");
			} else {
				switch (choix) {
				case 1:
					RecherchePopulation recherche1 = new RecherchePopulation(1, "ville");
					recherche1.traiter(scanner, recens);
					break;
				case 2:
					RecherchePopulation recherche2 = new RecherchePopulation(2, "département");
					recherche2.traiter(scanner, recens);
					break;
				case 3:
					RecherchePopulation recherche3 = new RecherchePopulation(3, "région");
					recherche3.traiter(scanner, recens);
					break;
				case 4:
					Recherche10PopMax recherche4 = new Recherche10PopMax(4, "région");
					recherche4.traiter(scanner, recens);
					break;
				case 5:
					Recherche10PopMax recherche5 = new Recherche10PopMax(5, "département");
					recherche5.traiter(scanner, recens);
					break;
				case 6:
					Recherche10PopMax recherche6 = new Recherche10PopMax(6, "département");
					recherche6.traiter(scanner, recens);
					break;
				case 7:
					Recherche10PopMax recherche7 = new Recherche10PopMax(7, "région");
					recherche7.traiter(scanner, recens);
					break;
				case 8:
					Recherche10PopMax recherche8 = new Recherche10PopMax(8, "ville");
					recherche8.traiter(scanner, recens);
					break;
				case 9:
					scanner.close();
					System.out.println("Sortie du programme");
					break;
				}
			}
		}
	}
}
