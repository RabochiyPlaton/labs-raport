package labotory_10.num4;

public class Triangle extends Figure {

    private String style;

    Triangle(double h) {
        super(h);
        side3 = side2 = side1;
        style = "равносторонний треугольник";
    }

    Triangle(double w, double h) {
        super(w, h);
        side3 = side2;
        style = "равнобедренный треугольник";
    }

    Triangle(double s, double w, double h) {
        super(s, w, h);
        style = "разносторонний треугольник";
    }

    double area() {
        double p = (side2 + side1 + side3) / 2;
        return Math.sqrt(p * (p - side2) * (p - side1) * (p - side3));
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}
