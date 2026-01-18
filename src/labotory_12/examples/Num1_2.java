package labotory_12.examples;

public class Num1_2 {
    public static void main(String[] args) {
        Num1[] books = new Num1[5];
        books[0] = new Num1("Java: a Begginer`s guide", "Schildt", 2014);
        books[1] = new Num1("Java: The complete Reference", "Schildt", 2014);
        books[2] = new Num1("The art of Java", "Schildt and Holmes", 2003);
        books[3] = new Num1("Red Storm Rising", "Clancy", 1986);
        books[4] = new Num1("On the Road", "Kerouac", 1955);
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
