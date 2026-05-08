package assertionExample;

public class A {

    static int val = 3;

    static int meth1() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = meth1();
            assert n > 0:"n<0";
            System.out.println("n = " + n);
        }
    }
}
