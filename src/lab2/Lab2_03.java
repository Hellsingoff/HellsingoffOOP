package lab2;

class ArrStat {
	public static int arrMin(int ... i) {
		Integer min = null;
		for (int n : i) { min = (min != null) ? Math.min(min, n) : n; }
		return min;
	}
	public static int arrMax(int ... i) {
		Integer max = null;
		for (int n : i) { max = (max != null) ? Math.max(max, n) : n; }
		return max;
	}
	public static double arrMid(int ... i) {
		double mid = 0;
		for (int n : i) { mid += n; }
		return mid/i.length;
	}
}

public class Lab2_03 {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5, 6};
		System.out.println(ArrStat.arrMin(test));
		System.out.println(ArrStat.arrMax(test));
		System.out.println(ArrStat.arrMid(test));
	}
}