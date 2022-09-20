package fr.diginamic.recenscomplet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.diginamic.recenscomplet.entites.Departement;
import fr.diginamic.recenscomplet.entites.Pays;
import fr.diginamic.recenscomplet.entites.Region;
import fr.diginamic.recenscomplet.entites.Ville;

public class Recensement {

	private int compteurVilles;
	private Map<String, Region> mapRegions = new HashMap<>();
	private Map<String, Departement> mapDep = new HashMap<>();
	private Pays france;

	// Mon constructeur détient l'intelligence de ma classe
	public Recensement(String file) throws IOException {

		Path pathFile = Paths.get(file);
		// Récupération des lignes du fichier CSV dans une liste de String
		List<String> infosBrutesVilles = Files.readAllLines(pathFile); // l'option UTF_8 est active par défaut
		infosBrutesVilles.remove(0); // Je retire la ligne d'entête

		france = new Pays("France");
		
		int compteur = 0;
		for (String line : infosBrutesVilles) {

			String[] tabInfosVilles = line.split(";"); // Conversion de chaque ligne CSV en tableau de String

			String codeRegion = tabInfosVilles[0];
			String nomRegion = tabInfosVilles[1];
			String codeDep = tabInfosVilles[2];
			String codeCommune = tabInfosVilles[6];
			String nomCommune = tabInfosVilles[6];
			int populationTotale = Integer.parseInt(tabInfosVilles[9].replaceAll(" ", ""));

			// On vérifie si ma mapRegion possède déjà la clé codeRegion
			if (!mapRegions.containsKey(codeRegion)) {
				Region region = new Region(codeRegion, nomRegion, france);
				mapRegions.put(codeRegion, region);
			}

			if (!mapDep.containsKey(codeDep)) {
				Departement dep = new Departement(codeDep, codeDep, mapRegions.get(codeRegion), france);
				mapDep.put(codeDep, dep);
			}

			Ville ville = new Ville(codeCommune, codeCommune, mapDep.get(codeDep), mapRegions.get(codeRegion), populationTotale, france);
			
			compteur++;
		}

		// Test d'affichage
//		for (Region region : mapRegions.values()) {
//			region.getInfos();
//		}
//		for (Departement dep : mapDep.values()) {
//			dep.getInfos();
//		}
//		france.getInfos();
		
		this.compteurVilles = compteur;
	}

	// Methode générique pour traiter les données d'un fichier
	public void recencerFichier(String pathFile) throws IOException {

	}

	public int getCompteurVilles() {
		return compteurVilles;
	}
	
	public Pays getPays() {
		return france;
	}
}
