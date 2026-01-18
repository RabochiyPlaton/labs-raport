package labotory_10.num3;


public class Nasled3 {
    public static void main(String[] args) {
        Nasled2 tr1 = new Nasled2();
        Nasled2 tr2 = new Nasled2();
        tr1.setWidth(4.0);
        tr1.setHeight(4.0);
        tr1.style = "равнобедренный";
        tr2.setWidth(8.0);
        tr2.setHeight(12.0);
        tr2.style = "прямоугольный";
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