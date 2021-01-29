package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle generateCercle(double ray) {
		return new Cercle(ray);
	}
}
