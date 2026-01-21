package labotory_10.num4;

public class Triangle extends Figure {

    String style;

    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}
