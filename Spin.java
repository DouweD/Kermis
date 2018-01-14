
public class Spin extends Attracties {

	
	private double prijs = 2.25;
	private String naam = "Spin";
	
	
	public Spin() {
		
	}
	
	public void setNaam(String attnaam) {
		naam = attnaam;
	}	
	
	public void setPrijs(double attprijs) {
		prijs = attprijs;
	}
	
	/*
		prijs = attPrijs;
		nummer = attNummer;
		naam = attNaam;
	}
	
	*/
	public double getPrijs() {
		return prijs;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void uitvoer() {
		System.out.println("De prijs voor de " + naam + " bedraagt €"+ prijs +".");
	}
	
}
