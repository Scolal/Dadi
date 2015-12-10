import java.util.Scanner;

public class DieRoller {
	public void dieRoller() {
		Dice dado = new Dice();
		int currentResult = 0;
		int resultsPrinted = 0;
		int diceNumber = 0;
		String resultString = "";
		String n = "si";
		boolean done = false;
		Scanner in = new Scanner(System.in);
			
		while (n.equalsIgnoreCase("si")) {
			System.out.println
			("Che dado ti serve?");
			String dType = in.next();
			while (!(dType.equalsIgnoreCase("d4") || dType.equalsIgnoreCase("d6") || dType.equalsIgnoreCase("d8")
					|| dType.equalsIgnoreCase("d10") || dType.equalsIgnoreCase("d12") || dType.equalsIgnoreCase("d20")
					|| dType.equalsIgnoreCase("d100") || dType.equalsIgnoreCase("dn"))) {
				System.out.println("Seleziona un tipo di dado (d4;d6;d8;d10;d12;d20;d100;dn)");
				dType = in.next();
			}

			System.out.println("Quanti tiri ti servono?");
			done = false;

		while (!done) {
				try {
					String line = in.nextLine();
					diceNumber = Integer.parseInt(line);
					if (diceNumber < 0)
						throw new NumberFormatException();
					done = true;
				} catch (NumberFormatException e) {
					System.out.println("Inserisci un numero intero positivo");
				}
			}
			for (int i = 1; i <= diceNumber; i++) {
				if (dType.equalsIgnoreCase("d4")) {
					currentResult = dado.tiraD4();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				} else if (dType.equalsIgnoreCase("d6")) {
					currentResult = dado.tiraD6();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				} else if (dType.equalsIgnoreCase("d8")) {
					currentResult = dado.tiraD8();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				} else if (dType.equalsIgnoreCase("d10")) {
					currentResult = dado.tiraD10();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				}
				else if (dType.equalsIgnoreCase("d12")) {
					currentResult = dado.tiraD12();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				} else if (dType.equalsIgnoreCase("d20")) {
					currentResult = dado.tiraD20();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				} else if (dType.equalsIgnoreCase("d100")) {
					currentResult = dado.tiraD100();
					resultString = currentResult + "";
					while (resultString.length() < 5) {
						resultString = " " + resultString;
					}
						System.out.print(resultString + ";");
				} else if (dType.equalsIgnoreCase("dn")) {
					System.out.println("Quante facce ha il dado?");
					int facceDado = 0;
					done = false;
					while (!done) {
						try {
							String line = in.nextLine();
							facceDado = Integer.parseInt(line);
							if (facceDado < 1)
								throw new NumberFormatException();
							done = true;
						} catch (NumberFormatException e) {
							System.out.println("Inserisci un numero intero positivo");
						}
					}
					while (i <= diceNumber) {
						i++;
						resultsPrinted++;
						currentResult = dado.tiraDn(facceDado);
						resultString = currentResult + "";
						while (resultString.length() < 5) {
							resultString = " " + resultString;
						}
							System.out.print(resultString + ";");
						if (resultsPrinted % 10 == 0){
							System.out.println();
						}
					}
				}
				resultsPrinted++;
				if (resultsPrinted % 10 == 0){
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("Ti servono altri tiri?");
			resultsPrinted = 0;
			n = in.next();
			while (!(n.equalsIgnoreCase("si") || n.equalsIgnoreCase("no"))) {
				System.out.println("Rispondi solo si o no");
				n = in.next();
			}
		}
	}
}