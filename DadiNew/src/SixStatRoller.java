
public class SixStatRoller {
	public int[] sixStatRoller(){
		StatRoll roll = new StatRoll();
		int[] stats = new int[6];
		int statNumber=0;
		final int STAT_TOT=6;

		while(statNumber<STAT_TOT){
			int currentRoll=roll.statRoll();
			if(currentRoll>7){
			stats[statNumber]=currentRoll;
			statNumber++;
			}
			
		}
		return stats;
	}

}
