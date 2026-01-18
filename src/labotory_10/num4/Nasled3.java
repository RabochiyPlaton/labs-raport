package labotory_10.num4;


public class Nasled3 {
    public static void main(String[] args) {
        Nasled2 tr1 = new Nasled2("равнобедренный", 4.0, 4.0);
        Nasled2 tr2 = new Nasled2("прямоугольный", 12.0, 8.0);
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
//код в задании 4 более эффективный так как мы сразу инициализируем объект,
//а сам код короче и лучше читается