package fr.diginamic.gestionexceptions.maths;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

    /** affiche la temperature moyenne a partir des valeurs fournies comme arguments en ligne de commande
     *
     * @param args liste de temperatures separees par des espaces
     */
    public static void main(String[] args) {
        List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<Integer>();

        // remplir la liste a partir des valeurs fournies comme arguments en ligne de commande
        for (String stringRepresentationOfTemperature : args) {
            int temperature = Integer.parseInt(stringRepresentationOfTemperature);
            recordedTemperaturesInDegreesCelcius.add(temperature);
        }

        // calcule et affiche la temperature moyenne
        Integer averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
        System.out.println("The average temperature is " + averageTemperature);
    }
}
