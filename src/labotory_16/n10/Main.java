package labotory_16.n10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String str;
        String str2 = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        while (true) {
            System.out.println("\n1 - Ввод\n2 - Вывод\n0 - выход");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Введите текст (введите stop чтобы выйти)");
                    do {
                        str = br.readLine();
                        if (!str.equals("stop")) {
                            System.out.println(str);
                            str2+=str +" ";
                        }
                    }while (!str.equals("stop"));
                    break;
                case 2:
                    System.out.println("\n1 - Прямой порядок\n2 - Обратный порядок");
                    choice = Integer.parseInt(br.readLine());
                    switch (choice) {
                        case 1:
                            System.out.println(str2);
                            break;
                        case 2:
                            String [] mass = str2.trim().split(" ");
                            for (int i = mass.length; i > 0; i--) {
                                System.out.print(mass[i-1] + " ");
                            }
                            break;
                        default:
                            System.out.println("Нет такого варианта");;
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