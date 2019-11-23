package lab1;

class Symb {
    private static char symb;

    public static void setSymb(char symb) {
        Symb.symb = symb;
    }

    public static int getSymb() {
        return (int) symb;
    }

    public static void printAll() {
        String res = (symb != '\u0000') ? "Symbol: \"" + symb + "\" Code: " + (int) symb : "null symbol";
        System.out.println(res);
    }
}

public class First {
    public static void main(String[] args) {
        Symb.printAll();
        Symb.setSymb('�');
        System.out.println(Symb.getSymb());
        Symb.printAll();
    }
}