package lab1;

public class Six {
	private Integer max, min;

	public void getMinMax() { System.out.println("Min: " + min + " Max: " + max); }
	
	/* 
	 * Мне, правда, непонятно зачем надо перегружать метод для 1/2 аргументов - я же
	 * делал это буквально в прошлом примере (третьем). Давайте задействуем переменное
	 * число аргументов? Если не годится - я перепишу.
	 */
	
	public void setMinMax(int ... i) {
		for (int n : i) {
			max = (max != null) ? Math.max(max, n) : n;
			min = (min != null) ? Math.min(min, n) : n;
		}
	}
	public Six(int ... i) { for (int n : i) setMinMax(n); }
}