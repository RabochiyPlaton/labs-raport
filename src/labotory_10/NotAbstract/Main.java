import labotory_10.NotAbstract.figures.Circle;
import labotory_10.NotAbstract.figures.Quadrangle;
import labotory_10.NotAbstract.figures.Triangle;
import labotory_10.NotAbstract.input.Input;

public class Main {
    public static void main(String[] args) {
        Input inp = new Input();
        double[] sides = new double[4];
        int count = 0;
        int choice;
        while (count < sides.length) {
            System.out.println("Хотите ввести сторону?(1 - да)");
            choice = (int) inp.inputDouble();
            if (choice == 1) {
                System.out.println("Введите " + (count + 1) + "-ую сторону:");
                sides[count] = inp.inputDouble();
                if (sides[count] != 0) count++;
            } else break;
        }
        System.out.println("Выберите тип фигуры:");
        switch (count) {
            case 1:
                System.out.println("1 - односторонний треугольник\n2 - квадрат\n3 - круг");
                choice = (int) inp.inputDouble();
                if (choice == 1) {
                    Triangle triangle = new Triangle(sides[0]);
                    triangle.menu(inp);
                } else if (choice == 2) {
                    Quadrangle quadrangle = new Quadrangle(sides[0]);
                    quadrangle.menu(inp);
                } else {
                    Circle circle = new Circle(sides[0]);
                    circle.menu(inp);
                }
                break;
            case 2:
                System.out.println("1 - равнобедренный треугольник\n2 - прямоугольник");
                choice = (int) inp.inputDouble();
                if (choice == 1) {
                    Triangle triangle = new Triangle(sides[0], sides[1]);
                    triangle.menu(inp);
                } else {
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1]);
                    quadrangle.menu(inp);
                }
                break;
            case 3:
                Triangle triangle;
                if (sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
                    System.out.println("Можно создать равнобедренный треугольник");
                    if (sides[0] == sides[1]) {
                        triangle = new Triangle(sides[0], sides[1]);
                    } else if (sides[0] == sides[2]) {
                        triangle = new Triangle(sides[0], sides[2]);
                    } else {
                        triangle = new Triangle(sides[1], sides[0]);
                    }
                } else {
                    System.out.println("Можно создать разносторонний треугольник");
                    triangle = new Triangle(sides[0], sides[1], sides[2]);
                }
                triangle.menu(inp);
                break;
            case 4:
                if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) {
                    System.out.println("Можно создать только квадрат");
                    Quadrangle quadrangle = new Quadrangle(sides[0]);
                    quadrangle.menu(inp);
                } else if (sides[0] == sides[2] && sides[1] == sides[3]) {
                    System.out.println("Можно создать только прямоугольник");
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1]);
                    quadrangle.menu(inp);
                } else {
                    System.out.println("Можно создать только произвольных четырехугольник");
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1], sides[2], sides[3]);
                    quadrangle.menu(inp);
                }
                break;
            default:
                System.out.println("Невозможно создать фигуру");
        }
    }
}