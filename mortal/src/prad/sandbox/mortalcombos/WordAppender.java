package prad.sandbox.mortalcombos;

public class WordAppender {
	public StringBuilder newStringBuilder;

	public WordAppender(StringBuilder newStringBuilder) {
		this.newStringBuilder = newStringBuilder;
	}

	void appendWord(NotSoMortalPieceOfCode notSoMortalPieceOfCode, String word) {
		newStringBuilder.append(word).append("\t");
	}
	
	@Override
	public String toString() {
		return newStringBuilder.toString();
	}
}