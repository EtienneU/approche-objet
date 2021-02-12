package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		Saison[] saisons = Saison.values();
		
		System.out.print("Instances de mon enum Saison : ");
		for (Saison s : saisons) {
			System.out.print(s + " ");
		}
		
		String nom = "ETE";
		System.out.println("\nLibellé de la saison associée au nom '" + nom + "' : " + Saison.valueOf(nom).getLibelle());
		
		String libelle = "Hiver";
		Saison result = Saison.find(libelle);
		System.out.println("Résultat de recherche avec '" + libelle + "': saison '" + result.getLibelle() + "' (ordre n°" + result.getOrdre() + ")");
	
	}
	
}
