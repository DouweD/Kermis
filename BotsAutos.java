
public class BotsAutos extends Attracties {

	
	private double prijs = 2.50;
	private String naam = "Botsauto's";
	
	
	public BotsAutos() {
		
	}
	
	public void setNaam(String attnaam) {
		naam = attnaam;
	}	
	/*
	public void setPrijs(double attprijs) {
		prijs = attprijs;
	}
	
	
		prijs = attPrijs;
		nummer = attNummer;
		naam = attNaam;
	}
	
	
	public double getPrijs() {
		return prijs;
	}
	*/
	public String getNaam() {
		return naam;
	}
	
	public void uitvoer() {
		System.out.println("De prijs voor de botsauto's bedraagt €"+ prijs +".");
	}
	
}
