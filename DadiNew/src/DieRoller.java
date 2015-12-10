import java.util.Scanner;
/*interacts with user through standard output (terminal)
 * user can select a certain number of dice of a certain type to roll
 * 
 */
public class DieRoller {
	public void dieRoller() {
		Dice dado = new Dice(); //dice object simulator
		int currentResult = 0;  //current die roll
		int resultsPrinted = 0; //rolls already printed, used for formatting
		int diceNumber = 0;     //total rolls requested
		String resultString = "";//string with the results to print
		String n = "si";		 //last string user typed
		boolean done = false;	 //variable used during data acquisition while cycles
		Scanner in = new Scanner(System.in);//scanner object for data acquisition
			
		
		while (n.equalsIgnoreCase("si")) { //big while cycle which will end when user answers "no"
			System.out.println
			("Che dado ti serve?");
			String dType = in.next();
			while (!(dType.equalsIgnoreCase("d4") || dType.equalsIgnoreCase("d6") || dType.equalsIgnoreCase("d8")
					|| dType.equalsIgnoreCase("d10") || dType.equalsIgnoreCase("d12") || dType.equalsIgnoreCase("d20")
					|| dType.equalsIgnoreCase("d100") || dType.equalsIgnoreCase("dn"))) {//die selection cycle
				System.out.println("Seleziona un tipo di dado (d4;d6;d8;d10;d12;d20;d100;dn)");
				dType = in.next();
			}

			System.out.println("Quanti tiri ti servono?");
			done = false;

		while (!done) {//roll number selection cycle, try and catch to resolve exception problem
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
			/*for cycle to roll dice
			 * if-else construct to select right die each time
			 * rolled number is added to resultString 
			 * each roll substring is filled with spaces until its length is 5 or more
			 */
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
					System.out.println("Quante facce ha il dado?");//in case of dn selection user must specify number of die sides
					int facceDado = 0;
					done = false;
					while (!done) { // usual while and try-catch to avoid user errors in data format
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
					while (i <= diceNumber) { //internal while cycle which increments for variable i and prints by itself
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
				resultsPrinted++;					//print resultString and formats
				if (resultsPrinted % 10 == 0){
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("Ti servono altri tiri?");  //user can go back from beginning or exit
			resultsPrinted = 0;
			n = in.next();
			while (!(n.equalsIgnoreCase("si") || n.equalsIgnoreCase("no"))) {
				System.out.println("Rispondi solo si o no");
				n = in.next();
			}
		}
	}
}