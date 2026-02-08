package labotory_10.num3;

public class Rectangle extends Figure {

    Rectangle(double w, double h) {
        width = w;
        height = h;

    }

    double area() {
        return width * height;
    }
}
