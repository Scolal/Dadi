//container class
public class Roll {
	private int pureRoll;
	private int totalRoll;
	
	public Roll(int pure, int total){
		pureRoll=pure;
		totalRoll=total;
	}

	public int getPure(){
		return pureRoll;
	}

	public int getTotal(){
		return totalRoll;
	}
	
	public int[] getAll(){
		int [] all = new int[2];
		all[1]=pureRoll;
		all[2]=totalRoll;
		return all;
	}
}
