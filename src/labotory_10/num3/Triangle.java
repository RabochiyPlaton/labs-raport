package labotory_10.num3;

public class Triangle extends Figure {

    String style;
    double side;

    Triangle(double h) {
        side = width = height = h;
        style = "равносторонний треугольник";
    }

    Triangle(double w, double h) {
        width = w;
        height = side =h;
        style = "равнобедренный треугольник";
    }

    Triangle(double s, double w, double h) {
        side = s;
        width = w;
        height = h;
        style = "разносторонний треугольник";
    }

    double area() {
        double p = (height + width + side) / 2;
        return Math.sqrt(p * (p - height) * (p - width) * (p - side));
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}