import java.util.ArrayList;
import java.util.Scanner;


public class Attracties {
	
	
	public static void welkom() {
		System.out.println("WELKOM IN DOUWELAND!");
		System.out.println("-----");
		System.out.println("1. BOTSAUTO'S \n2. SPIN \n3. SPIEGELPALEIS \n4. SPOOKHUIS \n5. HAWAII \n6. LADDERKLIMMEN");
		System.out.println("\nVoer hieronder het nummer in van de bezochtte attracties:");
	}
	
	
	
	public static void main(String[] args) {
		
		boolean appLoopt = true;
		
		Scanner invoer = new Scanner(System.in);
		
		BotsAutos bots = new BotsAutos();
		Spin spin = new Spin();
		SpiegelPaleis spie = new SpiegelPaleis();
		SpookHuis spoo = new SpookHuis();
		Hawaii hawa = new Hawaii();
		LadderKlimmen ladd = new LadderKlimmen();
		
		ArrayList<Double> rekening = new ArrayList<>();
		
		
		welkom();
		while(appLoopt) {
			
			String getalInvoer = invoer.nextLine();
			
			switch(getalInvoer) {
			default:
				System.out.println("\nU heeft een onbekend attractienummer ingevoerd. \nVoer hieronder nogmaals één van de bovenstaande attractienummers in:");
				break;
			case "1":
				bots.uitvoer();
				rekening.add(bots.getPrijs());
				System.out.println("-----\nVoer 'O' in voor het totaaloverzicht \nVoer 'E' in om af te sluiten \nU kunt hieronder nog een attractie toevoegen:");
				break;
			case "2":
				spin.uitvoer();
				rekening.add(spin.getPrijs());
				System.out.println("-----\nVoer 'O' in voor het totaaloverzicht \nVoer 'E' in om af te sluiten \nU kunt hieronder nog een attractie toevoegen:");
				break;
			case "3":
				spie.uitvoer();
				rekening.add(spie.getPrijs());
				System.out.println("-----\nVoer 'O' in voor het totaaloverzicht \nVoer 'E' in om af te sluiten \nU kunt hieronder nog een attractie toevoegen:");
				break;
			case "4":
				spoo.uitvoer();
				rekening.add(spoo.getPrijs());
				System.out.println("-----\nVoer 'O' in voor het totaaloverzicht \nVoer 'E' in om af te sluiten \nU kunt hieronder nog een attractie toevoegen:");
				break;
			case "5":
				hawa.uitvoer();
				rekening.add(hawa.getPrijs());
				System.out.println("-----\nVoer 'O' in voor het totaaloverzicht \nVoer 'E' in om af te sluiten \nU kunt hieronder nog een attractie toevoegen:");
				break;
			case "6":
				ladd.uitvoer();
				rekening.add(ladd.getPrijs());
				System.out.println("-----\nVoer 'O' in voor het totaaloverzicht \nVoer 'E' in om af te sluiten \nU kunt hieronder nog een attractie toevoegen:");
				break;
			case "O":
				System.out.println(rekening);
				double totaal = rekening.stream().mapToDouble(Double::doubleValue).sum();
				System.out.println("\nUW TOTAALBEDRAG IS: €"+ totaal + ".");
				System.out.println("----- \nHet bedrag kan zowel contant als met pin worden voldaan.");
				System.out.println("U kunt hieronder nog een attractie toevoegen of afsluiten met 'E'.");
				break;
			case "E":
				appLoopt = false;
				System.out.println("Bedankt voor uw bezoek en geld! \nAfgesloten [->");
				break;
			}	
		}
		
		/*
		if(getalInvoer == "1") {
			rekening.add(bots.getPrijs());
			System.out.println("Hoi");
		}
		*/
		
		/*
		BotsAutos bots = new BotsAutos();
		bots.tonen(); 
		*/
		/*
		Spin spin = new Spin();
		spin.prijsTonen();
		
		spiegelPaleis spie = new spiegelPaleis();
		spie.prijsTonen();
		
		spookHuis spoo = new spookHuis();
		spoo.prijsTonen();
		
		hawaii hawa = new hawaii();
		hawa.prijsTonen();
		
		ladderKlimmen ladd = new ladderKlimmen();
		ladd.prijsTonen();
		*/
	}

}




/*
class BotsAutos {
	void prijsTonen() {
		System.out.println("De prijs voor botsauto's is €2,50.");
	}
}

class Spin {
	void prijsTonen() {
		System.out.println("De prijs voor de Spin is €2,25.");
	}
}

class spiegelPaleis {
	void prijsTonen() {
		System.out.println("De prijs voor het Spiegelpaleis is €2,25.");
	}
}

class spookHuis {
	void prijsTonen() {
		System.out.println("De prijs voor het spookhuis is €2,75.");
	}
}

class hawaii {
	void prijsTonen() {
		System.out.println("De prijs voor Hawaii is €2,90.");
	}
}

class ladderKlimmen {
	void prijsTonen() {
		System.out.println("De prijs voor ladderklimmen is €5,00.");
	}
}

*/