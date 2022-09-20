/**
 * 
 */
package fr.diginamic.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author EtienneUrbano
 *
 */
public class testLambda {

	private static final int AGE_MAJORITE = 18;

	/**
	 * @param args les paremtres de la methode
	 */
	public static void main(String[] args) {
		
		List<Personne> personnes = Arrays.asList(
			new Personne("Duchene", "Claude", 39),
			new Personne("Dujardin", "Melanie", 76),
			new Personne("Krank", "Giselle", 26),
			new Personne("Borne", "Jonathan", 15),
			new Personne("Toraidu", "Chloe", 17)
		);
//		Sinon, on ajoute chaque instance dans un taleau créee (List<Personne> personnes = new ArrayList<>();)   :
//		personnes.add(new Personne("Duchene", "Claude", 39));
//		personnes.add(new Personne("Dujardin", "Melanie", 76));   ETC.

		// Les expressions lambda peuvent être stockées dans des variables si le type de la variable est une interface
		// qui n'a qu'une seule méthode. L'expression lambda doit avoir le même nombre de paramètres et le même type de
		// retour que cette méthode. J'utilise ici l'interface Affirmer pour stocker 2 expressions lambda :
		Affirmer affirmerAge = p -> p.getAge() >= AGE_MAJORITE;
		Affirmer affirmerNom = p -> p.getNom().toLowerCase().contains("du");

		System.out.println(
				personnes.get(0).getPrenom() + " est une personne majeure ? : " + affirmerAge.filter(personnes.get(0)) + "\n"
			+ 	personnes.get(personnes.size() - 1).getPrenom() + " est une personne majeure ? : " + affirmerAge.filter(personnes.get(personnes.size() - 1)) + "\n"
			+	personnes.get(1).getPrenom() + " " + personnes.get(1).getNom() + " contient le terme 'Du' ? : " + affirmerNom.filter(personnes.get(1)) + "\n"
			+ 	personnes.get(4).getPrenom() + " " + personnes.get(4).getNom() + " contient le terme 'Du' ? : " + affirmerNom.filter(personnes.get(4))
		);


		// ----- un autre exemple avec la même liste de personnes -----
		// Je transforme une collection de Personne en collection de String representant leur nom
		// ou en collection d'entiers représentant leur age multiplie par 2
		Function<Personne, String> f1 = p -> p.getNom();
		// ou utiliser la reference de methode :   Function<Personne, String> f1 = Personne::getNom;
		Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
		System.out.println(transformToListString(personnes, f1));
		System.out.println(transformToListInt(personnes, f2));


		// ----- un autre exemple -----
		Etudiant etu = leNomAafficher -> System.out.println("Je me nomme " + leNomAafficher);
		etu.donnerNom("Marie-Claude");
	}

	public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
		List<String> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici le nom de l'objet Personne
		}
		return ls;
	}
	public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func){
		List<Integer> ls = new ArrayList<>();
		for (Personne p : list) {
			ls.add(func.apply(p));
			//func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
		}
		return ls;
	}
}
