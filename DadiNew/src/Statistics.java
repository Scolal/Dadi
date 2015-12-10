	import java.util.Scanner;
public class Statistics {

	public void statistics() {
			
		Scanner in = new Scanner(System.in);
		StatPrinter printer = new StatPrinter();
		int statQuantity = 0;
		int currentStatQuality = 0;
		String answer = "si";
		boolean done = false;
		int bestCounter = 0;
		int goodCounter = 0;
		
		while (answer.equalsIgnoreCase("si")) {
			System.out.print("Quanti personaggi devi fare?     ");
			done = false;
			while (!done) {
				try {
					String line = in.nextLine();
					statQuantity = Integer.parseInt(line);
					if (statQuantity < 0)
					throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}

			System.out.println();
			System.out.println("Ok, ecco le caratteristiche, ho considerato solo i tiri sopra il 7, perche' sono buono...");
			System.out.println();

			while (statQuantity>0){
					
			currentStatQuality=printer.statPrinter();
				if(currentStatQuality>106){
					bestCounter++;
				}
				else if (currentStatQuality>92){
					goodCounter++;
				}
				
				statQuantity--;
			}
			System.out.println();
			System.out.println("Hai ottenuto "+goodCounter+" tiri buoni e "+bestCounter+" tiri perfetti.");
			System.out.println();
			
			System.out.println("Ti servono altri tiri?");
			answer = in.next();
			while (!(answer.equalsIgnoreCase("si") || answer.equalsIgnoreCase("no"))) {
				System.out.println("Rispondi solo si o no");
				answer = in.next();
			}	
		}
	}
}