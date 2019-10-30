package lab1;

public class First {
	private static char symb;
	
	public static void setSymb(char symb) { First.symb = symb; }
	public static int getSymb() { return (int) symb; }	
	public static void printAll() {
		String res = (symb != '\u0000') ? "Symbol: \"" + symb + "\" Code: " + (int) symb : "null symbol";
		System.out.println(res);
	}
}