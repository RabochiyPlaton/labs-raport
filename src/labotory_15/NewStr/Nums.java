package labotory_15.NewStr;

import java.util.Scanner;

public class Nums {

    StringMethodsClass strMethods = new StringMethodsClass();
    Scanner scanner = new Scanner(System.in);

    String createStr() {
        scanner = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Введите строку: ");
            str = scanner.nextLine();
            try {
                if (strMethods.isOnlySpaces(str))
                    throw new EmptyStrException("Строка состоит только из пробелов");
                return str;
            } catch (EmptyStrException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void num1() {
        String str = createStr();
        String str2 = strMethods.deleteStartEndAndSpaces(str);
        System.out.println(str);
        System.out.println(str2);
    }

    public void num2() {
        String str = createStr();
        try {
            if (strMethods.isOnlyOneWord(str)) {
                throw new OnlyOneWordException("Нужно минимум 2 слова");
            }
            str = strMethods.addSpacesBetweenWords(str);
            System.out.println(str);
        } catch (OnlyOneWordException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void num3() {
        String str = createStr();
        String string2 = strMethods.alignStrForWide(str);
        System.out.println(str);
        System.out.println(string2);
    }

    public void num4() {
        String str = createStr();
        str = strMethods.letterCaseToUp(str);
        System.out.println(str);
    }

    public void num5() {
        String str = createStr();
        String[] mass = strMethods.stringToMass(str);
        for (String s : mass) {
            System.out.println(s);
        }
    }

    public void num6() {
        String str = createStr();
        scanner = new Scanner(System.in);
        System.out.println("На сколько символов сдвинуть?(0-33)");
        String step = scanner.nextLine();
        if (step.isEmpty()) {
            System.out.println("Невозможное значение");
            return;
        }
        for (int i = 0; i < step.length(); i++) {
            if (step.charAt(i) < '0' || step.charAt(i) > '9') {
                return;
            }
        }
        int stepInt = Integer.parseInt(step);
        if (stepInt < 0 || stepInt > 33) {
            System.out.println("Число должно быть от 0 до 33");
            return;
        }
        str = strMethods.encrypt(str, stepInt);
        System.out.println("Зашифрованное сообщение: " + str);
        str = strMethods.decrypt(str, stepInt);
        System.out.println("Расшифрованное сообщение: " + str);
    }

    public void num7() {
        String str = createStr();
        str = strMethods.transliteration(str);
        System.out.println("Строка после транслитерации: " + str);
    }

    public void num8() {
        String str = createStr();
        double decimal = strMethods.hexadecimalToDecimal(str);
        System.out.println("Десятичное число = " + decimal);
    }

    public void num9() {
        String data;
        while (true) {
            System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
            data = scanner.nextLine().trim();
            if (data.length() != 10 || data.charAt(2) != '.' || data.charAt(5) != '.') {
                System.out.println("\u001B[31mНеверный формат\u001B[0m");
                continue;
            }
            int i;
            for (i = 0; i < data.length(); i++) {
                if (i != 2 && i != 5 && (data.charAt(i) < '0' || data.charAt(i) > '9')) {
                    System.out.println("В дате должны быть только цифры");
                    break;
                }
            }
            if (i < data.length()) {
                continue;
            }
            int day, month, year;
            day = Integer.parseInt(data.substring(0, 2));
            month = Integer.parseInt(data.substring(3, 5));
            year = Integer.parseInt(data.substring(6));
            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("\u001B[31mНедопустимый месяц или день\u001B[0m");
                continue;
            }
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (month == 2 && leapYear) daysInMonth[1] = 29;
            if (day > daysInMonth[month - 1]) {
                System.out.println("\u001B[31mВ этом месяце нет столько дней\u001B[0m");
                continue;
            }
            String dayStr = strMethods.getDayStr(day);
            String monthStr = strMethods.getMonthStr(month);
            String yearStr = strMethods.getYearStr(year);
            System.out.println(dayStr + " " + monthStr + " " + yearStr);
            return;
        }
    }

    public void num10() {
        String str = createStr();
        System.out.println("Количество символов: " + str.length());
        System.out.println("Количество слов: " + strMethods.countWords(str));
        strMethods.shortAndLongWords(str);
    }

    public void num11() {
        String str = createStr();
        str = strMethods.addLeftSpace(str);
        System.out.println(str);
    }

    public void num12() {
        String str = createStr();
        str = strMethods.spacesBetweenWordsUpTo1(str);
        System.out.println(str);
    }

    public void num13() {
        String str = createStr();
        strMethods.countVowelsConsonants(str);
    }

    public void num14() {
        scanner = new Scanner(System.in);
        int choice;
        String str = createStr();
        while (true) {
            System.out.println("\nВыберите способ выравнивания: ");
            System.out.println("1 - по левому краю\n2 - по правому краю\n3 - по центру\n4 - по ширине\n5 - выход");
            String input = scanner.nextLine().trim();
            if (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '5') {
                System.out.println("Некорректный ввод");
                continue;
            }
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    System.out.println(strMethods.deleteStartEndAndSpaces(str));
                    break;
                case 2:
                    System.out.println(strMethods.addLeftSpace(str));
                    break;
                case 3:
                    System.out.println(strMethods.alignStrForWide(str));
                    break;
                case 4:
                    try {
                        if (strMethods.isOnlyOneWord(str)) {
                            throw new OnlyOneWordException("Нужно минимум 2 слова");
                        }
                        System.out.println(strMethods.addSpacesBetweenWords(str));
                    } catch (OnlyOneWordException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}