package prad.sandbox.mortalcombos;


public class NotSoMortalPieceOfCode {

	public String doSomethingToKillTime(String stringToConvert) {
		String[] strings = stringToConvert.split(" ");

		int index = getIntGenerator().randomIntForLimit(strings.length);

		return constructStringStartingFromIndex(strings, index);
	}

	private String constructStringStartingFromIndex(String[] strings, int index) {
		WordAppender wordAppender = new WordAppender();
		for (int i = index; i < strings.length; i++) {
			wordAppender.appendWord(strings[i]);
		}

		for (int i = 0; i < index; i++) {
			wordAppender.appendWord(strings[i]);
		}

		return wordAppender.toString();
	}

	public IntGenerator getIntGenerator() {
		return intGenerator;
	}

	public void setIntGenerator(IntGenerator intGenerator) {
		this.intGenerator = intGenerator;
	}

	private IntGenerator intGenerator = new IntGenerator();
}
