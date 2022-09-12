package fr.diginamic.gestionexceptions.listeVide;

import java.lang.reflect.Field;

public class ReflectionsUtils {

	public static void afficherAttributs(Object obj) 
			throws IllegalArgumentException, IllegalAccessException, ReflectionException {

		if (obj == null) {
			throw new ReflectionException("L'objet passé en paramètre est null. Reessayer.");
		}

		// On commence par recuperer la classe de l'objet passe en parametre.
		// la classe fournit toutes les informations sur la structure d'un objet.
		Class<?> classe = obj.getClass();
		// Sur cette classe on recupere le tableau des variables d'instance
		Field[] fields = classe.getDeclaredFields();

		for (Field field : fields) {
			// On force l'acces a l'attribut depuis une classe externe. On change l'acces en "public"
			field.setAccessible(true);
			// Affichage
			System.out.println("La valeur de l'attribut \"" + field.getName() + "\" est " + field.get(obj).toString());
		}
	}
}
