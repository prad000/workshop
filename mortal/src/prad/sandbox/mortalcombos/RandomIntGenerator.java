package prad.sandbox.mortalcombos;

import java.util.Random;

class RandomIntGenerator implements IntGenerator {

	/* (non-Javadoc)
	 * @see prad.sandbox.mortalcombos.IntGenerator#randomIntForLimit(int)
	 */
	@Override
	public int randomIntForLimit(int length) {
		return (new Random()).nextInt(length);
	}
}