package labotory_11.figures;

import labotory_11.input.Input;

public class Quadrangle extends Figure {

    private double side4;
    private String style = "произвольный четырехугольник";

    public Quadrangle(double s1) {
        super(s1);
        side2 = side3 = side4 = side1;
        if (isExists()) {
            System.out.println("Такого четырехугольника не существует");
        }
    }

    public Quadrangle(double s1, double s2) {
        super(s1, s2);
        side3 = side1;
        side4 = side2;
        if (isExists()) {
            System.out.println("Такого четырехугольника не существует");
        }
    }

    public Quadrangle(double s1, double s2, double s3) {
        super(s1, s2, s3);
        side4 = s3;
        if (isExists()) {
            System.out.println("Такого четырехугольника не существует");
        }
    }

    public Quadrangle(double s1, double s2, double s3, double s4) {
        super(s1, s2, s3);
        side4 = s4;
        if (isExists()) {
            System.out.println("Такого четырехугольника не существует");
        }
    }

    public void setStyle(String s) {
        style = s;
    }

    private double createDiagonal() {
        Input inp = new Input();
        double diagonal, diagonalMin, diagonalMax, diagonalMin1, diagonalMax1, diagonalMin2, diagonalMax2;
        diagonalMin1 = Math.abs(side1 - side2);
        diagonalMax1 = side1 + side2;
        diagonalMin2 = Math.abs(side3 - side4);
        diagonalMax2 = side3 + side4;
        if (diagonalMin1 < diagonalMin2) diagonalMin = diagonalMin1;
        else diagonalMin = diagonalMin2;
        if (diagonalMax1 > diagonalMax2) diagonalMax = diagonalMax1;
        else diagonalMax = diagonalMax2;
        while (true) {
            System.out.printf("Введите диагональ (возможной диапазон: %.2f < d < %.2f)", diagonalMin, diagonalMax);
            diagonal = inp.inputPositiveNumber();
            if (diagonal < diagonalMin || diagonal > diagonalMax) {
                System.out.println("Вы вышли за диапазон");
            } else break;
        }
        return diagonal;
    }

    @Override
    protected double area() {
        Input inp = new Input();
        double h;
        switch (style) {
            case "квадрат":
                return side1 * side1;
            case "прямоугольник":
                return side1 * side2;
            case "ромб":
                System.out.println("Введите первую диагональ:");
                double d1 = inp.inputPositiveNumber();
                System.out.println("Введите вторую диагональ:");
                double d2 = inp.inputPositiveNumber();
                return 0.5 * d1 * d2;
            case "параллелограмм":
                System.out.println("Введите высоту:");
                h = inp.inputPositiveNumber();
                return side1 * h;
            case "равнобедренная трапеция":
            case "трапеция":
                System.out.println("Введите высоту трапеции:");
                h = inp.inputPositiveNumber();
                return ((side1 + side3) / 2) * h;
            default:
                System.out.println("Расчет площади произвольного четырехугольника через диагональ:");
                double diagonal = createDiagonal();
                Triangle triangle1 = new Triangle(side1, side2, diagonal);
                Triangle triangle2 = new Triangle(side3, side4, diagonal);
                return triangle1.area() + triangle2.area();
        }
    }

    @Override
    protected double perimeter() {
        return side1 + side2 + side3 + side4;
    }

    @Override
    protected void show() {
        System.out.println("===Четырехугольник===");
        System.out.println(style);
        System.out.println("Стороны: " + side1 + "; " + side2 + "; " + side3 + "; " + side4);
    }

    @Override
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
