package lab1;

class Cent {
    private int num;

    public Cent() {
        setNum();
    }

    public Cent(int num) {
        setNum(num);
    }

    public void setNum(int num) {
        this.num = (num <= 100) ? num : 100;
    }

    public void setNum() {
        num = 0;
    }

    public void getNum() {
        System.out.println(num);
    }
}

public class Five {
    public static void main(String[] args) {
        new Cent().getNum();
        new Cent(999).getNum();
        Cent changed = new Cent(66);
        changed.setNum(50);
        changed.getNum();
    }
}