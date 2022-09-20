package fr.diginamic.streamMapFilterReduce;

public class Personne {

    public Double taille = 0.0d, poids = 0.0d;
    public String nom = "", prenom = "";
    public Couleur yeux = Couleur.INCONNU;

    public Personne() {	}

    public Personne(double taille, double poids, String nom, String prenom, Couleur yeux) {
        this.taille = taille;
        this.poids = poids;
        this.nom = nom;
        this.prenom = prenom;
        this.yeux = yeux;
    }

    public String toString() {
        String s = "Je m'appelle " + nom + " " + prenom;
        s += ", je pèse " + poids + " Kg";
        s += ", et je mesure " + taille + " cm.";
        return s;
    }

    public Double getTaille() {return taille;}
    public void setTaille(Double taille) {this.taille = taille;}
    public Double getPoids() {return poids;}
    public void setPoids(Double poids) {this.poids = poids;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public Couleur getYeux() {return yeux;}
    public void setYeux(Couleur yeux) {this.yeux = yeux;}
}
