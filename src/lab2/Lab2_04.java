package lab2;

import java.util.Arrays;

class TwinFact {
	public static int factRegular(int n) {
		for (int r = n - 2; r > 0; r -= 2) { n *= r; }
		return n;
	}
	public static int factRecurs(int ... n) {
		if (n.length == 1) {
			n  = Arrays.copyOf(n, n.length + 1);
			n[1] = n[0];
			n[0] -= 2;
		} else if (n.length == 2) {
			n[1] *= n[0];
			n[0] -= 2;
		}
		if (n[0] > 0) factRecurs(n);
		return n[1];
	}
}

public class Lab2_04 {
	public static void main(String[] args) {
		System.out.println(TwinFact.factRegular(5));
		System.out.println(TwinFact.factRecurs(5));
		System.out.println(TwinFact.factRegular(6));
		System.out.println(TwinFact.factRecurs(6));
	}
}