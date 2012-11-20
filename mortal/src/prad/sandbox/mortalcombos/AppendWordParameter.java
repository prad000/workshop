package prad.sandbox.mortalcombos;

public class AppendWordParameter {
	public StringBuilder newStringBuilder;

	public AppendWordParameter(StringBuilder newStringBuilder) {
		this.newStringBuilder = newStringBuilder;
	}

	void appendWord(NotSoMortalPieceOfCode notSoMortalPieceOfCode, String word) {
		newStringBuilder.append(word).append("\t");
	}
}