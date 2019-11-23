package lab2;

class CharStr {
    static char ch;
    static String str;

    public static void setCharStr(String str) {
        CharStr.str = str;
    }

    public static void setCharStr(char... ch) {
        if (ch.length == 1) {
            CharStr.ch = ch[0];
        } else if (ch.length > 1) {
            str = "";
            for (char onechar : ch) {
                str += onechar;
            }
        }
    }
}

public class Lab2_01 {
    public static void main(String[] args) {
        CharStr.setCharStr('a', 'b', 'c');
        System.out.println(CharStr.str);
        char[] chars = {'q', 'w', 'e'};
        CharStr.setCharStr(chars);
        System.out.println(CharStr.str);
        char[] onechar = {'q'};
        CharStr.setCharStr(onechar);
        System.out.println(CharStr.ch);
        CharStr.setCharStr("onechar");
        System.out.println(CharStr.str);
    }
}