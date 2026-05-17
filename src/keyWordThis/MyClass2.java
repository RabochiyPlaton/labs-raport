package keyWordThis;

public class MyClass2 {
    int a;
    int b;

    MyClass2(int i,int j) {
        a = i;
        b = j;
    }

    MyClass2(int i) {
        this(i,i);
    }

    MyClass2() {
        this(0);
    }
}
