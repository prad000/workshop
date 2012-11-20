package prad.sandbox.mortalcombos;

import java.util.Random;

public class NotSoMortalPieceOfCode {

	public String doSomethingToKillTime(String stringToConvert) {
		String[] strings = stringToConvert.split(" ");

		int index = intGenerator.randomIntForLimit(strings.length);

		StringBuilder newStringBuilder = new StringBuilder(
				stringToConvert.length());
		for (int i = index; i < strings.length; i++) {
			newStringBuilder.append(strings[i]).append("\t");
		}

		for (int i = 0; i < index; i++) {
			newStringBuilder.append(strings[i]).append("\t");
		}

		return newStringBuilder.toString();
	}

	static class IntGenerator {

		int randomIntForLimit(int length) {
			return (new Random()).nextInt(length);
		}
	};

	IntGenerator intGenerator;
}
