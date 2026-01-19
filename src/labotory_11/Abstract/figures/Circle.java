package labotory_11.Abstract.figures;

import labotory_11.input.Input;

public class Circle extends Figure {

    private double x = 0;
    private double y = 0;

    public Circle(double r) {
        super(r);
    }

    void diameter() {
        System.out.println(2 * side1);
    }

    void move(Input inp) {
        System.out.println("На сколько передвинуть по x:");
        x += inp.inputAnyNumber();
        System.out.println("На сколько передвинуть по y:");
        y += inp.inputAnyNumber();
    }

    public void pointInCircle(Input inp) {
        System.out.println("Введите координату точки x:");
        double x2 = inp.inputAnyNumber();
        System.out.println("Введите координату точки y:");
        double y2 = inp.inputAnyNumber();
        double gipotenuze = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        if (gipotenuze <= side1) {
            System.out.println("Точка лежит внутри круга");
        } else {
            System.out.println("Точка не лежит внутри круга");
        }
    }

    @Override
    protected double area() {
        return Math.PI * side1 * side1;
    }

    @Override
    protected double perimeter() {
        return 2 * Math.PI * side1;
    }

    @Override
    protected void show() {
        System.out.println("===Круг===");
        System.out.println("Радиус: " + side1);
        System.out.println("Позиция центра: (" + x + "; " + y + ")");
    }

    @Override
    public void menu(Input inp) {
        while (true) {
            System.out.println("\n===Меню===");
            System.out.println("1 - показать информацию");
            System.out.println("2 - вычислить площадь");
            System.out.println("3 - вычислить длину окружности");
            System.out.println("4 - передвинуть фигуру");
            System.out.println("5 - диаметр");
            System.out.println("6 - лежит ли точка в окружности");
            System.out.println("7 - выход");
            int choice = (int) inp.inputPositiveNumber();
            switch (choice) {
                case 1:
                    show();
                    break;
                case 2:
                    System.out.println("Площадь круга = " + area());
                    break;
                case 3:
                    System.out.println("Длина окружности = " + perimeter());
                    break;
                case 4:
                    move(inp);
                    break;
                case 5:
                    diameter();
                    break;
                case 6:
                    pointInCircle(inp);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
