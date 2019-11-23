package lab1;

class TwoNumbs {
    int num1, num2;

    public TwoNumbs() {
    }

    public TwoNumbs(int num1) {
        this.num1 = num1;
    }

    public TwoNumbs(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class Trd {
    public static void main(String[] args) {
        TwoNumbs zero = new TwoNumbs();
        TwoNumbs one = new TwoNumbs(1);
        TwoNumbs two = new TwoNumbs(1, 2);
        System.out.println("zero: " + zero.num1 + " " + zero.num2);
        System.out.println("one: " + one.num1 + " " + one.num2);
        System.out.println("two: " + two.num1 + " " + two.num2);
    }
}