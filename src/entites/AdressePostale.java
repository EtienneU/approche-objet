package entites;

public class AdressePostale {

	public int 		numeroRue;
	public String 	libelleRue;
	public String 	codePostal;
	public String 	ville;

	public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
		this.numeroRue 	= numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville 		= ville;
	}
	
	public void afficheAdressePostale() {
		System.out.println(this.numeroRue + " " + this.libelleRue + " - " + this.codePostal + ", " + this.ville);
	}
	
	public String getAdressePostale() {
		return (this.numeroRue + " " + this.libelleRue + " - " + this.codePostal + ", " + this.ville);
	}
}
