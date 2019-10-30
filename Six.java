package lab1;

public class Six {
	private Integer max, min;

	public void getMinMax() { System.out.println("Min: " + min + " Max: " + max); }
	
	/* 
	 * ���, ������, ��������� ����� ���� ����������� ����� ��� 1/2 ���������� - � ��
	 * ����� ��� ��������� � ������� ������� (�������). ������� ����������� ����������
	 * ����� ����������? ���� �� ������� - � ��������.
	 */
	
	public void setMinMax(int ... i) {
		for (int n : i) {
			max = (max != null) ? Math.max(max, n) : n;
			min = (min != null) ? Math.min(min, n) : n;
		}
	}
	public Six(int ... i) { for (int n : i) setMinMax(n); }
}