package lab1;

class MinMax {
    private Integer max, min;

    public void getMinMax() {
        System.out.println("Min: " + min + " Max: " + max);
    }

    public void setMinMax(int... i) {
        for (int n : i) {
            max = (max != null) ? Math.max(max, n) : n;
            min = (min != null) ? Math.min(min, n) : n;
        }
    }

    public MinMax(int... i) {
        for (int n : i) setMinMax(n);
    }
}

public class Six {
    public static void main(String[] args) {
        MinMax test = new MinMax(6, 4, 5);
        test.getMinMax();
        test.setMinMax();
        test.getMinMax();
        test.setMinMax(3);
        test.getMinMax();
        test.setMinMax(50, 2, 15, 4, 45, 3);
        test.getMinMax();
    }
}