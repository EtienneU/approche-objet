package fr.diginamic.formesEtSalaries.geometrieInterface;

public class Cercle implements ObjetGeometrique {

	private double ray;

	public Cercle(double ray) {
		this.ray = ray;
	}
	
	@Override
	public double perimetre() {
		return 2 * Math.PI * ray;
	}

	@Override
	public double surface() {
		return Math.PI * Math.pow(ray, 2);
	}
	
}
