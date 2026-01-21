package labotory_10.num6;

public class Triangle extends Figure {

    String style;

    Triangle() {
        super();
        style = "null";
    }

    Triangle(double x) {
        super(x);
        style = "равнобедренный";
    }
    Triangle(String s, double w, double h) {
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
