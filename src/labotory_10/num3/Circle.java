package labotory_10.num3;

public class Circle extends Figure {

    Circle(double w) {
        width = w;

    }

    double area() {
        return Math.PI*(width*width);
    }

    double perimeter() {
        return 2*Math.PI*width;
    }
}
