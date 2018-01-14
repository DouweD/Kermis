
public class SpiegelPaleis extends Attracties {

	
	private double prijs = 2.75;
	private String naam = "Spiegelpaleis";
	
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
		System.out.println("De prijs voor het " + naam + " bedraagt €"+ prijs +".");
	}
	
}
