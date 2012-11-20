package prad.sandbox.mortalcombos;

public class WordAppender {
	public StringBuilder newStringBuilder = new StringBuilder();

	public WordAppender() {
	}

	void appendWord(NotSoMortalPieceOfCode notSoMortalPieceOfCode, String word) {
		newStringBuilder.append(word).append("\t");
	}
	
	@Override
	public String toString() {
		return newStringBuilder.toString();
	}
}