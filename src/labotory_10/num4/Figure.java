package labotory_10.num4;

public class Figure {
    protected double side1;
    protected double side2;
    protected double side3;

    Figure(double w) {
        side1 = w;
    }

    Figure(double w, double h) {
        side1 = w;
        side2 = h;
    }

    Figure(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    void show1() {
        System.out.println("Ширина и высота - " + side1 + " и " + side2);
    }
}