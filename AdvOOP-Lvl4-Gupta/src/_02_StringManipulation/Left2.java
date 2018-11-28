package _02_StringManipulation;

public class Left2 {
	public String left2(String str) {
	  String lastChars = str.substring(2, str.length());
	  String firstTwo = str.substring(0,2);
	  return lastChars + firstTwo;
	}
	 
	
	
}

