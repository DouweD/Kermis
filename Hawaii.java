
public class Hawaii extends Attracties {

	
	private double prijs = 73523.99;
	private String naam = "Hawaii";
	
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
		System.out.println("U heeft zojuist een retour " + naam + " met KLM geboekt voor slechts €" + prijs + ". Veel plezier!");
	}
	
}
