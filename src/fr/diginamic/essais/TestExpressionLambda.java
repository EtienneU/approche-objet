/**
 * 
 */
package fr.diginamic.essais;

/**
 * @author EtienneUrbano
 *
 */
public class TestExpressionLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 4 expressions lambda. 
		// Ce sont des classes anonymes très simplifiées
		Operation addition = (a, b) -> a + b;
		Operation soustraction = (a, b) -> a - b;
		Operation multiplication = (a, b) -> a * b;
		Operation impro = (a, b) -> (a - b) * (5 * b - 3 * a);			

		System.out.println(addition.calcul(5, 8));
		System.out.println(soustraction.calcul(5, 8));
		System.out.println(multiplication.calcul(5, 8));
		System.out.println(impro.calcul(5, 8));

	}

}
