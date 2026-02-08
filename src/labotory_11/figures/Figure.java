package labotory_11.figures;

import labotory_11.input.Input;

public abstract class Figure {

    protected double side1;
    protected double side2;
    protected double side3;


    public Figure(double s1) {
        side1 = s1;
    }

    public Figure(double s1,double s2) {
        side1 = s1;
        side2 = s2;
    }
    public Figure(double s1,double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    abstract public void menu(Input inp);

    abstract double area();

    abstract double perimeter();

    abstract void show();
}
