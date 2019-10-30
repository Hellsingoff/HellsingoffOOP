package lab1;

public class Four {
	char symb;
	int numb;
	
	public Four(int numb, char symb) {
		this.numb = numb;
		this.symb = symb;
	}
	public Four(double dbl) {
		symb = (char) dbl;
		String strDbl = Double.toString(dbl);
		String strInt = strDbl.substring(strDbl.indexOf('.') + 1);
		if (strInt.length() == 2) numb = Integer.parseInt(strInt);
		else if (strInt.length() > 2) numb = Integer.parseInt(strInt.substring(0, 2));
		else numb = Integer.parseInt(strInt + "0");
	}
}
