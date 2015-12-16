import java.util.Scanner;

/*interacts with user through standard output (terminal)
 * user can select a certain number of dice of a certain type to roll
 * 
 */
public class DiceRoller {
	public void diceRoller() {
		final int BONUS = 0;
		final double MALUS = 0;

		MultiRoller roller = new MultiRoller(); // die roller
		Roll[] rolls = null; // array of Rolls, filled with the result of method
								// multiRoller()
		int dieFaces = 0; // type of die
		int resultsPrinted = 0; // rolls already printed, used for formatting
		int rollNumber = 0; // total rolls requested

		String resultString = "";// string with the results to print
		String n = "si"; // last string user typed
		boolean done = false; // variable used during data acquisition while
								// cycles
		Scanner in = new Scanner(System.in);// scanner object for data
											// acquisition

		while (n.equalsIgnoreCase("si")) { // big while cycle which will end
											// when user answers "no"
			System.out.println("Che dado ti serve?");
			String dType = in.next();
			while (!(dType.equalsIgnoreCase("d4") || dType.equalsIgnoreCase("d6") || dType.equalsIgnoreCase("d8")
					|| dType.equalsIgnoreCase("d10") || dType.equalsIgnoreCase("d12") || dType.equalsIgnoreCase("d20")
					|| dType.equalsIgnoreCase("d100") || dType.equalsIgnoreCase("dn"))) {
				// die selection cycle
																							
				System.out.println("Seleziona un tipo di dado (d4;d6;d8;d10;d12;d20;d100;dn)");
				dType = in.next();
			}

			System.out.println("Quanti tiri ti servono?");
			done = false;

			while (!done) {// roll number selection cycle, try and catch to
							// resolve exception problem
				try {
					String line = in.nextLine();
					rollNumber = Integer.parseInt(line);
					if (rollNumber < 0)
						throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}
			/*
			 * if-else construct to select right die
			 */

			if (dType.equalsIgnoreCase("d4")) {
				dieFaces = 4;
			} else if (dType.equalsIgnoreCase("d6")) {
				dieFaces = 6;
			} else if (dType.equalsIgnoreCase("d8")) {
				dieFaces = 8;
			} else if (dType.equalsIgnoreCase("d10")) {
				dieFaces = 10;
			} else if (dType.equalsIgnoreCase("d12")) {
				dieFaces = 12;
			} else if (dType.equalsIgnoreCase("d20")) {
				dieFaces = 20;
			} else if (dType.equalsIgnoreCase("d100")) {
				dieFaces = 100;
			} else if (dType.equalsIgnoreCase("dn")) {
				System.out.println("Quante facce ha il dado?");// in case of dn selection
																// user must specify number of die sides
				int facceDado = 0;
				done = false;
				while (!done) { // usual while and try-catch to avoid user
								// errors in data format
					try {
						String line = in.nextLine();
						dieFaces = Integer.parseInt(line);
						if (dieFaces < 1)
							throw new NumberFormatException();
						done = true;
					} catch (NumberFormatException e) {
						System.out.println("Inserisci un numero intero positivo");
					}
				}

				rolls = roller.multiRoller(rollNumber, BONUS, MALUS, dieFaces);

				for (int i=0; i <= rollNumber; i++) { 
					resultsPrinted++;
					resultString = rolls[i].getPure() + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
					System.out.print(resultString + ";");
					if (resultsPrinted % 10 == 0) {
						System.out.println();
					}
				}
			}
			resultsPrinted++; // print resultString and formats
			if (resultsPrinted % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Ti servono altri tiri?"); // user can go back from
														// beginning or exit
		resultsPrinted = 0;
		n = in.next();
		while (!(n.equalsIgnoreCase("si") || n.equalsIgnoreCase("no"))) {
			System.out.println("Rispondi solo si o no");
			n = in.next();
		}
	}
}
