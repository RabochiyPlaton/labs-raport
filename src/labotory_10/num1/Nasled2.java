package labotory_10.num1;

public class Nasled2 extends Nasled1 {

    String style;

    double area() {
        return width * height / 2;
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}
