package fr.diginamic.entrypoints;

/**
 * @author EtienneUrbano
 *
 */
public class TestOperationExpressionLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 4 exemples d'expressions lambda : ce sont des classes anonymes très simplifiées
		OperationInterface addition = (a, b) -> a + b;
		OperationInterface soustraction = (a, b) -> a - b;
		OperationInterface multiplication = (a, b) -> a * b;
		OperationInterface impro = (a, b) -> (a - b) * (5 * b - 3 * a);			

		System.out.println(addition.calcul(5, 8));
		System.out.println(soustraction.calcul(5, 8));
		System.out.println(multiplication.calcul(5, 8));
		System.out.println(impro.calcul(5, 8));

	}
}
