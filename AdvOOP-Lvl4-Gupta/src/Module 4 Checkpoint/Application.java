package CHECKPOINT;

import java.util.Random;

public class Application {
	readymadeCake RMC = new readymadeCake();
	orderCake OC = new orderCake();
	static int tally = 0;

	public static void main(String[] args) {
		Application ap = new Application();
		ap.randomizer();
		System.out.println("The total price for all types of cakes were $" + ap.grandtotal() + ".");
		System.out.println(tally + " ready made cakes were sold for a total of $" + ap.readymade() + ".");
		System.out.println(ap.highprice());
	}

	public void randomizer() {
		Random n = new Random();
		for (int i = 0; i < 20; i++) {
			int rand = n.nextInt(2);
			int randrate = n.nextInt(50);
			int quantity = n.nextInt(10);
			if (rand == 1) {
				RMC.quantity[i] = quantity;
				RMC.rate[i] = randrate;
				RMC.name[i] = "Cake #" + i;
				tally += 1;
			} else {
				OC.weight[i] = quantity;
				OC.rate[i] = randrate;
				OC.name[i] = "Cake #" + i;
			}
		}
	}

	public int grandtotal() {
		int holder = 0;
		for (int i = 0; i < 20; i++) {
			holder += RMC.rate[i] * RMC.quantity[i];
		}
		for (int i = 0; i < 20; i++) {
			holder += OC.rate[i] * OC.weight[i];
		}
		return holder;
	}

	public int readymade() {
		int holder = 0;
		for (int i = 0; i < 20; i++) {
			holder += (RMC.rate[i] * RMC.quantity[i]);
		}
		return holder;
	}

	public String highprice() {
		int ochigh = 0;
		int rmchigh = 0;
		for (int i = 0; i < 19; i++) {
			if (OC.rate[ochigh] * OC.weight[ochigh] > OC.rate[i + 1] * OC.weight[i + 1]) {
			} else {
				ochigh = i + 1;
			}
		}
//		for (int i = 0; i < 19; i++) {
//			if (RMC.rate[rmchigh] * RMC.quantity[rmchigh] > RMC.rate[i + 1] * RMC.quantity[i + 1]) {
//			} else {
//				rmchigh = i + 1;
//			}
//		} <CUT READY MADE CAKE>
//		if (RMC.rate[rmchigh] * RMC.quantity[rmchigh] > OC.rate[ochigh] * OC.weight[ochigh]) {
//			return "The cake with the highest price sold for $" + (RMC.rate[rmchigh] * RMC.quantity[rmchigh])
//					+ " and had a quantity of " + RMC.quantity[rmchigh] + ".";
//		} else {
		return "The cake with the highest price sold for $" + (OC.rate[ochigh] * OC.weight[ochigh])
				+ " and had a weight of " + OC.weight[ochigh] + " kilograms.";
		// }
	}
}