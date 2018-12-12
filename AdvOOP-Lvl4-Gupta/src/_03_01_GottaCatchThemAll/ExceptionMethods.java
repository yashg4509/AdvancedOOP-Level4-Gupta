package _03_01_GottaCatchThemAll;

public class ExceptionMethods {
	public double divide(double a, double b) {
		double q = a/b;
		
		if(q == 0.0) {
			throw new IllegalArgumentException();
		}
		
		return q;
	}

	public String reverse(String str) {
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

