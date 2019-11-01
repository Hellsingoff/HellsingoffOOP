package lab2;

class OneNum {
	private static int num;
	public static void prntInc() { System.out.println(num++); }
}

public class Lab2_02 {
	public static void main(String[] args) {
		OneNum.prntInc();
		OneNum.prntInc();
		OneNum.prntInc();
	}
}