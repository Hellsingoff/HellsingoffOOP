package lab3;

class OneText {
    private String str;

    public OneText(String str) {
        this.str = str;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": " + str;
    }
}

class TwoText extends OneText {
    private String str2;

    public TwoText(String str) {
        super(str);
        str2 = "";
    }

    public TwoText(String str, String str2) {
        super(str);
        this.str2 = str2;
    }

    public String toString() {
        return super.toString() + ", " + str2;
    }
}

public class Lab3_1 {
    public static void main(String[] args) {
        System.out.println(new OneText("qwe").toString());
        System.out.println(new TwoText("qwe", "rty").toString());
    }
}