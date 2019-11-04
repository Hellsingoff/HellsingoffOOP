package lab3;

class OneInt {
	public int i;
	public OneInt(int i) { setThis(i); }
	public void setThis(int i) { this.i = i; }
	public String toString() { return this.getClass().getSimpleName() + ": " + i; }
}

class IntChar extends OneInt {
	public char ch;
	
	public IntChar(int i, char ch) {
		super(i);
		this.ch = ch;
	}
	public void setThis(int i, char ch) {
		super.setThis(i);
		this.ch = ch;
	}
	public String toString() { return super.toString() + ", " + ch; }
}

class IntCharStr extends IntChar {
	public String str;
	
	public IntCharStr(int i, char ch, String str) {
		super(i, ch);
		this.str = str;
	}
	public void setThis(int i, char ch, String str) {
		super.setThis(i, ch);
		this.str = str;
	}
	public String toString() { return super.toString() + ", " + str; }
}

public class Lab3_3 {
	public static void main(String[] args) {
		System.out.println(new IntCharStr(1, 'a', "qwe").toString());
	}
}