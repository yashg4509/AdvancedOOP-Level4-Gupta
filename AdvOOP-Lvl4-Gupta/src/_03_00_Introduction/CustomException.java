package _03_00_Introduction;

public class CustomException extends Exception {
	public void terminate() {
		System.exit(0);
	}
}
