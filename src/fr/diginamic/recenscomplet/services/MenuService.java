package fr.diginamic.recenscomplet.services;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recenscomplet.entites.Lieu;

public class MenuService {
	
	protected Integer choixMenu;
	String typeRecherche;
	String choixRecherche;

	public static String displayMenu(Scanner scanner) {
		String menu = "----------------------------  M E N U  ----------------------------\n"
				+ "|                                                                 |\n"
				+ "|  Sélectionner une donnée à afficher :                           |\n"
				+ "|                                                                 |\n"
				+ "|  1- Population d'une ville donnée                               |\n"
				+ "|  2- Population d'un département donné                           |\n"
				+ "|  3- Population d'une région donnée                              |\n"
				+ "|  4- Afficher les 10 régions les plus peuplées                   |\n"
				+ "|  5- Afficher les 10 département les plus peuplés                |\n"
				+ "|  6- Afficher les 10 villes les plus peuplées d'un département   |\n"
				+ "|  7- Afficher les 10 villes les plus peuplées d'une région       |\n"
				+ "|  8- Afficher les 10 villes les plus peuplées de France          |\n"
				+ "|                                                                 |\n"
				+ "|  9- Quitter                                                     |\n"
				+ "|_________________________________________________________________|\n";
		System.out.println(menu);
		return scanner.nextLine();
	}
	
	protected void displayTop10(List<Lieu> listeLieu) {
		Collections.sort(listeLieu, Collections.reverseOrder());
		for (int i = 0; i < 10; i++) {
			listeLieu.get(i).getInfos();
		}
	}
	
	protected boolean verifSiEntreeOk (List<Lieu> listeLieu, String code) {
		return listeLieu.stream().anyMatch(lieu -> lieu.getCode().equals(code));
	}
	
	protected String verifSiEntreeExiste (List<Lieu> listeLieu, String choixRecherche, Scanner scanner) {
		// tant que ce que rentre l'utilisateur ne correspond à rien
		while (!verifSiEntreeOk(listeLieu, choixRecherche)) {
			System.out.println("La saisie ne correspond à rien");
			System.out.println("1- Saisir de nouveau \n2- Retour");
			Integer newChoix = Integer.parseInt(scanner.nextLine());
			while( newChoix < 1 || newChoix > 2) {
				System.out.println("Choix Incorrect");
				System.out.println("1- Saisir de nouveau \n2- Retour");
				newChoix = Integer.parseInt(scanner.nextLine());
			}
			if (newChoix == 2) {
				return "Quit";
			}
			System.out.print("Merci de saisir un(e) " + typeRecherche + " : ");
			choixRecherche = scanner.nextLine();
		}
		return choixRecherche;
	}
}
