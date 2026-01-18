package labotory_10.num1;

public class Nasled3 {
    public static void main(String[] args) {
        Nasled2 tr1 = new Nasled2();
        Nasled2 tr2 = new Nasled2();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        tr1.width = 4.0;
        tr1.height = 4.0;
        tr1.style = "равнобедренный";
        tr2.width = 8.0;
        tr2.height = 12.0;
        tr2.style = "прямоугольный";
        c.height = 4.0;
        c.width = 4.0;
        c.radius = 2.0;
        r.height = 3.0;
        r.width = 3.2;
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
        System.out.println("Описание круга: ");
        c.show1();
        System.out.println("Площадь круга = " + c.area());
        System.out.println();
        System.out.println("Описание прямоугольника: ");
        r.show1();
        System.out.println("Площадь прямоугольника = " + r.area());
    }
}
//наслед1 - родитель
//наслед2 - наследник
//наследник использует поля (ширина и высота) и метод шоу1 родителя
