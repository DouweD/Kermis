
public class BotsAutos extends Attracties {

	
	private double prijs = 2.50;
	private int nummer = 1;
	private String naam = "Botsauto's";
	
	
	void tonen() {
		System.out.println("De prijs voor "+ naam + "is €"+ prijs +".");
	}
	
	
	public void Bots(double attPrijs, int attNummer, String attNaam) {
		prijs = attPrijs;
		nummer = attNummer;
		naam = attNaam;
	}
	
	public void setAttractie(double attPrijs, int attNummer, String attNaam) {
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
	
	public String getNaam() {
		return naam;
	}
	
	public void zeg() {
		System.out.println(naam);
	}
	
}
