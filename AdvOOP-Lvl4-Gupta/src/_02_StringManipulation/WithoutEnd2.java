package _02_StringManipulation;

public class WithoutEnd2 {
	public String withouEnd2(String str) {
		String result = "";
		if(str.length()>1){
		  	result = str.substring(1, str.length()-1);
		} else if (str.length() < 1) {
		  result = str;
		}
		return result;
	}
}
