package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {

		// Tests ind�pendants 
		Path pathOrigin = Paths.get("C:/Users/urban/OneDrive/OD-Documents/DEV/Diginamic/Java/workspaceSTS/approche-objet/src/fr/diginamic/fichier/recensement.csv");
		Path pathCopy = Paths.get("C:/Users/urban/OneDrive/OD-Documents/DEV/Diginamic/Java/workspaceSTS/approche-objet/src/fr/diginamic/fichier/destination/recensementCopy.csv");
				
		System.out.println("Racine : " + pathOrigin.getRoot() + " - Nom de mon file : " + pathOrigin.getFileName());
		System.out.println("Le fichier point� par pathOrigin est lisible : " + Files.isReadable(pathOrigin));
		System.out.println("La cible du pathOrigin est un r�pertoire : " + Files.isDirectory(pathOrigin));

		Files.copy(pathOrigin, pathCopy, StandardCopyOption.REPLACE_EXISTING);
		
		// R�cup�ration du contenu de notre fichier (recensement) dans une liste
		List<String> fileLines = Files.readAllLines(pathOrigin, StandardCharsets.UTF_8); // l'option UTF_8 n'est pas obligatoire
		fileLines.remove(0); // Suppression de l'ent�te (premi�re ligne)
		
		// Cr�ation de ma liste dans laquelle je stockerai les villes s�lectionn�es
		List<String> selectedVilles = new ArrayList<>();
		selectedVilles.add("NomVilles;NumDep;NbrHbitants"); // Ajout de l'ent�te 
		
		for (String line : fileLines) {
			String[] tabInfosVilles = line.split(";"); // Conversion de chaque ligne CSV en tableau de String
			String nomVille = tabInfosVilles[6]; // R�cup�ration du nom de la ville
			String numDep = tabInfosVilles[2]; // R�cup�ration du num de d�partement de la ville
			int nbHab = Integer.parseInt(tabInfosVilles[9].replace(" ", ""));
			// D�tection et stockage des villes de plus de 25000 hab dans ma liste selectedVilles
			if (nbHab >= 25000) {
				Collections.addAll(selectedVilles, nomVille + ";" + numDep + ";" + nbHab);
			}
		}
		
		// G�n�ration du fichier CSV cible (path puis �criture)
		Path pathCible = Paths.get("C:/Users/urban/OneDrive/OD-Documents/DEV/Diginamic/Java/workspaceSTS/approche-objet/src/fr/diginamic/fichier/selection.csv");
		Files.write(pathCible, selectedVilles);
		
	}

}
