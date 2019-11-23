package lab2;

class SwapArr {
    public static char[] swapping(char[] ch) {
        int iter = ch.length / 2;
        for (int i = 0; i < iter; i++) {
            char tmp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = tmp;
        }
        return ch;
    }
}

public class Lab2_09 {
    public static void main(String[] args) {
        char[] test = {'a', 'b', 'c', 'd'};
        for (char ch : SwapArr.swapping(test)) System.out.println(ch);
    }
}