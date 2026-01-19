package labotory_15.Nums;

import labotory_15.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Fibonacci fibonacci = new Fibonacci();
        Factorial factorial = new Factorial();
        while (true) {
            System.out.println("1 - Фибоначчи\n2 - Факториал\n3 - Выход");
            int choice = (int) input.inputPositiveNumber();
            switch (choice) {
                case 1:
                    fibonacci.fibonacci(input);
                    break;
                case 2:
                    factorial.factorial(input);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
