package labotory_12.examples;

public class Num2_Main {
    public static void main(String[] args) {
        Num2_2[] books = new Num2_2[5];
        books[0] = new Num2_2("Java: руководство для начинающих, 7 издание", "Герберт Шилдт", 2014, "Вильямс");
        books[1] = new Num2_2("Java: Полное руководство, 10 издание", "Герберт Шилдт", 2014, "Вильямс");
        books[2] = new Num2_2("Искусство программирования на Java", "Герберт Шилдт", 2003, "Вильямс");
        books[3] = new Num2_2("Искусство программирования на Java", "Герберт Шилдт", 1986, "Вильямс");
        books[4] = new Num2_2("Искусство программирования на Java", "Герберт Шилдт", 1955, "Вильямс");
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
        System.out.println("Все книги Гербрерта Шилдта:");
        for (int i = 0; i < books.length; i++)
            if (books[i].getAuthor() == "Герберт Шилдт")
                System.out.println(books[i].getTitle());
        books[0].title = "test title";
    }
}
