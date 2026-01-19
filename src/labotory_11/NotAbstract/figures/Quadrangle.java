package labotory_11.NotAbstract.figures;

import labotory_11.input.Input;


public class Quadrangle {

    private final double side1;
    private final double side2;
    private final double side3;
    private final double side4;
    private final String style;

    public Quadrangle(double s1) {
        side2 = side3 = side4 = side1 = s1;
        style = "квадрат";
        if (isExists()) {
            throw new IsExtends("Такого четырехугольника не существует");
        }
    }

    public Quadrangle(double s1, double s2) {
        side3 = side1 = s1;
        side2 = side4 = s2;
        style = "прямоугольник";
        if (isExists()) {
            throw new IsExtends("Такого четырехугольника не существует");
        }
    }

    public Quadrangle(double s1, double s2, double s3, double s4) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        side4 = s4;
        style = "произвольный четырехугольник";
        if (isExists()) {
            throw new IsExtends("Такого четырехугольника не существует");
        }
    }

    private double createDiagonal() {
        Input inp = new Input();
        double diagonal, diagonalMin, diagonalMax, diagonalMin1, diagonalMax1, diagonalMin2, diagonalMax2;
        diagonalMin1 = Math.abs(side1 - side2);
        diagonalMax1 = side1 + side2;
        diagonalMin2 = Math.abs(side3 - side4);
        diagonalMax2 = side3 + side4;
        diagonalMin = Math.max(diagonalMin1, diagonalMin2);
        diagonalMax = Math.min(diagonalMax1, diagonalMax2);
        while (true) {
            System.out.printf("Введите диагональ (возможной диапазон: %.3f < %.3f)", diagonalMin, diagonalMax);
            diagonal = inp.inputPositiveNumber();
            if (diagonal < diagonalMin || diagonal > diagonalMax) {
                System.out.println("Вы вышли за диапазон");
            } else break;
        }
        return diagonal;
    }

    protected double area() {
        if (style.equals("квадрат")) {
            return side1 * side1;
        } else if (style.equals("прямоугольник")) {
            return side1 * side2;
        } else {
            double diagonal = createDiagonal();
            Triangle triangle1 = new Triangle(side1, side2, diagonal);
            Triangle triangle2 = new Triangle(side3, side4, diagonal);
            return triangle1.area() + triangle2.area();
        }
    }

    protected double perimeter() {
        return side1 + side2 + side3 + side4;
    }

    protected void show() {
        System.out.println("===Четырехугольник===");
        System.out.println(style);
        System.out.println("Стороны: " + side1 + "; " + side2 + "; " + side3 + "; " + side4);
    }

    public void menu(Input inp) {
        while (true) {
            System.out.println("\n===Меню===");
            System.out.println("1 - показать информацию");
            System.out.println("2 - вычислить площадь");
            System.out.println("3 - вычислить периметр");
            System.out.println("4 - выход");
            int choice = (int) inp.inputPositiveNumber();
            switch (choice) {
                case 1:
                    show();
                    break;
                case 2:
                    try {
                        System.out.println("Площадь = " + area());
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Периметр = " + perimeter());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }

    private boolean isExists() {
        return !(side1 < side2 + side3 + side4) ||
                !(side2 < side1 + side3 + side4) ||
                !(side3 < side1 + side2 + side4) ||
                !(side4 < side1 + side2 + side3);
    }
}
