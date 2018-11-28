package _02_StringManipulation;

public class Right2 {
	public String right2(String str) {
	  	String lastChars = str.substring(str.length()-2, str.length());
	  	String firstTwo = str.substring(0, str.length()-2);
	  	
	  	return lastChars+firstTwo;
	}
	
}

