package fr.diginamic.testenumeration;

import java.util.Set;

public class TestSaisonEnum {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();
		
		System.out.print("Instances de mon enum Saison : ");
		for (Saison s : saisons) {
			System.out.print(s + " ");
		}

		try {
			String nom = "ETE";
			System.out.println("\nLibelle de la saison associee au nom '" + nom + "' : " + Saison.valueOf(nom).getLibelle());

			String libelle = "Hiver";
			Saison result = Saison.find(libelle);
			System.out.println("Resultat de recherche avec '" + libelle + "': saison '" + result.getLibelle()
					+ "' (ordre n°" + result.getOrdre() + ")");

			String searchTerm = "a";
			Set<Saison> rechercheSaisons = Saison.findAll(searchTerm);
			String pluriel = rechercheSaisons.size() > 1 ? "s" : "";
			String resultSentence = "Saisons dont le libelle contient le terme '" + searchTerm + "': " + rechercheSaisons
					+ " (" + rechercheSaisons.size() + " element";
			System.out.println(resultSentence.concat(pluriel).concat(")"));
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
