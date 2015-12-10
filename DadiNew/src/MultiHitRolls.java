	import java.util.Scanner;

public class MultiHitRolls {
	public void multiHitRolls() {
			
		Dice dado = new Dice();
		int currentResult = 0;
		int currentLaunch = 0;
		int b = 0;
		int ca = 0;
		int launchNumber = 0;
		double iterationMalus = 0;
		int pureResult = 0;
		String printingString = "";
		String answer = "si";
		boolean done = false;

		Scanner in = new Scanner(System.in);

		while (answer.equalsIgnoreCase("si")) {
			System.out.println("Che bonus per colpire hai?");
			done = false;
			while (!done) {
				try {
					String line = in.nextLine();
					b = Integer.parseInt(line);
					if (b < 0)
						throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}
			System.out.println("Che malus per colpire hai ad ogni colpo?");
			done = false;
			while (!done) {
				try {
					String line = in.nextLine();
					iterationMalus = Double.parseDouble(line);
					if (iterationMalus < 0)
						throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}
				System.out.println("Quanti tiri vuoi fare?");
			done = false;
			while (!done) {
				try {
					String line = in.nextLine();
					launchNumber = Integer.parseInt(line);
					if (launchNumber < 0)
						throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}
				System.out.println("Qual'e' la CA del bersaglio?");
			done = false;
			while (!done) {
				try {
					String line = in.nextLine();
					ca = Integer.parseInt(line);
					if (ca < 0)
						throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}
				currentLaunch = 0;
			System.out.println();
			while (currentLaunch < launchNumber) {
				currentResult = dado.tiraD20();
				pureResult = currentResult;
				currentResult = currentResult + b - (int) (iterationMalus * currentLaunch);
				if (currentResult < 0)
					currentResult = 0;
				printingString = currentResult + "";
				while (printingString.length() < 3) {
					printingString = " " + printingString;
				}
				System.out.print(printingString);
				if (pureResult >= 20)
					System.out.print("!");
					System.out.print("(" + pureResult + ")");
				if (currentResult >= ca)
					System.out.print("Colpito");
				System.out.println();
				currentLaunch++;
			}
			System.out.println();
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
