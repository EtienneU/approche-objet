package fr.diginamic.recensement;

public class Menu {

	private static String menu =  "----------------------------  M E N U  ----------------------------\n"
							+     "|                                                                 |\n"
							+     "|  S�lectionner une donn�e � afficher :                           |\n"
							+     "|                                                                 |\n"
							+     "|  1- Population d'une ville donn�e                               |\n"
							+     "|  2- Population d'un d�partement donn�                           |\n"
							+     "|  3- Population d'une r�gion donn�e                              |\n"
							+     "|  4- Afficher les 10 r�gions les plus peupl�es                   |\n"
							+     "|  5- Afficher les 10 d�partement les plus peupl�s                |\n"
							+     "|  6- Afficher les 10 villes les plus peupl�es d'un d�partement   |\n"
							+     "|  7- Afficher les 10 villes les plus peupl�es d'une r�gion       |\n"
							+     "|  8- Afficher les 10 villes les plus peupl�es de France          |\n"
							+     "|                                                                 |\n"
							+     "|  9- Quitter                                                     |\n"
							+     "|_________________________________________________________________|\n";
			
	public static void displayMenu() {
		
		System.out.println(menu);
	}
}
