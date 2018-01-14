
public class SpookHuis extends Attracties {

	
	private double prijs = 3.20;
	private String naam = "Spookhuis";
	
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
		System.out.println("De prijs voor dit ziek enge " + naam + " bedraagt €"+ prijs +".");
	}
	
}
