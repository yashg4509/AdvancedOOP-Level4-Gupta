package _02_StringManipulation;

public class HTMLTags {
	public String makeTags(String tag, String word) {
	  String result = "<" + tag + ">" + word + "</" + tag + ">";
	  return result;
	}
	
}

