package _02_StringManipulation;

public class ComboString {
	public String comboString(String a, String b) {
	  String result = "";
	  
	  if(a.length() > b.length()) {
	    result = b + a + b;
	  }
	  
	  else if (b.length() > a.length()) {
	    result = a + b + a;
	  }
	  
	  return result;
	}
	
}

