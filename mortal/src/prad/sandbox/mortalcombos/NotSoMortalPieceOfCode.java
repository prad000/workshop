package prad.sandbox.mortalcombos;

import java.util.Random;

public class NotSoMortalPieceOfCode {

	public String doSomethingToKillTime() {
		String[] strings = "an attempt to do something".split(" ");
		
		int index = (new Random()).nextInt(strings.length);
		
		StringBuilder newStringBuilder = new StringBuilder("an attempt to do something".length()); 
		for (int i = index; i < strings.length; i++) {
			newStringBuilder.append(strings[i]).append("\t");	
		}
		
		for (int i = 0; i < index; i++) {
			newStringBuilder.append(strings[i]).append("\t");			
		}
		
		return newStringBuilder.toString();
	}
}
