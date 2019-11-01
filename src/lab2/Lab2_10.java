package lab2;

class MinMax {
	public static int[] findMinMax(int ... i) {
		Integer min = null, max = null;
		for (int n : i) {
			max = (max != null) ? Math.max(max, n) : n;
			min = (min != null) ? Math.min(min, n) : n;
		}
		int[] result = {max, min};
		return result;
	}
}

public class Lab2_10 {
	public static void main(String[] args) {
		int[] test = MinMax.findMinMax(50,2,15,4,45,3);
		System.out.println("Min: " + test[1] + " Max: " + test[0]);
	}
}