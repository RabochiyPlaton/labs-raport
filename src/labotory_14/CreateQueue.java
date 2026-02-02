package labotory_14;

import java.util.Scanner;

public class CreateQueue {
    public static Och create(Scanner scanner) {
        System.out.println("Выберите тип:\n1 - Очередь\n2 - Стэк");
        int type = scanner.nextInt();
        System.out.println("Выберите вид:\n1 - Фиксированная\n2 - Кольцевая\n3 - Динамическая\n4 - Кольцевая-Динамическая");
        int kind = scanner.nextInt();
        System.out.print("Введите размер: ");
        int length = scanner.nextInt();
        if (type == 1) {
            switch (kind) {
                case 1:
                    return new FixedQueue(length);
                case 2:
                    return new CircularQueue(length);
                case 3:
                    return new DynamicQueue(length);
                case 4:
                    return new DynamicCircularQueue(length);
                default:
                    System.out.println("Нет такого варианта, повторите попытку");
            }
        } else {
            switch (kind) {
                case 1:
                    return new FixedStack(length);
                case 2:
                    return new CircularStack(length);
                case 3:
                    return new DynamicStack(length);
                case 4:
                    return new DynamicCircularStack(length);
                default:
                    System.out.println("Нет такого варианта, повторите попытку");
            }
        }
        return null;
    }
}