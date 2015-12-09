
public class StatPrinter {
	public int statPrinter(){
		
		SixStatRoller roller = new SixStatRoller();
		int[] current = null;
		final int STAT_TOT=6;
		int statValue = 0;
		int statNumber = 0;
		int statQuality = 0;
		String printing = "";

		current=roller.sixStatRoller();
			
		while(statNumber<STAT_TOT){
				
			statValue=current[statNumber];
			printing = statValue + "";

			while (printing.length() < 2) {
				printing = printing + " ";
			}

			System.out.print(" " + printing + ";");
			statNumber++;
			statQuality = statQuality + statValue;
		}
			

		System.out.print("           ");

		if (statQuality <= 70) {
				System.out.println("Non sono venuti granche' bene eh?");
		} else if (statQuality <= 82) {
				System.out.println("Non sono il massimo, ma poteva andarti peggio...");
		} else if (statQuality <= 94) {
				System.out.println("Niente male come tiri!");
		} else if (statQuality < 106) {
				System.out.println("Questi si che sono dei tiri come si deve!");
		} else {
				System.out.println(
						"COSA?!? COME DIAVOLO HAI FATTO!?! No, lascia perdere, non voglio saperlo, comunque un personaggio del genere non lo usi nella mia campagna.");
		}
		return statQuality;
	}
}



