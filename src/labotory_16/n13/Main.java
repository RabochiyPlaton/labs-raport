package labotory_16.n13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str;
        int countA = 0;
        int countN = 0;
        int countP = 0;
        String [] mass;
        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Projects\\java\\labs-raport\\warandpeace.txt"))) {
            while ((str = bf.readLine()) != null) {
                str = str.toLowerCase();
                mass = str.split(" ");
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i].contains("андрей")) {
                        countA++;
                    }
                    else if (mass[i].contains("наташа")) {
                        countN++;
                    }
                    else if (mass[i].contains("пьер")) {
                        countP++;
                    }
                }
            }
        } catch (IOException exc) {
            System.out.println("Ошибка доступа к файлу");
        }
        System.out.println("Количество упоминаний имен героев произведения <<Война и мир>>");
        if (countA > countN && countA > countP) {
            System.out.println("Андрей Болконский - " + countA + " раз(а)");
            if (countN > countP) {
                System.out.println("Наташа Ростова - " + countN + " раз(а)");
                System.out.println("Пьер Безухов - " + countP + " раз(а)");
            } else {
                System.out.println("Пьер Безухов - " + countP + " раз(а)");
                System.out.println("Наташа Ростова - " + countN + " раз(а)");

            }
        } else if (countN > countA && countN > countP) {
            System.out.println("Наташа Ростова - " + countN + " раз(а)");
            if (countA > countP) {
                System.out.println("Андрей Болконский - " + countA + " раз(а)");
                System.out.println("Пьер Безухов - " + countP + " раз(а)");
            } else {
                System.out.println("Пьер Безухов - " + countP + " раз(а)");
                System.out.println("Андрей Болконский - " + countA + " раз(а)");
            }
        } else {
            System.out.println("Пьер Безухов - " + countP + " раз(а)");
            if (countA > countN) {
                System.out.println("Андрей Болконский - " + countA + " раз(а)");
                System.out.println("Наташа Ростова - " + countN + " раз(а)");
            } else {
                System.out.println("Наташа Ростова - " + countN + " раз(а)");
                System.out.println("Андрей Болконский - " + countA + " раз(а)");
            }
        }
    }
}
