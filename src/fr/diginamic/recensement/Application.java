package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.comparateurs.ComparatorPopulation;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.RecherchePopulationVille;

public class Application {

	public static void main(String[] args) throws IOException {

		Path pathFile = Paths.get(
				"C:/Users/urban/OneDrive/OD-Documents/DEV/Diginamic/Java/workspaceSTS/approche-objet/src/fr/diginamic/recensement/recensement.csv");
		// Etape 1
		// Récupération des lignes du fichier CSV dans une liste de String
		List<String> infosBrutesVilles = Files.readAllLines(pathFile, StandardCharsets.UTF_8); // l'option UTF_8 n'est
																								// pas obligatoire
		infosBrutesVilles.remove(0); // Suppression de l'entête du tableau (première ligne)

		// Liste qui stockera QUELQUES infos (sélectionnées) des villes extraites du fichier CSV
//		List<String> listeInfosVilles = new ArrayList<>();
		
		// Création de ma liste qui stockera toutes les villes de France (de type Ville)
		List<Ville> listeVilles = new ArrayList<>();

		for (String line : infosBrutesVilles) {
			
			String[] tabInfosVilles = line.split(";"); // Conversion de chaque ligne CSV en tableau de String
			
			String codeRegion = tabInfosVilles[0];
			String nomRegion = tabInfosVilles[1];
			String codeDep = tabInfosVilles[2];
			String codeCommune = tabInfosVilles[5];
			String nomCommune = tabInfosVilles[6];
			int population = Integer.parseInt(tabInfosVilles[9].replaceAll(" ", ""));
			
//			String ligneSortie = codeRegion + ";" + nomRegion + ";" + codeDep + ";" 
//							  + codeCommune + ";" + nomCommune + ";" + population;
//			listeInfosVilles.add(ligneSortie);
			
			Ville ville = new Ville(codeRegion, nomRegion, codeDep, codeCommune, nomCommune, population);
			listeVilles.add(ville);
		}
		
		// Travail de recherche sur ma liste de Villes
		int popHerault = 0;
		int popMin = Integer.MAX_VALUE;
		Ville villePopMin = null;
		List<Ville> listeVillesHerault = new ArrayList<>();		
		
		for (Ville v : listeVilles) {
			// Etape 3 du TP
			if (v.getNomCommune().equalsIgnoreCase("Montpellier")) {
				System.out.println(v);
			}
			// Etapes 4 et 5
			if (v.getCodeDep().equals("34")) {
				popHerault += v.getPopulation();
				if (v.getPopulation() <= popMin) {
					popMin = v.getPopulation();
					villePopMin = v;
				}
				listeVillesHerault.add(v);
			}
		}
		System.out.println("Nombre d'habitants héraultais : " + popHerault + "\n");
		System.out.println("Ville hgéraultaise la moins peuplée : " + villePopMin + "\n");
		
		// Etape 6
		Collections.sort(listeVillesHerault, new ComparatorPopulation(false));
		List<Ville> liste10VillesMaxPop = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			liste10VillesMaxPop.add(listeVillesHerault.get(i));
		}
		System.out.println("Les 10 villes les PLUS peuplées de l'Hérault \n" + liste10VillesMaxPop + "\n");
		
		Collections.sort(listeVillesHerault, new ComparatorPopulation(true));
		List<Ville> liste10VillesMinPop = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			liste10VillesMinPop.add(listeVillesHerault.get(i));
		}
		System.out.println("Les 10 villes les MOINS peuplées de l'Hérault \n" + liste10VillesMinPop + "\n");
		
		// Etape 7
		int popOccitanie = 0;
		for (Ville v : listeVilles) {
			if (v.getNomRegion().equalsIgnoreCase("Occitanie")) {
				popOccitanie += v.getPopulation();
			}
		}
		System.out.println("Nombre d'habitants de l'Occitanie : " + popOccitanie + "\n");
		
		// Etape 8
		List<Ville> listeVillesOccitanie = new ArrayList<>();
		for (Ville v : listeVilles) {
			if (v.getNomRegion().equalsIgnoreCase("Occitanie")) {
				listeVillesOccitanie.add(v);
			}
		}
		
		Collections.sort(listeVillesOccitanie, new ComparatorPopulation(false));
		List<Ville> liste10BigVillesOccitanie = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			liste10BigVillesOccitanie.add(listeVillesOccitanie.get(i));
		}
		System.out.println("Les 10 villes les PLUS peuplées de l'Occitanie \n" +liste10BigVillesOccitanie + "\n");

		
		
		
		
		
//		Menu.displayMenu();
//		Scanner scan = new Scanner(System.in);
//		byte choix = -1;
//		while (choix < 0 || choix > 9) {
//			System.out.print("Votre choix (chiffre entre 1 et 9) : ");
//			choix = scan.nextByte();
//		}
//
//		Recensement recensement = new Recensement();
//		switch (choix) {
//		case 1:
//			RecherchePopulationVille recherche = new RecherchePopulationVille();
//			recherche.traiter(recensement,scanner);
//			break;
//		}

	}

}
