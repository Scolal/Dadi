import java.util.Scanner;

public class Start {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String answer = "si";

		while (answer.equalsIgnoreCase("si")) {

			System.out.println("Cosa ti serve? \n -Catatteristiche(c)\n -Raffiche(r)\n -Dado(d)");
			answer = reader.next();
			while (!(answer.equalsIgnoreCase("r") || answer.equalsIgnoreCase("c")|| answer.equalsIgnoreCase("d")|| answer.equalsIgnoreCase("dado")|| answer.equalsIgnoreCase("dadi")|| answer.equalsIgnoreCase("raffiche")|| answer.equalsIgnoreCase("raffica")|| answer.equalsIgnoreCase("caratteristiche"))) {
				System.out.println("Cosa ti serve? \n -Catatteristiche(c)\n -Raffiche(r)\n -Dado(d)");
				answer = reader.next();
			}

			if(answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("caratteristiche")){
				Statistics stat = new Statistics();
				stat.statistics();
			}
			
			if(answer.equalsIgnoreCase("d") || answer.equalsIgnoreCase("dado") || answer.equalsIgnoreCase("dadi")){
				DieRoller dice = new DieRoller();
				dice.dieRoller();
			}
			
			if(answer.equalsIgnoreCase("r") || answer.equalsIgnoreCase("raffiche") || answer.equalsIgnoreCase("raffica")){
				MultiHitRolls hits = new MultiHitRolls();
				hits.multiHitRolls();
			}

			System.out.println("Ti serve altro?");
			answer = reader.next();
			while (!(answer.equalsIgnoreCase("si") || answer.equalsIgnoreCase("no"))) {
				System.out.println("Rispondi solo si o no");
				answer = reader.next();
			}
		}	
	}
}
