package _02_StringManipulation;

public class ExtraEnd {
	public String extraEnd(String str) {
	      String substring = str.substring(Math.max(str.length() - 2, 0));
	      String add = substring + substring + substring;
	      return add;
	}
	
}

