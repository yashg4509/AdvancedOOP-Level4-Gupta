package _02_StringManipulation;

public class MiddleTwo {
	
	public String middleTwo(String str) {
	  int half = str.length() / 2;
	  return str.substring(half-1,half+1);
	}
	
}

