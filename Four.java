package lab1;

public class Four {
	char symb;
	int numb;
	
	public Four(int numb, char symb) {
		this.numb = numb;
		this.symb = symb;
	}
	public Four(double dbl) {
		this.symb = (char) Math.floor(dbl);
		
	}
}
