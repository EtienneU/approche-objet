package fr.diginamic.streamMapFilterReduce;

public enum Couleur {
    MARRON("marron"),
    BLEU("bleu"),
    VERT("vert"),
    VERRON("verron"),
    INCONNU("non déterminé"),
    ROUGE("rouge mais j'avais piscine...");

    private String name = "";

    Couleur(String n){name = n;}
    public String toString() {return name;}
}
