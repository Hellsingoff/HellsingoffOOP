package lab3;

class OneStr {
	protected String str;
	
	public OneStr(String str) { this.str = str; }
	public void classPrint(String s) { System.out.print(this.getClass().getSimpleName() + ": " + str + s); }
}

class StrInteger extends OneStr {
	protected int n;
	
	public StrInteger(String str, int n) {
		super(str);
		this.n = n;
	}
	public void classPrint(String s) {
		super.classPrint("");
		System.out.print(", " + n + s);
	}
}

class StrChar extends OneStr {
	protected char ch;
	
	public StrChar(String str, char ch) {
		super(str);
		this.ch = ch;
	}
	public void classPrint(String s) {
		super.classPrint("");
		System.out.print(", " + ch + s);
	}
}

public class lab3_5 {
	public static void main(String[] args) {
		OneStr test1 = new OneStr("qwe");
		StrInteger test2 = new StrInteger("rty", 1);
		StrChar test3 = new StrChar("uio", 'a');
		OneStr test4 = test2;
		test1.classPrint("\n");
		test2.classPrint("\n");
		test3.classPrint("\n");
		test4.classPrint("\n");
	}
}