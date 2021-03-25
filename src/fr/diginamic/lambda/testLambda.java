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
		personnes.add(new Personne("Duchêne", "Claude", 39));
		personnes.add(new Personne("Dujardin", "Melanie", 76));
		personnes.add(new Personne("Krank", "Giselle", 26));
		personnes.add(new Personne("Borne", "Jonathan", 15));

		Predicate predicateAge = p -> p.getAge() >= AGE_MAJORITE;
		Predicate predicateNom = p -> p.getNom().contains("Du");
		
		System.out.println(personnes.get(3).getPrenom() + " est une personne majeure : " + predicateAge.filter(personnes.get(3)));
		System.out.println(personnes.get(1).getPrenom() + " " + personnes.get(1).getNom() + " contient le terme 'Du' : " + predicateNom.filter(personnes.get(1)));

	}

}
