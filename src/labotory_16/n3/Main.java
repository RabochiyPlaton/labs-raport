package labotory_16.n3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fin;
        int i;
        try {
            fin = new FileInputStream("C:\\Users\\Platon\\Desktop\\номер3.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Файл не найден");
        }
        try {
            fin.close();
        } catch (IOException exc) {
            System.out.println("Ошибка чтения файла");
        }
    }
}
