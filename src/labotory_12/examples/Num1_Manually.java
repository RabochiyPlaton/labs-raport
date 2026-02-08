package labotory_12.examples;

import java.util.Scanner;

public class Num1_Manually {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, date;
        String author, title;
        while (true) {
            System.out.println("Сколько книг вы хотите ввести?");
            n = scanner.nextInt();
            if (n<= 0) {
                System.out.println("Введите число больше нуля");
                continue;
            }
            scanner.nextLine();
            Num1 [] books = new Num1[n];
            for (int i = 0; i < books.length; i++) {
                System.out.println("Книга №" + (i+1));
                System.out.println("Введите название : ");
                title = scanner.nextLine();
                System.out.println("Введите имя автора: ");
                author = scanner.nextLine();
                System.out.println("Введите дату публикации: ");
                date = scanner.nextInt();
                scanner.nextLine();
                books[i] = new Num1(title,author,date);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println("Книга №"+i);
                books[i].show();
            }
            break;
        }
    }
}
