package labotory_11.input;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public double inputPositiveNumber() {
        double x;
        while (true) {
            x = scanner.nextDouble();
            scanner.nextLine();
            if (x <= 0) {
                System.out.println("Введите число > 0");
                continue;
            }
            return x;
        }
    }

    public double inputAnyNumber() {
        double x;
        x = scanner.nextDouble();
        scanner.nextLine();
        return x;
    }
}
