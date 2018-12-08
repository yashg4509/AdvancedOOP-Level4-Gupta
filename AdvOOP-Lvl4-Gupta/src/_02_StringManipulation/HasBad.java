package _02_StringManipulation;

public class HasBad {
	public boolean hasBad(String str) {
	  boolean bool = false;
	  
	  if(str.length() < 3) {
	    bool = false;
	  } else if((str.substring(0, 3)).equals("bad")){
	    bool = true;
	  } else if(str.length() > 3) {
	    if((str.substring(1, 4)).equals("bad")){
	      bool = true;
	    }
	  }
	  
	  return bool;
	}
		
}

