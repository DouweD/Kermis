import java.util.ArrayList;
import java.util.Scanner;

public class Attracties {
	
	public static void main(String[] args) {
		
		Scanner invoer = new Scanner(System.in);
				
		System.out.println("Welkom bij Douweland!");
		System.out.println("---------------------");
		System.out.println("Voer hieronder het attractienummer in:");
		
		BotsAutos bots = new BotsAutos();
		Spin spin = new Spin();
				
		int getalInvoer = invoer.nextInt();
		switch(getalInvoer) {
		default:
			System.out.println("U heeft een onbekend getal ingevoerd. Vul het attractienummer nogmaals in:");
			break;
		case 1:
			bots.uitvoer();
			break;
		case 2:
			spin.uitvoer();
			break;
		case 3:
			bots.uitvoer();
			break;
		case 4:
			spin.uitvoer();
			break;
		case 5:
			bots.uitvoer();
			break;
		case 6:
			spin.uitvoer();
			break;	
		}	
		
		ArrayList<Double> rekening = new ArrayList<>();
		
		if(getalInvoer == 1) {
			rekening.add(bots.getPrijs());
			System.out.println("Hoi");
		}
		
		System.out.println(rekening);
		
		
		
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