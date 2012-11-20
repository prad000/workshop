package prad.sandbox.mortalcombos;


public class NotSoMortalPieceOfCode {

	public String doSomethingToKillTime(String stringToConvert) {
		String[] strings = stringToConvert.split(" ");

		int index = getIntGenerator().randomIntForLimit(strings.length);

		return constructStringStartingFromIndex(strings, index);
	}

	private String constructStringStartingFromIndex(String[] strings, int index) {
		StringBuilder newStringBuilder = new StringBuilder();
		for (int i = index; i < strings.length; i++) {
			String word = strings[i];
			appendWord(newStringBuilder, word);
		}

		for (int i = 0; i < index; i++) {
			String word = strings[i];
			appendWord(newStringBuilder, word);
		}

		return newStringBuilder.toString();
	}

	private void appendWord(StringBuilder newStringBuilder, String word) {
		newStringBuilder.append(word).append("\t");
	}

	public IntGenerator getIntGenerator() {
		return intGenerator;
	}

	public void setIntGenerator(IntGenerator intGenerator) {
		this.intGenerator = intGenerator;
	}

	private IntGenerator intGenerator = new IntGenerator();
}
