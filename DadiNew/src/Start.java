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
				Caratteristiche car = new Caratteristiche();
				car.caratteristiche();
			}
			
			if(answer.equalsIgnoreCase("d") || answer.equalsIgnoreCase("dado") || answer.equalsIgnoreCase("dadi")){
				Dadi dado = new Dadi();
				dado.dadi();
			}
			
			if(answer.equalsIgnoreCase("r") || answer.equalsIgnoreCase("raffiche") || answer.equalsIgnoreCase("raffica")){
				Raffiche raffica = new Raffiche();
				raffica.raffiche();
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
