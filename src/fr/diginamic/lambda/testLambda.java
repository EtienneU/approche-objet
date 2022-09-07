/**
 * 
 */
package fr.diginamic.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EtienneUrbano
 *
 */
public class testLambda {

	private static final int AGE_MAJORITE = 18;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Personne> personnes = new ArrayList<>();
		personnes.add(new Personne("Duchene", "Claude", 39));
		personnes.add(new Personne("Dujardin", "Melanie", 76));
		personnes.add(new Personne("Krank", "Giselle", 26));
		personnes.add(new Personne("Borne", "Jonathan", 15));
		personnes.add(new Personne("Toraidu", "Chloe", 17));

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
	}
}
