package fr.diginamic.streamMapFilterReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 49, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 51, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        // A l'instar d'un Iterator, je peux parcourir une collection avec un Stream ! Voici qulques exemples de traitements :
        Stream<Personne> streamPersonnes = listP.stream();
        System.out.println("\n-----> Liste de toutes les Personnes:");
        // forEach() est une methode terminale sur un stream : elle consomme le stream.
        // J'utilise parfois une reference de methode pour alleger le code
        streamPersonnes.forEach(System.out::println);

        // ================== filter() ==================
        // filter() est une methode intermediaire car elle ne consomme pas le Stream mais lui applique un traitement
        System.out.println("\n-----> Personnes depassant les 69kg [avec filter()]:");
        listP.stream().filter(p -> p.getPoids() > 69d).forEach(System.out::println);

        // =============== filter() map() ===============
        System.out.println("\n-----> Extraction du nom et de la taille des personnes dont le prenom contient "
                + "la lettre 'l' [filter() puis map()] :");
        listP.stream()
                .filter(p -> p.getPrenom().contains("l"))
                .map(personne -> (personne.getNom() + " : " + personne.getTaille() + "m"))
                .forEach(System.out::println);

        // ==== filter() map() reduce() and count() =====
        double tailleMax = 1.7;
        System.out.println("\n-----> Somme des poids des personnes de moins de " + tailleMax + "m "
                + "[Optional Class, filter(), map(reference de methode), reduce() / count()] :");
        Optional<Double> sum = listP.stream()
                .filter(p -> p.getTaille() < tailleMax)
                .map(Personne::getPoids)
                .reduce((x, y) -> x + y);
        if (sum.isPresent()) {
            long count = listP.stream().filter(p -> p.getTaille() < tailleMax).count();
            String pluriel = count > 1 ? "s" : "";
            System.out.println(count + " personne"+ pluriel + " concernee" + pluriel + " : poids total = " + sum.get() + " (kg)");
        } else {
            System.out.println("Personne ne fait moins de " + tailleMax + "m...");
        }
        // Ou sinon je peux utiliser une valeur par defaut si l'objet optional ne contient aucune valeur :
        System.out.println(sum.orElse(0.0));

        // ====== Colectors.toList() et .toMap() ========
        // Recuperation d'un Stream sous forme d'une List, d'un Set ou d'une Map
        Stream<Personne> streamForList = listP.stream();
        List<Couleur> filteredListP = streamForList
                .filter(p -> p.getPrenom().startsWith("N"))
                .map(Personne::getYeux)
                .collect(Collectors.toList());
        System.out.println(filteredListP);

        Stream<Personne> streamForMap = listP.stream();
        Map<String, Couleur> filteredPrenomYeuxMap = streamForMap
                .filter(p -> p.getTaille() > 1.75)
                .collect(Collectors.toMap(Personne::getPrenom, Personne::getYeux));
        System.out.println(filteredPrenomYeuxMap);

        // ================= iterate() ==================
        // Exemple d'implemention de la methode iterate() qui cree un stream infini si on ne le limite pas
        System.out.println("\n-----> Exemple d'implementation de la methode iterate() :");
        Stream.iterate(1d, x -> 3 * x).limit(10).forEach(System.out::println);
    }
}
