package lab1;

public class Scnd {
	static char firstSymb = 'A';
	static char scndSymb = 'D';
	
	public static void printSymbols() {
		for (int min = Math.min(firstSymb, scndSymb); min <= Math.max(firstSymb, scndSymb); min++) {
			System.out.print((char) min);
		}
	}
}