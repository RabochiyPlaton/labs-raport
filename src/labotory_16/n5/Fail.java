package labotory_16.n5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fail {
    public void cop(String name1, String name2) {
        FileInputStream fin;
        FileOutputStream fout;
        int i;
        try {
            fin = new FileInputStream(name1);
        } catch (FileNotFoundException ex) {
            System.out.println("Входной файл не найден");
            return;
        }
        try {
            fout = new FileOutputStream(name2);
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка открытия выходного файла");
            try {
                fin.close();
            } catch (IOException ex2) {
                System.out.println("Ошибка закрытия входого файла");
            }
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException ex) {
            System.out.println("Файловая ошибка");
        }
        try {
            fin.close();
        } catch (IOException ex) {
            System.out.println("Ошибка закрытия входного файла");
        }
        try {
            fout.close();
        } catch (IOException ex) {
            System.out.println("Ошибка закрытия выходного файла");
        }
    }


    public boolean isNotEmpty(String name1) {
        int i;
        try (FileInputStream fin = new FileInputStream(name1)) {
            i = fin.read();
            if (i != -1) {
                System.out.println("Файл пуст, нечего копировать");
                return false;
            }
        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
        }
        return true;
    }

    public void read(String name1) {
        int i;
        try (FileInputStream fin = new FileInputStream(name1)) {
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}