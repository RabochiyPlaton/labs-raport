package labotory_10.num4;

public class Quadrangle extends Figure {

    private String style;
    private double side4;

    Quadrangle(double s) {
        super(s, s);
        style = "квадрат";
    }

    Quadrangle(double w, double h) {
        super(w, h);
        style = "прямоугольник";
    }

    Quadrangle(double w, double h, double s1) {
        super(w, h, s1);
        style = "равнобедренна трапеция";
    }

    Quadrangle(double w, double h, double s1, double s2) {
        super(w, h, s1);
        side4 = s2;
        style = "разносторонний четырехугольник";
    }

    double area() {
        if (style.equals("Квадрат")) {
            return side1 * side1;
        }
        if (style.equals("Прямоугольник")) {
            return side1 * side2;
        }
        System.out.println("Нельзя рассчитать площадь для фигуры: " + style);
        return 0;
    }

    void show2() {
        System.out.println("Четырехугольник - " + style);
    }
}
