package labotory_10.num6;


public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle("прямоугольный", 12.0, 8.0);
        Triangle tr3 = new Triangle(4.0);
        tr1 = tr2;
        System.out.println("Описание треугольника#1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника = " + tr1.area());
        System.out.println();
        System.out.println("Описание треугольника#2: ");
        tr2.show1();
        tr2.show2();
        System.out.println("Площадь треугольника = " + tr2.area());
        System.out.println();
        System.out.println("Описание треугольника#3: ");
        tr3.show1();
        tr3.show2();
        System.out.println("Площадь треугольника = " + tr3.area());
    }
}