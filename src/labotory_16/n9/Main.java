package labotory_16.n9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String ch;
        int i, size;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива: ");
        size = Integer.parseInt(br.readLine());
        char[] mass = new char[size];
        int choice;
        while (true) {
            System.out.println("\n1 - Ввод\n2 - Вывод\n3 - Сортировка\n0 - выход");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Введите символы, точку для выхода");
                    for (i = 0; i < mass.length; i++) {
                        ch = br.readLine();
                        System.out.println(ch);
                        if (ch.charAt(0) != '.') {
                            mass[i] = ch.charAt(0);
                        } else break;
                    }
                    break;
                case 2:
                    System.out.println("\n1 - В строку\n2 - В столбец");
                    choice = Integer.parseInt(br.readLine());
                    switch (choice) {
                        case 1:
                            for (i = 0; i < mass.length; i++) {
                                System.out.print(mass[i] + "\t");
                            }
                            break;
                        case 2:
                            for (i = 0; i < mass.length; i++) {
                                System.out.println(mass[i]);
                            }
                            break;
                        default:
                            return;
                    }
                    break;
                case 3:
                    System.out.println("\n1 - Обратный порядок\n2 - По возрастанию\n3 - По убыванию");
                    choice = Integer.parseInt(br.readLine());
                    char buff;
                    boolean isSorted = false;
                    switch (choice) {
                        case 1:
                            for (i = 0; i < mass.length/2; i++) {
                                buff = mass[i];
                                mass[i] = mass[mass.length - i - 1];
                                mass[mass.length - i - 1] = buff;
                            }
                            break;
                        case 2:
                            while (!isSorted) {
                                for (i = 0; i < mass.length-1; i++) {
                                    if (mass[i] > mass[i + 1]) {
                                        buff = mass[i];
                                        mass[i] = mass[i + 1];
                                        mass[i + 1] = buff;
                                        isSorted = false;
                                        i++;
                                    } else isSorted = true;
                                }
                            }
                            break;
                        case 3:
                            while (!isSorted) {
                                for (i = 0; i < mass.length-1; i++) {
                                    if (mass[i] < mass[i + 1]) {
                                        buff = mass[i];
                                        mass[i] = mass[i + 1];
                                        mass[i + 1] = buff;
                                        isSorted = false;
                                        i++;
                                    } else isSorted = true;
                                }
                            }
                            break;
                        default:
                            return;
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
