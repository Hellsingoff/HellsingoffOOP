package lab1;

public class Five {
	private int num;
	
	public Five() { setNum(); }
	public Five(int num) { setNum(num); }
	public void setNum(int num) { this.num = (num <= 100) ? num : 100; }
	public void setNum() { num = 0; }
	public void getNum() { System.out.println(num); }
}