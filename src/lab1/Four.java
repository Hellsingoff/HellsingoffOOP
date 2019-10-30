package lab1;

class SymNum {
	char symb;
	int numb;
	
	public SymNum(int numb, char symb) {
		this.numb = numb;
		this.symb = symb;
	}
	public SymNum(double dbl) {
		symb = (char) dbl;
		String strDbl = Double.toString(dbl);
		String strInt = strDbl.substring(strDbl.indexOf('.') + 1);
		if (strInt.length() == 2) numb = Integer.parseInt(strInt);
		else if (strInt.length() > 2) numb = Integer.parseInt(strInt.substring(0, 2));
		else numb = Integer.parseInt(strInt + "0");
	}
}

public class Four {
	public static void main(String[] args) {
		SymNum first = new SymNum(15, 'h');
		SymNum scnd = new SymNum(80.32);
		System.out.println("first: " + first.symb + " " + first.numb);
		System.out.println("scnd: " + scnd.symb + " " + scnd.numb);
	}
}