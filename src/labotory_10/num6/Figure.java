package labotory_10.num6;

public class Figure {
    private double width;
    private double height;

    Figure() {
        width = height = 0;
    }

    Figure(double x) {
        width = height = x;
    }

    Figure(double w, double h) {
        width = w;
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void show1() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
