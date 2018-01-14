
public class SpookHuis extends Attracties {

	
	private double prijs = 3.20;
	private String naam = "SPOOKHUIS";
	
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
		System.out.println("\nDE PRIJS VOOR ONS SICKE " + naam + " BEDRAAGT €"+ prijs +".");
	}
	
}
