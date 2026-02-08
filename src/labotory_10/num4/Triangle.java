package labotory_10.num4;

public class Triangle extends Figure {

    String style;
    double side;

    Triangle(double h, String st) {
        super(h);
        side = height = width;
        style = st;
    }

    Triangle(double w, double h, String st) {
        super(w, h);
        side = height;
        style = st;
    }

    Triangle(double s, double w, double h, String st) {
        super(s, w);
        height = h;
        style = st;
    }

    double area() {
        double p = (height + width + side) / 2;
        return Math.sqrt(p * (p - height) * (p - width) * (p - side));
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}
