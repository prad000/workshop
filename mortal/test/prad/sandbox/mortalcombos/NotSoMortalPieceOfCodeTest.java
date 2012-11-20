package prad.sandbox.mortalcombos;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class NotSoMortalPieceOfCodeTest {

	private final class FakeIntGenerator extends IntGenerator {
		int intToReturn;

		public void setIntToReturn(int intToReturn) {
			this.intToReturn = intToReturn;
		}
	}

	private NotSoMortalPieceOfCode notSoMortalPieceOfCode;
	private FakeIntGenerator intGenerator = new FakeIntGenerator();

	@Before
	public void setUp() throws Exception {
		notSoMortalPieceOfCode = new NotSoMortalPieceOfCode();
		notSoMortalPieceOfCode.setIntGenerator(intGenerator);
	}
	
	

	@Test
	public void testDoSomethingToKillTime() {
		String result = notSoMortalPieceOfCode.doSomethingToKillTime("an attempt to do something");
		System.out.println(result);
		assertNotNull("result", result);
	}

}
