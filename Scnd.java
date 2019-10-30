package lab1;

class SymbList {
	static char firstSymb = 'A';
	static char scndSymb = 'D';
	
	public static void printSymbols() {
		for (int min = Math.min(firstSymb, scndSymb); min <= Math.max(firstSymb, scndSymb); min++) {
			System.out.print((char) min);
		}
	}
}

public class Scnd {
	public static void main(String[] args) {
		SymbList.printSymbols();
		System.out.println();
		System.out.println("Меняем местами и выводим снова:");
		char tmpSymb = SymbList.firstSymb;
		SymbList.firstSymb = SymbList.scndSymb;
		SymbList.scndSymb = tmpSymb;
		SymbList.printSymbols();
	}
}