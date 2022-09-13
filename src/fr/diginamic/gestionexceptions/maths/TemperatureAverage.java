package fr.diginamic.gestionexceptions.maths;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TemperatureAverage {

    final static Integer NUMBER_OF_TEMP = 5;

    /** affiche la temperature moyenne a partir des valeurs fournies
     *
     * @param args liste de temperatures separees par des espaces
     */
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<>();

            // remplir la liste a partir des saisies utilisateur
            System.out.println("Saisir les 5 temperatures : ");
            for (int i = 0; i < NUMBER_OF_TEMP; i++) {
                Integer temperature = sc.nextInt();
                recordedTemperaturesInDegreesCelcius.add(temperature);
            }

            // calcule et affiche la temperature moyenne
            Integer averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
            System.out.println("The average temperature is " + averageTemperature);
        } catch (InputMismatchException ime) {
            System.out.println(ime + " : you have to enter only integers, not litteral characters, neither decimals");
            ime.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("A number is expected");
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (Exception e) {
            System.out.println("EXCEPTION ! : ");
            e.printStackTrace();
        } finally {
            System.out.println("the end");
        }
    }
}
