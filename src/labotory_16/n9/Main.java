package labotory_16.n9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        char ch;
        int i;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] mass = new char[2];
        char[] mass2;
        int choice;
        while (true) {
            System.out.println("\n1 - Ввод\n2 - Вывод\n3 - Сортировка\n0 - выход");
            choice = br.read();
            br.readLine();
            switch (choice) {
                case '1':
                    System.out.println("Введите символы, точку для выхода");
                    while (true) {
                        ch = (char) br.read();
                        br.readLine();
                        System.out.println(ch);
                        if (ch == '.') {
                            break;
                        } else if (count == mass.length){
                            mass2 = new char[mass.length * 2];
                            for (i = 0; i < mass.length; i ++) {
                                mass2[i] = mass[i];
                            }
                            mass = mass2;
                        }
                        mass[count++] = ch;
                    }
                    break;
                case '2':
                    System.out.println("\n1 - В строку\n2 - В столбец");
                    choice = br.read();
                    br.readLine();
                    switch (choice) {
                        case '1':
                            for (i = 0; i < mass.length; i++) {
                                System.out.print(mass[i] + "\t");
                            }
                            break;
                        case '2':
                            for (i = 0; i < mass.length; i++) {
                                System.out.println(mass[i]);
                            }
                            break;
                        default:
                            System.out.println("Нет такого варианта");
                    }
                    break;
                case '3':
                    System.out.println("\n1 - Обратный порядок\n2 - По возрастанию\n3 - По убыванию");
                    choice = br.read();
                    br.readLine();
                    char buff;
                    boolean isSorted = false;
                    switch (choice) {
                        case '1':
                            for (i = 0; i < mass.length / 2; i++) {
                                buff = mass[i];
                                mass[i] = mass[mass.length - i - 1];
                                mass[mass.length - i - 1] = buff;
                            }
                            break;
                        case '2':
                            while (!isSorted) {
                                for (i = 0; i < mass.length - 1; i++) {
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
                        case '3':
                            while (!isSorted) {
                                for (i = 0; i < mass.length - 1; i++) {
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
                            System.out.println("Нет такого варианта");
                    }
                    break;
                case '0':
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
