package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		if (v1.getNbHab() > v2.getNbHab()) {
			return 1;
		}
		if (v1.getNbHab() < v2.getNbHab()) {
			return -1;
		}
		return 0;
	}

}
