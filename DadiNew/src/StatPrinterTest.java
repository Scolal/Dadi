import static org.junit.Assert.*;

import org.junit.Test;

public class StatPrinterTest {

	@Test
	public void test() {
		StatPrinter printer = new StatPrinter();
		assertTrue(printer.statPrinter()<18*6);
		assertTrue(printer.statPrinter()>0);
		
	}

}
