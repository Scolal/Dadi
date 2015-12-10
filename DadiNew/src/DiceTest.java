

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {
	


	@Test
	public void testTiraD4() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD4()<5);
		assertTrue(tiro.tiraD4()>0);
	}

	@Test
	public void testTiraD6() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD6()<7);
		assertTrue(tiro.tiraD6()>0);
	}

	@Test
	public void testTiraD8() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD8()<9);
		assertTrue(tiro.tiraD8()>0);
	}

	@Test
	public void testTiraD10() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD10()<11);
		assertTrue(tiro.tiraD10()>0);
	}

	@Test
	public void testTiraD12() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD12()<13);
		assertTrue(tiro.tiraD12()>0);
	}

	@Test
	public void testTiraD20() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD20()<21);
		assertTrue(tiro.tiraD20()>0);
	}

	@Test
	public void testTiraD100() {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraD100()<101);
		assertTrue(tiro.tiraD100()>0);
	}

	@Test
	public void testTiraDn(int n) {
		Dice tiro = new Dice();
		assertTrue(tiro.tiraDn(n)<n+1);
		assertTrue(tiro.tiraDn(n)>0);
	}

}
