package labotory_10.num3;

public class Triangle extends Figure {

    String style;
    double side;

    Triangle(double h, String st) {
        side = width = height = h;
        style = st;
    }

    Triangle(double w, double h, String st) {
        width = w;
        height = side =h;
        style = st;
    }

    Triangle(double s, double w, double h, String st) {
        side = s;
        width = w;
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