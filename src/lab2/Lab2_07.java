package lab2;

class ArrCopy {
    public static int[] charsToInts(char[] ch) {
        int[] result = new int[ch.length];
        for (int i = 0; i < ch.length; i++) result[i] = ch[i];
        return result;
    }
}

public class Lab2_07 {
    public static void main(String[] args) {
        char[] test = {'s', 'w', 'q'};
        for (int i : ArrCopy.charsToInts(test)) System.out.println(i);
    }
}