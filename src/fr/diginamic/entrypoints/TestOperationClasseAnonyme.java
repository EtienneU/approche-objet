package fr.diginamic.entrypoints;

/**
 * @author EtienneUrbano
 *
 */
public class TestOperationClasseAnonyme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		OperationInterface addition = new OperationInterface() {
			@Override
			public int calcul(int a, int b) {
				return a + b;
			}
		};
		
		OperationInterface soustraction = new OperationInterface() {
			@Override
			public int calcul(int a, int b) {
				return a - b;
			}
		};
		
		OperationInterface multiplication = new OperationInterface() {
			@Override
			public int calcul(int a, int b) {
				return a * b;
			}
		};
		
		OperationInterface impro = new OperationInterface() {
			@Override
			public int calcul(int a, int b) {
				return (a - b) * (5 * b - 3 * a);
			}
		};
		
		System.out.println(addition.calcul(5, 8));
		System.out.println(soustraction.calcul(5, 8));
		System.out.println(multiplication.calcul(5, 8));
		System.out.println(impro.calcul(5, 8));
		
	}
}
