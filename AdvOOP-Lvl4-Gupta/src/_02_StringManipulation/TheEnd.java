package _02_StringManipulation;

public class TheEnd {
	public String theEnd(String str, boolean front) {
		  Character c = null;
		  if(front == true){
		    c = str.charAt(0);
		  }
		  
		  else if (front == false) {
			  c = str.charAt(str.length()-1);
		  }
		  
		  String chara = Character.toString(c);
		  
		  return chara;
		}
		
}

