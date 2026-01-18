package labotory_15.NewQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queueType, queueKind;
        while (true) {
            System.out.println("Выберите тип очереди:\n1 - FIFO\n2 - LIFO\n3 - Выход из программы");
            queueType = scanner.nextInt();
            if (queueType == 1 || queueType == 2) {
                System.out.println("Выберите вид очереди:\n1 - Фиксированная\n2 - Кольцевая\n3 - Динамическая\n4 - Кольцевая-Динамическая");
                queueKind = scanner.nextInt();
                if (queueKind >= 1 && queueKind <= 4) {
                    Och och = createQueue(queueType, queueKind, scanner);
                    menu(scanner, och);
                } else System.out.println("Нет такого варианта, повторите попытку");
            } else if (queueType == 3) return;
            else System.out.println("Нет такого варианта, повторите попытку");
        }
    }

    static void menu(Scanner scanner, Och och) {
        char chPut, ch;
        int choice, size2;
        while (true) {
            System.out.println("\n1 - добавить элементы\n2 - извлечь элементы\n3 - сбросить очередь\n4 - выход");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Вводите элементы (0 для выхода)");
                    boolean g = true;
                    while (g) {
                        chPut = scanner.nextLine().charAt(0);
                        if (chPut == '0') {
                            g = false;
                        } else {
                            och.put(chPut);
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Сколько символов надо извлечь?");
                    size2 = scanner.nextInt();
                    if (size2 > och.getLength()) size2 = och.getLength();
                    System.out.print("Состав очереди q1: \n");
                    System.out.print("[ ");
                    for (int i = 0; i < size2; i++) {
                        ch = och.get();
                        System.out.print(ch + " ");
                    }
                    System.out.print("]");
                    break;
                case 3:
                    System.out.println("\nСброс очереди...");
                    och.reset();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }

    static Och createQueue(int queueType, int queueKind, Scanner scanner) {
        System.out.print("Задайте длинну очереди: ");
        int length = scanner.nextInt();
        if (queueType == 1) {
            switch (queueKind) {
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
            switch (queueKind) {
                case 1:
                    return new FixedStack(length);
                case 2:
                    return new CircularStack(length);
                case 3:
                case 4:
                    return new DynamicStack(length);
                default:
                    System.out.println("Нет такого варианта, повторите попытку");
            }
        }
        return null;
    }
}