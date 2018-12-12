package _04_hospital;

public class Patient {
	boolean care = false;

	public static void main(String[] args) {
	}

	public boolean feelsCaredFor() {
		return care;
	}

	public void checkPulse() {
		care = true;
	}
}
