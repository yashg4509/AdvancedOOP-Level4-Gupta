package _02_StringManipulation;

public class NTwice {
	public String nTwice(String str, int n) {
	  String p1 = str.substring(0, n);
	  String p2 = str.substring(str.length() - n, str.length());
	  return p1 + p2;
	}
	
}

