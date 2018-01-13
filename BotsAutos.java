
public class BotsAutos extends Attracties {

	
	private double prijs = 2.50;
	private int nummer = 1;
	private String naam = "Botsauto's";
	
	
	void tonen() {
		System.out.println("De prijs voor "+ naam + "is €"+ prijs +".");
	}
	
	public BotsAutos() {
		
	}
	
	public void setNaam(/*double attPrijs, int attNummer, */String attnaam) {
		naam = attnaam;
	}	
		
	/*
		prijs = attPrijs;
		nummer = attNummer;
		naam = attNaam;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public double getPrijs() {
		return prijs;
	}
	*/
		
	public String getNaam() {
		return naam;
	}
	
	public void uitvoer() {
		System.out.printf("De naam van de attractie is %s ", getNaam());
	}
	
}
