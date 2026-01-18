package labotory_10.NotAbstract.input;

import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public double inputDouble() {
        double side;
        while (true) {
            side = scanner.nextDouble();
            if (side <= 0) {
                System.out.println("Введите число > 0");
                continue;
            }
            return side;
        }
    }
}
