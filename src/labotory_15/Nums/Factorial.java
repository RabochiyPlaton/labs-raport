package labotory_15.Nums;

import labotory_15.Input;

public class Factorial {
    public void factorial(Input input) {
        int n;
        while (true) {
            try {
                System.out.print("Введите положительное число: ");
                n = (int) input.inputPositiveNumber();
                if (n < 0) {
                    throw new NegativeNumberException("Число должно быть положительное");
                }
                if (n > 12) {
                    throw new FactorialOverflowException("Максимально допустимое число для расчета факториала int - 12");
                }
                int fact = 1;
                for (int i = 2; i <= n; i++) {
                    fact *= i;
                }
                System.out.println("Факториал числа " + n + " = " + fact);
                break;
            }catch (FactorialOverflowException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
