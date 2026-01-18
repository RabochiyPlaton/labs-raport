package labotory_10.NotAbstract.figures;

import labotory_10.NotAbstract.input.Input;


public class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;
    private final String style;

    public Triangle(double s1) {
        side2 = side3 = side1 = s1;
        style = "односторонний";
        if (isExtends()) {
            throw new IsExtends("Такого треугольника не существует");
        }
    }

    public Triangle(double s1, double s2) {
        side3 = side1 = s1;
        side2 = s2;
        if (isRectangularTriangle()) style = "равнобедренный прямоугольный";
        else style = "равнобедренный";
        if (isExtends()) {
            throw new IsExtends("Такого треугольника не существует");
        }
    }

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        if (isRectangularTriangle()) style = "разносторонний прямоугольный";
        else style = "разносторонний";
        if (isExtends()) {
            throw new IsExtends("Такого треугольника не существует");
        }
    }

    public void menu(Input inp) {
        while (true) {
            System.out.println("\n===Меню===");
            System.out.println("1 - показать информацию");
            System.out.println("2 - вычислить площадь");
            System.out.println("3 - вычислить пермиметр");
            System.out.println("4 - выход");
            int choice = (int) inp.inputDouble();
            switch (choice) {
                case 1:
                    show();
                    break;
                case 2:
                    System.out.println("Площадь треугольника = " + area());
                    break;
                case 3:
                    System.out.println("Периметр треугольника = " + perimeter());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }

    protected double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    protected double perimeter() {
        return side1 + side2 + side3;
    }

    protected void show() {
        System.out.println("===Треугольник===");
        System.out.println(style);
        System.out.println("Стороны: " + side1 + "; " + side2 + "; " + side3);
    }

    private boolean isExtends() {
        return !((side1 + side2) > side3) || !((side1 + side3) > side2) || !((side2 + side3) > side1);
    }

    private boolean isRectangularTriangle() {
        if (side1 > side2 && side1 > side3) {
            return (side1 * side1 == side2 * side2 + side3 * side3);
        } else if (side2 > side1 && side2 > side3) {
            return (side2 * side2 == side1 * side1 + side3 * side3);
        } else {
            return (side3 * side3 == side2 * side2 + side1 * side1);
        }
    }
}
