package labotory_10.num1;

public class Circle extends Figure {

    double area() {
        return Math.PI*(width*width);
    }

    double perimeter() {
        return 2*Math.PI*width;
    }
}
