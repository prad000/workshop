package prad.sandbox.mortalcombos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class YouAreSetTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String javaVersion = "7";
		switch (javaVersion) {
		case "6":
			fail("I should never be thrown");
			break;
		case "7":
			assertTrue(true);
			break;

		default:
			break;
		}
	}

}
