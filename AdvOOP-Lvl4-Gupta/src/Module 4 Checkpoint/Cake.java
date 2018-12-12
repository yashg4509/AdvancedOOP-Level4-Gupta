package CHECKPOINT;

public abstract class Cake {
	protected String name;
	protected double rate;

	public abstract double calcPrice();

	public String toString() {
		return (name + "\t" + rate);
	}
}
