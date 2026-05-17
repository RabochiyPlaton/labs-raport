package keyWordThis;

public class Main {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println("Пример 6");
        System.out.println("a = " + mc.a + " b = " + mc.b);
        MyClass mc2 = new MyClass(1);
        System.out.println("a = " + mc2.a + " b = " + mc2.b);
        MyClass mc3 = new MyClass(2,3);
        System.out.println("a = " + mc3.a + " b = " + mc3.b);
        System.out.println();
        System.out.println("Пример 7");
        MyClass2 mc4 = new MyClass2();
        System.out.println("a = " + mc4.a + " b = " + mc4.b);
        MyClass2 mc5 = new MyClass2(1);
        System.out.println("a = " + mc5.a + " b = " + mc5.b);
        MyClass2 mc6 = new MyClass2(2,3);
        System.out.println("a = " + mc6.a + " b = " + mc6.b);
    }
}
