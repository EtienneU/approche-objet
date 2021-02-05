package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.recensement.comparateurs.ComparatorPopulation;
import fr.diginamic.recensement.entites.Ville;

public class Application {

	public static void main(String[] args) throws IOException {

		Path pathFile = Paths.get(
				"C:/Users/urban/OneDrive/OD-Documents/DEV/Diginamic/Java/workspaceSTS/approche-objet/src/fr/diginamic/recensement/recensement.csv");
		// Etape 1
		// R�cup�ration des lignes du fichier CSV dans une liste de String
		List<String> infosBrutesVilles = Files.readAllLines(pathFile, StandardCharsets.UTF_8); // l'option UTF_8 n'est
																								// pas obligatoire
		infosBrutesVilles.remove(0); // Suppression de l'ent�te du tableau (premi�re ligne)

		// Liste qui stockera QUELQUES infos (s�lectionn�es) des villes extraites du fichier CSV
//		List<String> listeInfosVilles = new ArrayList<>();
		
		// Cr�ation de ma liste qui stockera toutes les villes de France (de type Ville)
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
		System.out.println("Nombre d'habitants h�raultais : " + popHerault + "\n");
		System.out.println("Ville h�raultaise la moins peupl�e : " + villePopMin + "\n");
		
		// Etape 6
		Collections.sort(listeVillesHerault, new ComparatorPopulation(false));
		List<Ville> liste10VillesMaxPop = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			liste10VillesMaxPop.add(listeVillesHerault.get(i));
		}
		System.out.println("Les 10 villes les PLUS peupl�es de l'H�rault \n" + liste10VillesMaxPop + "\n");
		
