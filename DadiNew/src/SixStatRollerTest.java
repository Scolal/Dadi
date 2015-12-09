import static org.junit.Assert.*;

import org.junit.Test;

public class SixStatRollerTest {

	@Test
	public void test() {
		SixStatRoller roller = new SixStatRoller();
		int[] stats = roller.sixStatRoller();
		
		
		assertTrue(stats[0]>0);
		assertTrue(stats[0]<19);		
		
		assertTrue(stats[1]>0);
		assertTrue(stats[1]<19);		
		
		assertTrue(stats[2]>0);
		assertTrue(stats[2]<19);
		
		assertTrue(stats[3]>0);
		assertTrue(stats[3]<19);		
		
		assertTrue(stats[4]>0);
		assertTrue(stats[4]<19);		
		
		assertTrue(stats[5]>0);
		assertTrue(stats[5]<19);		

	}

}
