package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre th = new Theatre("L'Oignon Givré", (short)657, (short)35, 1360d);
		
		th.affichageEtat();
		
		th.inscrire((short)345, 45d);
		th.inscrire((short)67, 50d);
		th.inscrire((short)98, 55d);
		th.inscrire((short)132, 60d);
				
		th.affichageEtat();

	}

}
