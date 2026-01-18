package labotory_11.input;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public double input() {
        double side;
        while (true) {
            side = scanner.nextDouble();
            scanner.nextLine();
            if (side <= 0) {
                System.out.println("Введите число > 0");
                continue;
            }
            return side;
        }
    }
}
