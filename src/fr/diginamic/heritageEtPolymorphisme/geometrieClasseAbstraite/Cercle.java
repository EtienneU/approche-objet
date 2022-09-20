package fr.diginamic.heritageEtPolymorphisme.geometrieClasseAbstraite;

public class Cercle extends Forme {
	private double ray;

	public Cercle(double ray) {
		super();
		this.ray = ray;
	}
	
	@Override
	public double calculerSurface() {
		return Math.PI * Math.pow(ray, 2);
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * ray;
	}
	
	public double getRay() {
		return ray;
	}

	public void setRay(double ray) {
		this.ray = ray;
	}
}
