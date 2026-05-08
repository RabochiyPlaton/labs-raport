package аввмвм;

public class InstanseOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A) {
            System.out.println("a экземпляр класса А");
        }
        if (b instanceof B) {
            System.out.println("b экземпляр класса B");
        }
        if (c instanceof C) {
            System.out.println("c экземпляр класса C");
        }
        if (d instanceof D) {
            System.out.println("d экземпляр класса D");
        }
        if (c instanceof A) {
            System.out.println("с экземпляр А");
        }
        if (a instanceof C) {
            System.out.println("можно привести к А");
        }else System.out.println("НЕЛЬЗЯ");
        System.out.println();
        A ob;
        ob = d;
        if (ob instanceof D) {
            System.out.println("ob экземпляр D");
        }
        System.out.println();
        ob = c;
        if (ob instanceof D) {
            System.out.println("об можно привести к Д");
        } else System.out.println("об нельзя к Д");
//        if (ob instanceof B) {
//            System.out.println("об можно привести к B");
//        }else System.out.println("нельзя");
        if (a instanceof Object) {
            System.out.println("а можно привести к Object");
        }
        if (b instanceof Object) {
            System.out.println("b можно привести к Object");
        }
    }
}
