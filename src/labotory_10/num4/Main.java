package labotory_10.num4;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(2.0,"Односторонний");
        Triangle tr2 = new Triangle(2.0,2.5,2.3,"Разносторонний");
        Triangle tr3 = new Triangle(2.5,2.3,"Равнобедренный");
        Circle c = new Circle(2.0);
        System.out.println("Описание треугольника#1: ");
        tr1.show2();
        System.out.printf("Площадь треугольника = %.2f",tr1.area());
        System.out.println("\n");
        System.out.println("Опсание треугольника#2: ");
        tr2.show2();
        System.out.printf("Площадь треугольника = %.2f",tr2.area());
        System.out.println("\n");
        System.out.println("Описание треугольника#3: ");
        tr3.show2();
        System.out.printf("Площадь треугольника = %.2f",tr3.area());
        System.out.println("\n");
        System.out.println("Описание круга: ");
        System.out.printf("Площадь круга = %.2f",c.area());
        System.out.println();
        System.out.printf("Периметр круга = %.2f",c.perimeter());
        System.out.println("\n");
        System.out.println("Описание четырехугольника#1: ");
        Quadrangle q1 = new Quadrangle(3, "Квадрат");
        q1.show2();
        q1.show1();
        System.out.printf("Площадь четырехугольника = %.2f", q1.area());
        System.out.println("\n");
        System.out.println("Описание четырехугольника#2: ");
        Quadrangle q2 = new Quadrangle(4, 2, "Прямоугольник");
        q2.show2();
        q2.show1();
        System.out.printf("Площадь четырехугольника = %.2f", q2.area());
        System.out.println("\n");
        System.out.println("Описание четырехугольника#3: ");
        Quadrangle q3 = new Quadrangle(4, 2, 5, "Трапеция");
        q3.show2();
        q3.show1();
        System.out.printf("Площадь четырехугольника = %.2f", q3.area());
        System.out.println("\n");
        System.out.println("Описание четырехугольника#4: ");
        Quadrangle q4 = new Quadrangle(4, 2, 5, 6, "Произвольный");
        q4.show2();
        q4.show1();
        System.out.printf("Площадь четырехугольника = %.2f", q4.area());

    }
}
