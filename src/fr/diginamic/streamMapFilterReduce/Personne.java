package fr.diginamic.streamMapFilterReduce;

public class Personne {

    public Double taille, poids;
    public String nom, prenom;
    public Couleur yeux;

    public Personne(double taille, double poids, String nom, String prenom, Couleur yeux) {
        this.taille = taille;
        this.poids = poids;
        this.nom = nom;
        this.prenom = prenom;
        this.yeux = yeux;
    }

    public String toString() {
        String s = "Je m'appelle " + nom + " " + prenom;
        s += ", je pèse " + poids + " kg";
        s += ", et je mesure " + taille + " m.";
        return s;
    }

    public Double getTaille() {return taille;}
    public void setTaille(Double taille) {this.taille = taille;}
    public Double getPoids() {return poids;}
    public void setPoids(Double poids) {this.poids = poids;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public Couleur getYeux() {return yeux;}
}
