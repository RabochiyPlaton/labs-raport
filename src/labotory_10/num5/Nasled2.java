package labotory_10.num5;

public class Nasled2 extends Nasled1 {

    String style;

    Nasled2(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}
