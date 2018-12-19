package _03_01_GottaCatchThemAll;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		if(b == 0.0) {
			throw new IllegalArgumentException();
		}
		else {
			return a/b;
		}
	}

	public String reverse(String str) throws IllegalStateException {
		if(str.length() == 0) {
			throw new IllegalStateException();
		} else {
			String rev = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				rev += str.substring(i, i+1);
			}
			return rev;
			
		}
		
	}
}