		Collections.sort(listeVillesHerault, new ComparatorPopulation(true));
		List<Ville> liste10VillesMinPop = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			liste10VillesMinPop.add(listeVillesHerault.get(i));
		}
		System.out.println("Les 10 villes les MOINS peupl�es de l'H�rault \n" + liste10VillesMinPop + "\n");
		
		// Etape 7
		int popOccitanie = 0;
		for (Ville v : listeVilles) {
			if (v.getNomRegion().equalsIgnoreCase("Occitanie")) {
				popOccitanie += v.getPopulation();
			}
		}
		System.out.println("Nombre d'habitants de l'Occitanie : " + popOccitanie + "\n");
		
		// Etape 8
		// Creation de ma liste de villes occitanes
		List<Ville> listeVillesOccitanie = new ArrayList<>();
		for (Ville v : listeVilles) {
			if (v.getNomRegion().equalsIgnoreCase("Occitanie")) {
				listeVillesOccitanie.add(v);
			}
		}
		
		// R�cup�ration des 10 villes occitanes les plus peupl�es
		Collections.sort(listeVillesOccitanie, new ComparatorPopulation(false));
		List<Ville> liste10BigVillesOccitanie = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			liste10BigVillesOccitanie.add(listeVillesOccitanie.get(i));
		}
		System.out.println("Les 10 villes les PLUS peupl�es de l'Occitanie \n" + liste10BigVillesOccitanie + "\n");
		
		// HashMap pour stocker le nombre d'habitants par d�partement de la r�gion Occitanie
		HashMap<String, Integer> populationParDepOccitan = new HashMap<>();
		for (int i = 0; i < listeVillesOccitanie.size(); i++) {
			
			Ville ville = listeVillesOccitanie.get(i); // ville courante
			String dep = ville.getCodeDep();
			
			Integer compteurPop = populationParDepOccitan.get(dep);
			if (compteurPop == null) { // Si le compteur n'existe pas, je le cr�� et l'initialise
				compteurPop = ville.getPopulation();
			}
			else { // S'il existe je l'incr�mente
				compteurPop += ville.getPopulation();
			}
			// Je restocke la nouvelle valeur du compteur pour ce d�partement "cl�"
			populationParDepOccitan.put(ville.getCodeDep(), compteurPop);
		}
		
		// Affichage de ma HashMap		
		System.out.print("Nbr d'habitants (valeur) par D�partements (cl�) en Occitanie: \n[");
		Iterator<String> iterDep = populationParDepOccitan.keySet().iterator();
		while (iterDep.hasNext()) {
			String dep = iterDep.next();
			if (iterDep.hasNext()) {
				System.out.print(dep + ": " + populationParDepOccitan.get(dep) + ",\n");
			} else {
				System.out.println(dep + ": " + populationParDepOccitan.get(dep) +  "]\n");
			}
		}
		
		// Recherche du d�partement le plus peupl�
		int popDepMax = Integer.MIN_VALUE;
		String depMaxPop = null;
		iterDep = populationParDepOccitan.keySet().iterator(); // Je r�utilise ma variable de type Iterator
		while (iterDep.hasNext()) {
			String dep = iterDep.next();
			int pop = populationParDepOccitan.get(dep);
			if (pop >= popDepMax) {
				popDepMax = pop;
				depMaxPop = dep;
			}
		}
		System.out.println("Code du d�partement occitan le PLUS peupl� : " + depMaxPop + "\n");
		
		// Etape 9
		// Cr�ation d'une HashMap qui stocke la population par Region
		HashMap<String, Integer> populationParRegion = new HashMap<>();
		for (Ville v : listeVilles) {
			
			String region = v.getNomRegion();			
			Integer compteurPop = populationParRegion.get(region);
			if (compteurPop == null) {
				compteurPop = v.getPopulation();
			}
			else {
				compteurPop += v.getPopulation();
			}
			populationParRegion.put(region, compteurPop);
		}		
						
		// Recherche des 10 R�gions les plus peupl�es de France		
		List<String> listeRegions = new ArrayList<>(populationParRegion.keySet());		
		List<String> liste10RegionsPopMax = new ArrayList<>();

		int nbrRegionResultat = 10;
		while (nbrRegionResultat > 0) {
			
			int popMax = Integer.MIN_VALUE;
			String regionPopMax = null;
			for (String region : listeRegions) {
				int pop = populationParRegion.get(region);
				if (pop >= popMax) {
					popMax = pop;
					regionPopMax = region;
				}
			}
			
			liste10RegionsPopMax.add(regionPopMax);
			listeRegions.remove(regionPopMax);
			
			nbrRegionResultat--;
		}
		
		// Affichage exhaustif du r�sultat
		System.out.println("Les 10 r�gions fran�aises les plus peupl�es : "); 
		byte classement = 1;
		for (String region : liste10RegionsPopMax) {
			System.out.println(classement++ + "- " + region + " (" + populationParRegion.get(region) + " hab)");
		}
		System.out.println("");
		
		// Recherche des 10 departements les plus peupl�s de France
		// Cr�ation HashMap du nombre d'habitants par d�partement 
		HashMap<String, Integer> populationParDepFrance = new HashMap<>();
		for (int i = 0; i < listeVilles.size(); i++) {
			
			Ville ville = listeVilles.get(i);
			String dep = ville.getCodeDep();
			
			Integer compteurPop = populationParDepFrance.get(dep);
			if (compteurPop == null) {
				compteurPop = ville.getPopulation();
			}
			else {
				compteurPop += ville.getPopulation();
			}
			populationParDepFrance.put(ville.getCodeDep(), compteurPop);
		}

		List<String> listeDep = new ArrayList<>(populationParDepFrance.keySet());		
		List<String> liste10DepPopMax = new ArrayList<>();
		
		int nbrDepResultat = 10;
		while (nbrDepResultat > 0) {
			
			int popMax = Integer.MIN_VALUE;
			String depPopMax = null;
			for (String dep : listeDep) {
				int pop = populationParDepFrance.get(dep);
				if (pop >= popMax) {
					popMax = pop;
					depPopMax = dep;
				}
			}
			
			liste10DepPopMax.add(depPopMax);
			listeDep.remove(depPopMax);
			
			nbrDepResultat--;
		}
		
		// Affichage exhaustif des 10 d�partements les plus peupl�s 
		System.out.println("Les 10 d�partements fran�ais les plus peupl�es : "); 
		classement = 1;
		for (String dep : liste10DepPopMax) {
			System.out.println(classement++ + "- " + dep + " (" + populationParDepFrance.get(dep) + " hab)");
		}
		System.out.println("");
		
		// Recherche des 10 villes fran�aises les plus peupl�s
		List<Ville> liste10VillesPopMax = new ArrayList<>();
		int nbrVillesResultat = 10;
		while (nbrVillesResultat > 0) {
			
			int popMax = Integer.MIN_VALUE;
			Ville villePopMax = null;
			for (Ville v : listeVilles) {
				int pop = v.getPopulation();
				if (pop >= popMax) {
					popMax = pop;
					villePopMax = v;
				}
			}
			
			liste10VillesPopMax.add(villePopMax);
			listeVilles.remove(villePopMax);
			
			nbrVillesResultat--;
		}
		
		// Affichage exhaustif des 10 d�partements les plus peupl�s 
		System.out.println("Les 10 villes fran�aises les plus peupl�es : ");
		classement = 1;
		for (Ville v : liste10VillesPopMax) {
			System.out.println(classement++ + "- " + v.getNomCommune() + " (" + v.getPopulation() + " hab)");
		}

	}

}
