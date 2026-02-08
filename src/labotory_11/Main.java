package labotory_11;

import labotory_11.figures.*;
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
                System.out.println("1 - равносторонний треугольник\n2 - квадрат\n3 - круг\n4 - ромб");
                choice = (int) inp.inputPositiveNumber();
                if (choice == 1) {
                    Triangle triangle = new Triangle(sides[0]);
                    triangle.menu(inp);
                } else if (choice == 2) {
                    Quadrangle quadrangle = new Quadrangle(sides[0]);
                    quadrangle.setStyle("квадрат");
                    quadrangle.menu(inp);
                } else if (choice == 3) {
                    new Circle(sides[0]).menu(inp);
                } else if (choice == 4) {
                    Quadrangle rhomb = new Quadrangle(sides[0]);
                    rhomb.setStyle("ромб");
                    rhomb.menu(inp);
                }
                break;
            case 2:
                System.out.println("1 - равнобедренный треугольник\n2 - прямоугольник\n3 - параллелограмм");
                if (sides[0] == sides[1]) System.out.println("4 - ромб\n5 - квадрат");
                choice = (int) inp.inputPositiveNumber();
                if (choice == 1) {
                    Triangle tr = (sides[0] > sides[1]) ? new Triangle(sides[0], sides[1]) : new Triangle(sides[1], sides[0]);
                    tr.menu(inp);
                } else if (choice == 2) {
                    new Quadrangle(sides[0], sides[1]).menu(inp);
                } else if (choice == 3) {
                    Quadrangle p = new Quadrangle(sides[0], sides[1]);
                    p.setStyle("параллелограмм");
                    p.menu(inp);
                } else if (choice == 4 && sides[0] == sides[1]) {
                    Quadrangle r = new Quadrangle(sides[0]);
                    r.setStyle("ромб");
                    r.menu(inp);
                } else if (choice == 5 && sides[0] == sides[1]) {
                    Quadrangle quadrangle = new Quadrangle(sides[0]);
                    quadrangle.setStyle("квадрат");
                    quadrangle.menu(inp);
                }
                break;
            case 3:
                Triangle triangle;
                System.out.println("1 - треугольник\n2 - равнобедренная трапеция\n3 - ромб\n4 - квадрат");
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
                } else if (choice == 2) {
                    Quadrangle quadrangle = new Quadrangle(sides[0], sides[1], sides[2]);
                    quadrangle.setStyle("равнобедренная трапеция");
                    quadrangle.menu(inp);
                } else if (sides[0] == sides[1] && sides[0] == sides[2]) {
                    Quadrangle quadrangle = new Quadrangle(sides[0]);
                    if (choice == 3) {
                        quadrangle.setStyle("ромб");
                    } else if (choice == 4) {
                        quadrangle.setStyle("квадрат");
                    }
                    quadrangle.menu(inp);
                } else System.out.println("Для ромба/квадрата нужны одинаковые стороны");
                break;
            case 4:
                if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) {
                    System.out.println("1 - квадрат\n2 - ромб");
                    choice = (int) inp.inputPositiveNumber();
                    Quadrangle q = new Quadrangle(sides[0]);
                    if (choice == 2) q.setStyle("ромб");
                    q.menu(inp);
                } else if ((sides[0] == sides[1] && sides[2] == sides[3]) ||
                        (sides[0] == sides[2] && sides[1] == sides[3]) ||
                        (sides[0] == sides[3] && sides[1] == sides[2])) {
                    System.out.println("1 - прямоугольник\n2 - параллелограмм");
                    choice = (int) inp.inputPositiveNumber();
                    double side1 = sides[0];
                    double side2;
                    if (side1 != sides[1]) side2 = sides[1];
                    else side2 = sides[2];
                    Quadrangle quadrangle = new Quadrangle(side1, side2);
                    if (choice == 1) quadrangle.setStyle("прямоугольник");
                    else quadrangle.setStyle("параллелограмм");
                    quadrangle.menu(inp);
                } else {
                    System.out.println("1 - трапеция\n2 - произвольный четырехугольник");
                    choice = (int) inp.inputPositiveNumber();
                    Quadrangle quad = new Quadrangle(sides[0], sides[1], sides[2], sides[3]);
                    if (choice == 1) quad.setStyle("трапеция");
                    else if (choice == 3) quad.setStyle("параллелограмм");
                    quad.menu(inp);
                }
                break;
            default:
                System.out.println("Невозможно создать фигуру");
        }
    }
}