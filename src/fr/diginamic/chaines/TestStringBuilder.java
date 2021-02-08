package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		String s = "";
		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		
		for (int i = 0; i < 100_000; i++) {
//			s += i;
			builder.append(i);
		}
		
		long fin = System.currentTimeMillis(); 
		
		System.out.println("Temp d'exécution : " + (fin - debut) + " ms");
		
	}

}
