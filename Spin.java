
public class Spin extends Attracties {

	
	private double prijs = 2.25;
	private String naam = "SPIN";
	
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
		System.out.println("\nDE PRIJS VOOR DE " + naam + " BEDRAAGT €"+ prijs +".");
	}
	
}
