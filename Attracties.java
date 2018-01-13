import java.util.Scanner;

public class Attracties {
	
	public static void main(String[] args) {
		
		Scanner invoer = new Scanner(System.in);
		
		int dayOfWeek = 123;
		switch(dayOfWeek) {
		default:
			System.out.println("Weekdag");
			break;
		case 1:
			System.out.println("Zondag");
			break;
		case 2:
			System.out.println("Zaterdag");
			break;
		}		
		
		
		
		System.out.println("Welkom bij Douweland!");
		System.out.println("---------------------");
		System.out.println("Voer hieronder de naam van de attractie in:");
		
		BotsAutos bots = new BotsAutos();
		String attNaam = invoer.nextLine();
		bots.setNaam(attNaam);
		bots.uitvoer();
		
		
		
		
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
		System.out.println("De prijs voor de Spin is €2,50.");
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