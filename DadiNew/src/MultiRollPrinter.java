
import java.util.Scanner;

public class MultiRollPrinter {

	public void multiRollPrinter() {
		final int D20FACES = 20;

		MultiRoller roller = new MultiRoller();
		Roll[] rolls = null;

		int bonus = 0;
		int ca = 0;
		int rollNumber = 0;
		double iterationMalus = 0;

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
					bonus = Integer.parseInt(line);
					if (bonus < 0)
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
					if (iterationMalus < 0) {
						throw new NumberFormatException();
					}
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
					rollNumber = Integer.parseInt(line);
					if (rollNumber < 0) {
						throw new NumberFormatException();
					}
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
					if (ca < 0) {
						throw new NumberFormatException();
					}
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}

			rolls = roller.multiRoller(rollNumber, bonus, iterationMalus, D20FACES);
			for (int i = 0; i < rollNumber; i++) {
				printingString = rolls[i].getTotal() + "";
				while (printingString.length() < 3) {
					printingString = " " + printingString;
				}
				System.out.print(printingString);
				if (rolls[i].getPure() >= 20) {
					System.out.print("!");
				}
				System.out.print("(" + rolls[i].getPure() + ")");
				if (rolls[i].getTotal() >= ca) {
					System.out.print("Colpito");
				}
				System.out.println();
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