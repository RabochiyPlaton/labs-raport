package labotory_10.num4;

public class Circle extends Figure {

    Circle(double r) {
        super(r);
    }

    double area() {
        return Math.PI * width * width;
    }

    double perimeter() {
        return 2 * Math.PI * width;
    }
}