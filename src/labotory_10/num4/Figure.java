package labotory_10.num4;

public class Figure {
    protected double width;
    protected double height;

    Figure(double w) {
        width = w;
    }

    Figure(double w, double h) {
        width = w;
        height = h;
    }

    void show1() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}