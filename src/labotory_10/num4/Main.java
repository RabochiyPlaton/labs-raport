package labotory_10.num4;


public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle("равнобедренный", 4.0, 4.0);
        Triangle tr2 = new Triangle("прямоугольный", 12.0, 8.0);
        System.out.println("Описание треугольника#1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника = " + tr1.area());
        System.out.println();
        System.out.println("Описание треугольника#2: ");
        tr2.show1();
        tr2.show2();
        System.out.println("Площадь треугольника = " + tr2.area());
    }
}