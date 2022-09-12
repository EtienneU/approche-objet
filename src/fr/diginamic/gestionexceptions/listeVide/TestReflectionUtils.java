package fr.diginamic.gestionexceptions.listeVide;

public class TestReflectionUtils {

	public static void main(String[] args) {

		Ville ville = new Ville("Carpentras", 21_343);
				
		try {
			ReflectionsUtils.afficherAttributs(ville);
			ReflectionsUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (ReflectionException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
