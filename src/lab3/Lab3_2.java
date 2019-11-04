package lab3;

class SuperStr {
	private String str;
	
	public SuperStr(String str) { setThis(str); }
	public void setThis() { str = ""; }
	public void setThis(String str) { this.str = str; }
	public int strLen() { return str.length(); }
}

class StrInt extends SuperStr {
	public int n;
	
	public StrInt(String str, int n) {
		super(str);
		this.n = n;
	}
	public void setThis() { super.setThis(); }
	public void setThis(String str) { super.setThis(str); }
	public void setThis(int n) {
		super.setThis();
		this.n = n;
	}
	public void setThis(String str, int n) {
		super.setThis(str);
		this.n = n;
	}
}

public class Lab3_2 {
	public static void main(String[] args) {
		System.out.println(new StrInt("qwe", 1).strLen());
	}
}