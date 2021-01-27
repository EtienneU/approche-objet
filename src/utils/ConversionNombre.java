package utils;

public class ConversionNombre {

	public static void main(String[] args) {

		String chaine = "-190";
		int x = Integer.parseInt(chaine);
		System.out.println("x = " + x);
		
		int a = 6; 
		int b = -45;
		int max = Integer.max(a, b);
		System.out.println(max + " est le plus grand entier entre " + a + " et " + b);
	}

}
