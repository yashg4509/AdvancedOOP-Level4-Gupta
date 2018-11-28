package _02_StringManipulation;

public class NonStart {
	public String nonStart(String a, String b) {
	  String aSub = a.substring(1, a.length());
	  String bSub = b.substring(1, b.length());
	  
	  return aSub+bSub;
	}
	
}

