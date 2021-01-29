package fr.diginamic.entites;

public class Cercle {

	private double ray;

	public Cercle(double ray) {
		this.ray = ray;
	}
	
	public double perimetre() {
		return 2 * Math.PI * ray;
	}

	public double surface() {
		return Math.PI * Math.pow(ray, 2);
	}

	public double getRay() {
		return ray;
	}

	public void setRay(double ray) {
		this.ray = ray;
	}
	
}
