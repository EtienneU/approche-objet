package fr.diginamic.genericite;

import fr.diginamic.entites.Theatre;
import fr.diginamic.listes.Ville;

import java.lang.reflect.Method;

public class TestGenericite {

    public static void main(String[] args) {

        // Creation de 3 duos a partir de la classe generique
        GenericDuo<Double, String>      duoDoubleString     = new GenericDuo<>(4.5, "Oh My Double");
        GenericDuo<Boolean, Integer>    duoBooleanInteger   = new GenericDuo<>(false, -147);
        GenericDuo<Ville, Theatre>      duoVilleTheatre     = new GenericDuo<>(
                new Ville("Monteux", 13_000),
                new Theatre("CafeFail", (short)542, (short)425, 1246f)
        );

        // Affichage des elements constitutifs de chaque duo : valeur et classe de chaque attribut
        consoleElementsDescription(duoDoubleString);
        consoleElementsDescription(duoBooleanInteger);
        consoleElementsDescription(duoVilleTheatre);

        // Hors sujet : affichage du nom des methodes d'une classe
        Class<? extends GenericDuo> c = duoVilleTheatre.getClass();
        Method[] m = c.getMethods();
        System.out.println("Methodes de la classe " + c.getSimpleName() + ": ");
        for (Method method: m) {
            System.out.print(method.getName() + "()  ");
        }
    }

    /**
     * Methode d'affichage des elements constituant le duo generique passe en parametre
     * @param duo duo generique dont on extrait les valeurs d'attribut et leur classe respective
     */
    private static void consoleElementsDescription(GenericDuo<?, ?> duo) {
        if (duo == null) {
            System.out.println("Objet null");
        } else {
            Object obj1 = duo.getValueT1();
            Object obj2 = duo.getValueT2();
            System.out.println(duo.getClass().getSimpleName() + " : "
                    + obj1 + " (" + obj1.getClass().getSimpleName() + ") | "
                    + obj2 + " (" + obj2.getClass().getSimpleName() + ")\n");
        }
    }
}
