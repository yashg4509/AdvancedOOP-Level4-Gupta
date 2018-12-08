package _02_StringManipulation;

public class MiddleThree {
	public String middleThree(String str) {
	  int mid;
	  String middle1 = "";
	  String middle2 = "";
	  
	  if(str.length() >= 3) {
	    mid = (str.length())/2;
	    middle1 = str.substring(mid-1, mid);
	    middle2 = str.substring(mid, mid+2);
	  }
	  
	  return middle1 + middle2;
	}
	
}

