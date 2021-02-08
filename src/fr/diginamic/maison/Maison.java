package fr.diginamic.maison;

public class Maison {

	private Piece[] tabPieces;

	public Maison(Piece[] tabPieces) {
		this.tabPieces = tabPieces;
	}

	public void ajouterPiece(Piece piece) {

		Piece[] temp = new Piece[this.tabPieces.length + 1];
		for (int i = 0; i < tabPieces.length; i++) {
			temp[i] = tabPieces[i];
		}

		if (piece == null) {
			System.out.println("Erreur 'Piece is null'. Ajout par défaut : Chambre de 9m²");
			temp[tabPieces.length] = new Chambre(9f, (short) 0);
		} else {
			temp[tabPieces.length] = piece;
		}

		this.tabPieces = temp;

	}

	public float getSuperficieTot() {
		float superficieTot = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			superficieTot += tabPieces[i].getSuperficie();
		}
		return superficieTot;
	}

	public float getSuperficieParEtage(short etage) {
		float superficieEtage = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getNumEtage() == etage) {
				superficieEtage += tabPieces[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	public float getSuperficieParTypePiece(byte type) {
		float superficie = 0;
		if (type == (short) 1) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Chambre) {
					superficie += tabPieces[i].getSuperficie();
				}
			}
		} else if (type == (short) 2) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Salon) {
					superficie += tabPieces[i].getSuperficie();
				}
			}
		} else if (type == (short) 3) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Cuisine) {
					superficie += tabPieces[i].getSuperficie();
				}
			}
		} else if (type == (short) 4) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof SalleDeBain) {
					superficie += tabPieces[i].getSuperficie();
				}
			}
		} else if (type == (short) 5) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Wc) {
					superficie += tabPieces[i].getSuperficie();
				}
			}
		}
		return superficie;
	}

	public short getNbPiecesParTypePiece(byte type) {
		short nb = 0;
		if (type == (short) 1) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Chambre) {
					nb++;
				}
			}
		} else if (type == (short) 2) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Salon) {
					nb++;
				}
			}
		} else if (type == (short) 3) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Cuisine) {
					nb++;
				}
			}
		} else if (type == (short) 4) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof SalleDeBain) {
					nb++;
				}
			}
		} else if (type == (short) 5) {
			for (int i = 0; i < tabPieces.length; i++) {
				if (tabPieces[i] instanceof Wc) {
					nb++;
				}
			}
		}
		return nb;
	}
	
	public short getEtages() {
		short etageMax = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getNumEtage() >= etageMax) {
				etageMax = tabPieces[i].getNumEtage();
			}
		}
		return etageMax;
	}
	
	public void afficheDescription() {
		System.out.print("\nMaison de " + this.getSuperficieTot() + " m² ");
		if (this.getEtages() == 0) {
			System.out.print(" plain-pied ");
		} else {
			System.out.print("sur " + (this.getEtages() + 1) + " niveaux (RDC + " + this.getEtages() + " étage-s) ");
		}
		System.out.println("disposant de " + this.tabPieces.length + " pièces : ");	
		System.out.println(" -  " + this.getNbPiecesParTypePiece((byte) 1) + " chambre-s  " 
				+ this.getSuperficieParTypePiece((byte) 1) + " m² au total");
		System.out.println(" -  " + this.getNbPiecesParTypePiece((byte) 2) + " salon-s    " 
				+ this.getSuperficieParTypePiece((byte) 2) + " m² au total");
		System.out.println(" -  " + this.getNbPiecesParTypePiece((byte) 3) + " cuisine-s  " 
				+ this.getSuperficieParTypePiece((byte) 3) + " m² au total");
		System.out.println(" -  " + this.getNbPiecesParTypePiece((byte) 4) + " SDB        " 
				+ this.getSuperficieParTypePiece((byte) 4) + " m² au total");
		System.out.println(" -  " + this.getNbPiecesParTypePiece((byte) 5) + " Wc         " 
				+ this.getSuperficieParTypePiece((byte) 5) + " m² au total");

		if (this.getEtages() > 0) {
			for (short i = 0; i <= this.getEtages(); i++) {
				if (i == 0) {
					System.out.print(this.getSuperficieParEtage(i) + " m² au RDC | ");
				} else if (i == 1) {
					System.out.print(this.getSuperficieParEtage(i) + " m² au 1er étage | ");
				} else {
					System.out.print(this.getSuperficieParEtage(i) + " m² au " + i + "ème étage | ");
				}
			}
			System.out.println("\n");
		}
		
		//		m1.getSuperficieParEtage((short) 0) + " m² au RDC - " + m1.getSuperficieParEtage((short) 1)
	}

	public Piece[] getTabPieces() {
		return tabPieces;
	}

	public void setTabPieces(Piece[] tabPieces) {
		this.tabPieces = tabPieces;
	}

}
