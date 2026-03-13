package labotory_11.figures;

import labotory_11.input.Input;

public class ChooseFigure {

    private int choice;
    Input inp = new Input();

    public void chooseFigure(double a){
        System.out.println("1 - равносторонний треугольник\n2 - квадрат\n3 - круг\n4 - ромб");
        choice = (int) inp.inputPositiveNumber();
        if (choice == 1) {
            Triangle triangle = new Triangle(a);
            triangle.menu(inp);
        } else if (choice == 2) {
            Quadrangle quadrangle = new Quadrangle(a);
            quadrangle.setStyle("квадрат");
            quadrangle.menu(inp);
        } else if (choice == 3) {
            new Circle(a).menu(inp);
        } else if (choice == 4) {
            Quadrangle rhomb = new Quadrangle(a);
            rhomb.setStyle("ромб");
            rhomb.menu(inp);
        }
    }

    public void chooseFigure(double a, double b){
        if (a == b) System.out.println("1 - ромб\n2 - квадрат");
        else {
            System.out.println("1 - равнобедренный треугольник\n2 - прямоугольник\n3 - параллелограмм");
        }
        choice = (int) inp.inputPositiveNumber();
        if (choice == 1) {
            Triangle tr;
            if (a > b) {
                tr = new Triangle(a, b);
            } else {
                tr = new Triangle(b, a);
            }
            tr.menu(inp);
        } else if (choice == 2) {
            new Quadrangle(a, b).menu(inp);
        } else if (choice == 3) {
            Quadrangle p = new Quadrangle(a, b);
            p.setStyle("параллелограмм");
            p.menu(inp);
        } else if (choice == 4 && a == b) {
            Quadrangle r = new Quadrangle(a);
            r.setStyle("ромб");
            r.menu(inp);
        } else if (choice == 5 && a == b) {
            Quadrangle quadrangle = new Quadrangle(a);
            quadrangle.setStyle("квадрат");
            quadrangle.menu(inp);
        }
    }

    public void chooseFigure(double a, double b, double c){
        Triangle triangle;
        System.out.println("1 - треугольник");
        if ((a==b&&a!=c) || (a==c && a!=b)) System.out.println("2 - параллелограмм");
        else if (a == b && a == c) System.out.println("2 - ромб\n3 - квадрат");
        else System.out.println("3 - равнобедренная трапеция");
        choice = (int) inp.inputPositiveNumber();
        if (choice == 1) {
            if (a == b || a == c || b == c) {
                System.out.println("Можно создать равнобедренный треугольник");
                if (a == b) {
                    triangle = new Triangle(a, b);
                } else if (a == c) {
                    triangle = new Triangle(a, c);
                } else {
                    triangle = new Triangle(b, a);
                }
            } else {
                System.out.println("Можно создать разносторонний треугольник");
                triangle = new Triangle(a, b, c);
            }
            triangle.menu(inp);
        } else if (choice == 2) {
            Quadrangle quadrangle = new Quadrangle(a, b, c);
            quadrangle.setStyle("равнобедренная трапеция");
            quadrangle.menu(inp);
        } else if (a == b && a == c) {
            Quadrangle quadrangle = new Quadrangle(a);
            if (choice == 3) {
                quadrangle.setStyle("ромб");
            } else if (choice == 4) {
                quadrangle.setStyle("квадрат");
            }
            quadrangle.menu(inp);
        }
    }

    public void chooseFigure(double a, double b, double c, double d){
        if (a == b && b == c && c == d) {
            System.out.println("1 - квадрат\n2 - ромб");
            choice = (int) inp.inputPositiveNumber();
            Quadrangle q = new Quadrangle(a);
            if (choice == 2) q.setStyle("ромб");
            q.menu(inp);
        } else if ((a == b && c == d) ||
                (a == c && b == d) ||
                (a == d && b == c)) {
            System.out.println("1 - прямоугольник\n2 - параллелограмм");
            choice = (int) inp.inputPositiveNumber();
            double side2;
            if (a != b) side2 = b;
            else side2 = c;
            Quadrangle quadrangle = new Quadrangle(a, side2);
            if (choice == 1) quadrangle.setStyle("прямоугольник");
            else quadrangle.setStyle("параллелограмм");
            quadrangle.menu(inp);
        } else {
            System.out.println("1 - трапеция\n2 - произвольный четырехугольник");
            choice = (int) inp.inputPositiveNumber();
            Quadrangle quad = new Quadrangle(a, b, c, d);
            if (choice == 1) quad.setStyle("трапеция");
            else if (choice == 3) quad.setStyle("параллелограмм");
            quad.menu(inp);
        }
    }
}
