
public class StatRoll {
	int statRoll(){
		Dices dado = new Dices();
		int statValue = 0;
		final int l1 = dado.tiraD6();
		final int l2 = dado.tiraD6();
		final int l3 = dado.tiraD6();
		final int l4 = dado.tiraD6();

		if ((Math.min(l1, l2) == l1) && (Math.min(l1, l3) == l1) && (Math.min(l1, l4) == l1)) {
			statValue = l2 + l3 + l4;
		} else if ((Math.min(l1, l2) == l2) && (Math.min(l2, l3) == l2) && (Math.min(l2, l4) == l2)) {
			statValue = l1 + l3 + l4;
		} else if ((Math.min(l3, l2) == l3) && (Math.min(l1, l3) == l3) && (Math.min(l3, l4) == l3)) {
			statValue = l2 + l1 + l4;
		} else {
			statValue = l2 + l3 + l1;
		}
		
		return statValue;

	}

}
