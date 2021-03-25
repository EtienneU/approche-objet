/**
 * 
 */
package fr.diginamic.essais;

/**
 * @author EtienneUrbano
 *
 */
public class TestClasseAnonyme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Operation addition = new Operation() {

			@Override
			public int calcul(int a, int b) {
				return a + b;
			}
			
		};
		
		Operation soustraction = new Operation() {

			@Override
			public int calcul(int a, int b) {
				return a - b;
			}
			
		};
		
		Operation multiplication = new Operation() {

			@Override
			public int calcul(int a, int b) {
				return a * b;
			}
			
		};
		
		Operation impro = new Operation() {

			@Override
			public int calcul(int a, int b) {
				return (a-b) * (5*b-3*a);
			}
			
		};
		
		System.out.println(addition.calcul(5, 8));
		System.out.println(soustraction.calcul(5, 8));
		System.out.println(multiplication.calcul(5, 8));
		System.out.println(impro.calcul(5, 8));

		
	}

}
