package labotory_10.num4;

public class Quadrangle extends Figure {

    String style;


    Quadrangle(double s, String st) {
        super(s, s);
        style = st;
    }

    Quadrangle(double w, double h, String st) {
        super(w, h);
        style = st;
    }

    Quadrangle(double w, double h, double s1, String st) {
        super(w, h);
        style = st;
    }

    Quadrangle(double w, double h, double s1, double s2, String st) {
        super(w, h);
        style = st;
    }

    double area() {
        if (style.equals("Квадрат")) {
            return width * width;
        }
        if (style.equals("Прямоугольник")) {
            return width * height;
        }

        System.out.println("Нельзя рассчитать площадь для фигуры: " + style);
        return 0;
    }

    void show2() {
        System.out.println("Четырехугольник - " + style);
    }
}
