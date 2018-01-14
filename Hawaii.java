
public class Hawaii extends Attracties {

	
	private double prijs = 73523.99;
	private String naam = "HAWAII";
	
	public void setNaam(String attnaam) {
		naam = attnaam;
	}	
	
	public void setPrijs(double attprijs) {
		prijs = attprijs;
	}
	
	public double getPrijs() {
		return prijs;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void uitvoer() {
		System.out.println("\nU HEEFT ZOJUIST EEN RETOUR " + naam + " MET KLM GEBOEKT VOOR SLECHTS €" + prijs + ". ENJOY!");
	}
	
}
