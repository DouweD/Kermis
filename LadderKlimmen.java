
public class LadderKlimmen extends Attracties {

	
	private double prijs = 5.00;
	private String naam = "LADDERKLIMMEN";
	
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
		System.out.println("\nDE PRIJS VOOR HET " + naam + " BEDRAAGT �"+ prijs +".");
	}
	
}
