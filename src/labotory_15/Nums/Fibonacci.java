package labotory_15.Nums;

import labotory_15.Input;

public class Fibonacci {
    public void fibonacci(Input input) {
        int n;
        while (true) {
            System.out.print("Введите количество чисел: ");
            n = (int) input.inputPositiveNumber();
            int a = 0, b = 1;
            System.out.print("Последовательность Фибоначчи: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int buf = a + b;
                a = b;
                b = buf;
            }
            System.out.println();
            break;
        }
    }
}
