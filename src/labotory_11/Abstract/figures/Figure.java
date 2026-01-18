package labotory_11.Abstract.figures;

import labotory_11.input.Input;

public abstract class Figure {

    protected final double side1;

    public Figure(double s) {
        side1 = s;
    }

    abstract public void menu(Input inp);

    abstract double area();

    abstract double perimeter();

    abstract void show();
}
