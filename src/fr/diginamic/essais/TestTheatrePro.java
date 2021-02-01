package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		
		Spectacle[] tabSpectacles = new Spectacle[] {
				new Spectacle("Antigone", "improvisation", 21d, 330, 13),
				new Spectacle("Chromatica", "concert", 190d, 7200, 1123),
				new Spectacle("La Cantatrice Chauve", "comédie", 25d, 550, 120),
				new Spectacle("Fluides", "danse", 53d, 420, 290),
				new Spectacle("Jeux de Maux", "improvisation", 19d, 200, 159),
				new Spectacle("Nora Tour", "concert", 48d, 2400, 567),
				new Spectacle("Faux Amis", "comédie", 21d, 245, 27)

		};

		TheatrePro thPro = new TheatrePro("L'Autruche à Bulles", tabSpectacles);
		
//		th.affichageEtat();
		
//		th.inscrire((short)345, 45d);
//		th.inscrire((short)67, 50d);
//		th.inscrire((short)98, 55d);
//		th.inscrire((short)132, 60d);
//				
//		th.affichageEtat();

	}

}
