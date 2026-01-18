package labotory_10.num6;

public class Nasled2 extends Nasled1 {

    String style;

    Nasled2() {
        super();
        style = "null";
    }

    Nasled2(double x) {
        super(x);
        style = "равнобедренный";
    }
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
