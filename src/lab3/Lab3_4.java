package lab3;

class OneChar {
    public char ch;

    public OneChar(char ch) {
        this.ch = ch;
    }

    public OneChar(OneChar obj) {
        ch = obj.ch;
    }
}

class CharStr extends OneChar {
    public String str;

    public CharStr(char ch, String str) {
        super(ch);
        this.str = str;
    }

    public CharStr(CharStr obj) {
        super(obj.ch);
        str = obj.str;
    }
}

class CharStrInt extends CharStr {
    public int n;

    public CharStrInt(char ch, String str, int n) {
        super(ch, str);
        this.n = n;
    }

    public CharStrInt(CharStrInt obj) {
        super(obj.ch, obj.str);
        n = obj.n;
    }
}

public class Lab3_4 {
    public static void main(String[] args) {
        CharStrInt test = new CharStrInt('a', "qwe", 1);
        CharStrInt copyTest = new CharStrInt(test);
        test = new CharStrInt('b', "rty", 2);
        System.out.println(copyTest.ch + " " + copyTest.str + " " + copyTest.n);
    }
}