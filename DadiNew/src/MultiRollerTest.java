import static org.junit.Assert.*;

import org.junit.Test;

public class MultiRollerTest {

	@Test
	public void testMultiRoller() {
		final int rolls=30;
		final double malus=0.5;
		final int bonus=7;
		final int faces=20;
		
		MultiRoller test = new MultiRoller();
		Roll[] testArray = test.multiRoller(rolls, bonus, malus, faces);
		for(int i=0; i<rolls;i++ ){
			assertTrue(testArray[i].getTotal()>bonus-(int)(i*malus));
			assertTrue(testArray[i].getTotal()<faces+1+bonus-(int)(i*malus));
			assertTrue(testArray[i].getPure()>0);
			assertTrue(testArray[i].getPure()<faces+1);
		}
	}
}
