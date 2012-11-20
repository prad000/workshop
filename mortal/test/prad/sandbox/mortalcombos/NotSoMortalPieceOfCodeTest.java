package prad.sandbox.mortalcombos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Before;
import org.junit.Test;

public class NotSoMortalPieceOfCodeTest {

	private final class FakeIntGenerator extends RandomIntGenerator {
		int intToReturn;

		public void setIntToReturn(int intToReturn) {
			this.intToReturn = intToReturn;
		}
		@Override
		public
		int randomIntForLimit(int length) {
			return intToReturn;
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
		intGenerator.setIntToReturn(1);
		String result = notSoMortalPieceOfCode.doSomethingToKillTime("an attempt to do something");
		System.out.println(result);
		assertThat("result", result, containsString("attempt\tto\tdo\tsomething\tan"));
	}

}
