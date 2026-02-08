package labotory_10.num3;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(2.0,"Односторонний");
        Triangle tr2 = new Triangle(2.0,2.5,2.3,"Разносторонний");
        Triangle tr3 = new Triangle(2.5,2.3,"Равнобедренный");
        Circle c = new Circle(2.0);
        Rectangle r = new Rectangle(4.0,2.0);
        System.out.println("Описание треугольника#1: ");
        tr1.show2();
        System.out.printf("Площадь треугольника = %.2f",tr1.area());
        System.out.println();
        System.out.println();
        System.out.println("Описание треугольника#2: ");
        tr2.show2();
        System.out.printf("Площадь треугольника = %.2f",tr2.area());
        System.out.println();
        System.out.println();
        System.out.println("Описание треугольника#3: ");
        tr3.show2();
        System.out.printf("Площадь треугольника = %.2f",tr3.area());
        System.out.println();
        System.out.println();
        System.out.println("Описание круга: ");
        System.out.printf("Площадь круга = %.2f",c.area());
        System.out.println();
        System.out.printf("Периметр круга = %.2f",c.perimeter());
        System.out.println();
        System.out.println();
        System.out.println("Описание прямоугольника: ");
        r.show1();
        System.out.printf("Площадь прямоугольника = %.2f", r.area());
    }
}
