package fr.diginamic.recensement;

public class Menu {

	private static String menu =  "----------------------------  M E N U  ----------------------------\n"
							+     "|                                                                 |\n"
							+     "|  Sélectionner une donnée à afficher :                           |\n"
							+     "|                                                                 |\n"
							+     "|  1- Population d'une ville donnée                               |\n"
							+     "|  2- Population d'un département donné                           |\n"
							+     "|  3- Population d'une région donnée                              |\n"
							+     "|  4- Afficher les 10 régions les plus peuplées                   |\n"
							+     "|  5- Afficher les 10 département les plus peuplés                |\n"
							+     "|  6- Afficher les 10 villes les plus peuplées d'un département   |\n"
							+     "|  7- Afficher les 10 villes les plus peuplées d'une région       |\n"
							+     "|  8- Afficher les 10 villes les plus peuplées de France          |\n"
							+     "|                                                                 |\n"
							+     "|  9- Quitter                                                     |\n"
							+     "|_________________________________________________________________|\n";
			
	public static void displayMenu() {
		
		System.out.println(menu);
	}
}
