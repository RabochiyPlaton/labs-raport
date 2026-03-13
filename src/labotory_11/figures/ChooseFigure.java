package labotory_11.figures;

import labotory_11.input.Input;

public class ChooseFigure {

    private int choice;
    Input inp = new Input();

    public void chooseFigure(double a) {
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

    public void chooseFigure(double a, double b) {
        if (a == b) {
            System.out.println("1 - квадрат\n2 - ромб\n3 - круг");
            choice = (int) inp.inputPositiveNumber();
            Quadrangle q = new Quadrangle(a);
            if (choice == 1) {
                q.setStyle("квадрат");
                q.menu(inp);
            } else if (choice == 2) {
                q.setStyle("ромб");
                q.menu(inp);
            } else {
                new Circle(a).menu(inp);
            }
        } else {
            System.out.println("1 - прямоугольник\n2 - параллелограмм\n3 - равнобедренный треугольник");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1) {
                Quadrangle p = new Quadrangle(a, b);
                p.setStyle("прямоугольник");
                p.menu(inp);
            } else if (choice == 2) {
                Quadrangle p = new Quadrangle(a, b);
                p.setStyle("параллелограмм");
                p.menu(inp);
            } else if (choice == 3) {
                new Triangle(a, b).menu(inp);
            }
        }
    }

    public void chooseFigure(double a, double b, double c) {
        if (a == b && b == c) {
            System.out.println("1 - равносторонний треугольник\n2 - квадрат\n3 - ромб\n4 - круг");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1) {
                new Triangle(a).menu(inp);
            } else if (choice < 4) {
                Quadrangle q = new Quadrangle(a);
                if (choice == 2) q.setStyle("квадрат");
                else if (choice == 3) q.setStyle("ромб");
                q.menu(inp);
            } else {
                new Circle(a).menu(inp);
            }
        } else if (a == b || b == c || a == c) {
            System.out.println("1 - равнобедренный треугольник\n2 - прямоугольник\n3 - параллелограмм");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1) {
                Triangle tr;
                if (a == b) tr = new Triangle(a, c);
                else if (a == c) tr = new Triangle(a, b);
                else tr = new Triangle(b, a);
                tr.menu(inp);
            } else if (choice == 2 || choice == 3) {
                double s2 = b;
                if (a == b) s2 = c;
                Quadrangle q = new Quadrangle(a, s2);
                if (choice == 2) q.setStyle("прямоугольник");
                else q.setStyle("параллелограмм");
                q.menu(inp);
            }
        } else {
            System.out.println("1 - разносторонний треугольник");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1) {
                new Triangle(a, b, c).menu(inp);
            }
        }
    }

    public void chooseFigure(double a, double b, double c, double d) {
        if (a == b && b == c && c == d) {
            System.out.println("1 - квадрат\n2 - ромб\n3 - равносторонний треугольник\n4 - круг");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1 || choice == 2) {
                Quadrangle q = new Quadrangle(a);
                if (choice == 1) q.setStyle("квадрат");
                else q.setStyle("ромб");
                q.menu(inp);
            } else if (choice == 3) {
                new Triangle(a).menu(inp);
            } else if (choice == 4) {
                new Circle(a).menu(inp);
            }
        } else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            System.out.println("1 - прямоугольник\n2 - параллелограмм\n3 - равнобедренный треугольник");
            choice = (int) inp.inputPositiveNumber();
            double s2 = b;
            if (a == b) s2 = c;
            if (choice == 1 || choice == 2) {
                Quadrangle q = new Quadrangle(a, s2);
                if (choice == 1) q.setStyle("прямоугольник");
                else q.setStyle("параллелограмм");
                q.menu(inp);
            } else if (choice == 3) {
                new Triangle(a, s2).menu(inp);
            }
        } else if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println("1 - равнобедренная трапеция\n2 - произвольный четырехугольник");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1 || choice == 2) {
                Quadrangle q = new Quadrangle(a, b, c, d);
                if (choice == 1) q.setStyle("равнобедренная трапеция");
                else q.setStyle("произвольный четырехугольник");
                q.menu(inp);
            }
        } else {
            System.out.println("1 - трапеция\n2 - произвольный четырехугольник");
            choice = (int) inp.inputPositiveNumber();
            if (choice == 1 || choice == 2) {
                Quadrangle q = new Quadrangle(a, b, c, d);
                if (choice == 1) q.setStyle("трапеция");
                else q.setStyle("произвольный четырехугольник");
                q.menu(inp);
            }
        }
    }
}
