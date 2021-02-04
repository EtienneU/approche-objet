package fr.diginamic.recensement.comparateurs;

import java.util.Comparator;

import fr.diginamic.recensement.entites.Ville;

public class ComparatorPopulation implements Comparator<Ville> {
	
	private boolean ascending = true;

	public ComparatorPopulation(boolean ascending) {
		super();
		this.ascending = ascending;
	}

	@Override
	public int compare(Ville v1, Ville v2) {
		int sign = ascending ? 1 : -1;

		if (v1.getPopulation() > v2.getPopulation()) {
			return sign * 1;
		}
		if (v1.getPopulation() < v2.getPopulation()) {
			return sign * -1;
		}
		return 0;
	}

}
