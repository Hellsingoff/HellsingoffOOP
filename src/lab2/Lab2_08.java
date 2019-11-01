package lab2;

class ArrMid {
	public static double arrMid(int[] i) {
		if (i.length == 0) return 0;
		double result = 0;
		for (int n : i) result += n;
		return result /= i.length;
	}
}

public class Lab2_08 {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4};
		System.out.println(ArrMid.arrMid(test));
	}
}