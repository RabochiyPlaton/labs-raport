package labotory_16.n3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin;
        FileOutputStream fout;
        Scanner scanner = new Scanner(System.in);
        int i, choice;
        byte[] data = new byte[10];
        System.out.print("Введите название файла: ");
        String name = "C:\\Users\\Platon\\Desktop\\";
        name += scanner.nextLine();
        name += ".txt";
        try {
            fin = new FileInputStream(name);
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }
        try {
            fin.close();
        } catch (IOException exc) {
            System.out.println("Ошибка чтения файла");
        }
        while (true) {
            System.out.println("Выберете действие:\n1 - записать в файл\n2 - чтение файла\n3 - выход");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    fout = new FileOutputStream(name);
                    fin = new FileInputStream(name);
                    try {
                        System.in.read(data);
                        for (i = 0; i < data.length; i++) {
                            fout.write(data[i]);
                        }
                    } catch (IOException ex) {
                        System.out.println("Файловая ошибка");
                    }
                    fin.close();
                    fout.close();
                    break;
                case 2:
                    fin = new FileInputStream(name);
                    try {
                        while ((i = fin.read()) != -1) {
                            System.out.print((char) i);
                        }
                        System.out.println();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    fin.close();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
