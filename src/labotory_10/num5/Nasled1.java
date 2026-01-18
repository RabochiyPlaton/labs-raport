package labotory_10.num5;

public class Nasled1 {
    private double width;
    private double height;

    Nasled1(double w, double h) {
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
