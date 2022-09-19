package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		long debut = System.currentTimeMillis();
		
		for (int i = 0; i < 1_000_000; i++) {
			builder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		System.out.println("Temp d'exécution : " + (fin - debut) + " ms");
	}
}
