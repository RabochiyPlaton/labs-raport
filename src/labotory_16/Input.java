package labotory_16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int input(String str) {
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            try {
                System.out.println("Введите " + str);
                size = scanner.nextInt();
                break;
            } catch (InputMismatchException exc) {
                System.out.println("Неправильный тип данных");
            }
        }
        return size;
    }
}
