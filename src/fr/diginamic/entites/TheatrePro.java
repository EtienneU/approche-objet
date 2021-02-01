package fr.diginamic.entites;

public class TheatrePro {
	
	private String nom;
	private Spectacle[] tabSpectacles;
	
	public TheatrePro(String nom, Spectacle[] tabSpectacles) {
		super();
		this.nom = nom;
		this.tabSpectacles = tabSpectacles;
	}
	
	public void ajouterSpectacle(Spectacle spectacle) {
	}
	
	public Spectacle getSpectacle(String nom) {
		return null;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Spectacle[] getTabSpectacles() {
		return tabSpectacles;
	}

	public void setTabSpectacles(Spectacle[] tabSpectacles) {
		this.tabSpectacles = tabSpectacles;
	}

}
