import static org.junit.Assert.*;

import org.junit.Test;

public class StatRollTest {

	@Test
	public void test() {
		StatRoll roll = new StatRoll();
		assertTrue(roll.statRoll()>0);
		assertTrue(roll.statRoll()<18);

	}

}
