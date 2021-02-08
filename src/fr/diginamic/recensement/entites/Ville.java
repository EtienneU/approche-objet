package fr.diginamic.recensement.entites;

public class Ville {
	
	private String 	codeRegion;
	private String 	nomRegion;
	private String 	codeDep;
	private String 	codeCommune;
	private String 	nomCommune;
	private int 	population;
	
	public Ville(String codeRegion, String nomRegion, String codeDep, String nomDep, String nomCommune,
			int population) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDep = codeDep;
		this.codeCommune = nomDep;
		this.nomCommune = nomCommune;
		this.population = population;
	}
	
	// Etape 2
	@Override
	public String toString() {
		return nomCommune.toUpperCase() + " (code commune " + codeCommune + ") : région " + nomRegion 
				+ " (code " + codeRegion + "), dep = " + codeDep + ", pop = " + population + " hab\n";
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
