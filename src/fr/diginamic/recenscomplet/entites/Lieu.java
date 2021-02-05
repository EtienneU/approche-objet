package fr.diginamic.recenscomplet.entites;

import java.util.ArrayList;
import java.util.List;

public abstract class Lieu implements Comparable { // classe mère de Ville, Departement, Region et Pays
	
	protected Integer population = 0; // classe Integer pour nos futures HashMap
	protected String code; // identifiant unique
	protected String nom;
	protected List<Lieu> listeVille = new ArrayList<>();
	
	public Lieu(String nom, String code) {
		this.code = code;
		this.nom = nom;
	}

	/**
	 * Methode d'affichage du nom et du nombre d'habitant du lieu
	 * 
	 */
	public void getInfos() {
		System.out.println(this.nom + " - " + this.population + " hab");
	}
	
	public Integer getPopulation() {
		return population;
	}

	public String getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public List<Lieu> getListeVille() {
		return listeVille;
	}
	
	@Override
	public int compareTo(Object o) {
		Lieu autreLieu = (Lieu)o;
		return  this.population.compareTo(autreLieu.population);
	}
	
}
