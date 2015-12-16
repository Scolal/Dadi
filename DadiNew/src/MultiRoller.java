
public class MultiRoller {
	public Roll[] multiRoller(int numberRolls, int bonus, double additiveMalus, int dieFaces) {

		int roll;
		Roll[] results = new Roll[numberRolls];
		Dice die = new Dice();

		for (int i = 0; i < numberRolls; i++) {
			roll = die.tiraDn(dieFaces);
			results[i] = new Roll(roll, roll + bonus - (int) (additiveMalus * i));
		}

		return results;

	}
}
