package lab2;

import java.util.Arrays;

class SumPower {
	public static int regularSum(int n) {
		int result = 0;
		for (int i = n; i > 0; i--) result += Math.pow(i, 2);
		return result;
	}
	public static int recursSum(int ... n) {
		if (n.length == 1) {
			n  = Arrays.copyOf(n, n.length + 1);
			n[1] = (int) Math.pow(n[0]--, 2);
		} else if (n.length == 2) {
			n[1] += Math.pow(n[0]--, 2);
		}
		if (n[0] > 0) recursSum(n);
		return n[1];
	}
}

public class Lab2_05 {
	public static void main(String[] args) {
		System.out.println(SumPower.regularSum(5));
		System.out.println(SumPower.recursSum(5));
	}
}