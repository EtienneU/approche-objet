package fr.diginamic.entrypoints;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre th = new Theatre("L'Oignon Givré", (short)657, (short)35, 1360f);
		
		th.affichageEtat();
		
		th.inscrire((short)345, 45f);
		th.inscrire((short)67,  50f);
		th.inscrire((short)98,  55f);
		th.inscrire((short)132, 60f);
				
		th.affichageEtat();
	}
}
