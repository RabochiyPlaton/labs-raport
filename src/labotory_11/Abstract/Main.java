package labotory_11.Abstract;

import labotory_11.Abstract.figures.*;
import labotory_11.input.Input;

public class Main {
    public static void main(String[] args) {
        Input inp = new Input();
        double[] sides = new double[4];
        int count = 0;
        int choice;
        while (count < sides.length) {
            System.out.println("Хотите ввести сторону?(1 - да, 2 - нет)");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1) {
                System.out.println("Введите " + (count + 1) + "-ую сторону:");
                sides[count] = inp.inputPositiveNumber();
                if (sides[count] != 0) count++;
            } else break;
        }
        System.out.println("Выберите тип фигуры:");
        switch (count) {
            case 1:
                System.out.println("1 - равносторонний треугольник\n2 - квадрат\n3 - круг");
                choice = (int) inp.inputPositiveNumber();
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
                choice = (int) inp.inputPositiveNumber();
                if (choice == 1) {
                    Triangle triangle;
                    if (sides[0] > sides[1]) {
                        triangle = new Triangle(sides[0], sides[1]);
                    } else {
                        triangle = new Triangle(sides[1], sides[0]);
                    }
                    triangle.menu(inp);
                } else {
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1]);
                    quadrangle.menu(inp);
                }
                break;
            case 3:
                Triangle triangle;
                System.out.println("1 - треугольник\n2 - равнобедренная трапеция");
                choice = (int) inp.inputPositiveNumber();
                if (choice == 1) {
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
                } else {
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1], sides[2]);
                    quadrangle.menu(inp);
                }
                break;
            case 4:
                if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) {
                    System.out.println("Можно создать только квадрат");
                    Quadrangle quadrangle = new Quadrangle(sides[0]);
                    quadrangle.menu(inp);
                } else if ((sides[0] == sides[1] && sides[2] == sides[3]) ||
                        (sides[0] == sides[2] && sides[1] == sides[3]) ||
                        (sides[0] == sides[3] && sides[1] == sides[2])) {
                    System.out.println("Можно создать только прямоугольник");
                    double side1 = sides[0];
                    double side2;
                    if (side1 != sides[1]) side2 = sides[1];
                    else side2 = sides[2];
                    Quadrangle quadrangle = new Quadrangle(side1, side2);
                    quadrangle.menu(inp);
                } else {
                    System.out.println("Можно создать только произвольный четырехугольник");
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1], sides[2], sides[3]);
                    quadrangle.menu(inp);
                }
                break;
            default:
                System.out.println("Невозможно создать фигуру");
        }
    }
}