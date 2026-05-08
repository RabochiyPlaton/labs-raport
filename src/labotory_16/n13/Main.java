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
        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Platon\\Desktop\\labs-raport2\\warandpeace.txt"))) {
            while ((str = bf.readLine()) != null) {
                if (str.contains("Андрей")) {
                    countA++;
                }
                if (str.contains("Наташа")) {
                    countN++;
                }
                if (str.contains("Пьер")) {
                    countP++;
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
