package lab2;

class SumPower {
    public static int regularSum(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) result += Math.pow(i, 2);
        return result;
    }

    public static int recursSum(int n) {
        if (n > 0) return (int) (Math.pow(n, 2) + recursSum(--n));
        return 0;
    }
}

public class Lab2_05 {
    public static void main(String[] args) {
        System.out.println(SumPower.regularSum(5));
        System.out.println(SumPower.recursSum(5));
    }
}