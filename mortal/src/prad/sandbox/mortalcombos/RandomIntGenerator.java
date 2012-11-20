package prad.sandbox.mortalcombos;

import java.util.Random;

class RandomIntGenerator {

	int randomIntForLimit(int length) {
		return (new Random()).nextInt(length);
	}
}