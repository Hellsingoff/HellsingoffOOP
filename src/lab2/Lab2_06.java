package lab2;

import java.util.Arrays;

class NewArr {
    public static int[] newArr(int[] a, int n) {
        if ((n > -1) && (n <= a.length)) return Arrays.copyOf(a, n);
        return a;
    }
}

public class Lab2_06 {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        int[] test2 = NewArr.newArr(test, 2);
        for (int n : test2) System.out.println(n);
        System.out.println("end");
        test2 = NewArr.newArr(test, 8);
        for (int n : test2) System.out.println(n);
        System.out.println("end");
    }
}