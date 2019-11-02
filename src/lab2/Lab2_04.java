package lab2;

class TwinFact {
	public static int factRegular(int n) {
		for (int r = n - 2; r > 0; r -= 2) { n *= r; }
		return n;
	}
	public static int factRecurs(int n) {
		if ((n == 1) || (n == 2)) return n;
		return n * factRecurs(n - 2);
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