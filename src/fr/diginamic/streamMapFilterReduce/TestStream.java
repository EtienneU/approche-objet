package fr.diginamic.streamMapFilterReduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        // Je peux parcourir ma liste avec un Iterator, ou bien grace au stream (plus facile) !
        Stream<Personne> stramPersonnes = listP.stream();
        stramPersonnes.forEach(System.out::print);
    }
}
