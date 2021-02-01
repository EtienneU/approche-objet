package fr.diginamic.maison;

import java.util.Scanner;

public abstract class Piece {

	private float superficie;
	private short numEtage;

	public Piece(float superficie, short numEtage) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (superficie < 0) {
			System.out.print("Superficie n�gative renseign�e ! Saisir une superficie valide (en m�) : ");
			superficie = scanner.nextFloat();
		}
		
		this.superficie = superficie;
				
		if (numEtage < 0) {
			System.out.println("Num�ro d'�tage n�gatif renseign� ! Valorisation appliqu�e : numEtage = 0 (RDC)");
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
