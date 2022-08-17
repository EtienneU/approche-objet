package fr.diginamic.maison;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Piece {

	private float superficie;
	private short numEtage;

	public Piece(float superficie, short numEtage) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			while (superficie < 0 || superficie > Float.MAX_VALUE) {
				System.out.print("Superficie négative ou trop importante renseignée ! Saisir une superficie valide (en m²) : ");
				superficie = scanner.nextFloat();
			}
        } catch (InputMismatchException ime) {
            System.out.println("Mauvaise saisie. Une superficie valide (en m²) était attendue... La valeur par défaut de 9m² est attribuée !");
            superficie = 9f;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		
		this.superficie = superficie;
				
		if (numEtage < 0) {
			System.out.println("Numéro d'étage négatif renseigné ! Valorisation appliquée : numEtage = 0 (RDC)");
			this.numEtage = 0;
		} else {
			this.numEtage = numEtage;
		}
	}
	
	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public short getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(short numEtage) {
		this.numEtage = numEtage;
	}
}
