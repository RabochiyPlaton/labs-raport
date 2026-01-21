package labotory_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nums nums = new Nums();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("\nВыберите задание: 1 - 16\n17 для выхода");
            String input = scanner.nextLine();
            if (input.length() == 1 && input.charAt(0) >= '0' && input.charAt(0) <= '9') {
                choice = input.charAt(0) - '0';
            } else {
                System.out.println("Введите одну цифру");
            }
            switch (choice) {
                case 1:
                    System.out.println("✦  Задание 1   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Удалить все ведущие и замыкающие пробелы в строке");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num1();
                    break;
                case 2:
                    System.out.println("✦  Задание 2   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Дополнить строку пробелами между словами до указанной ширины");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num2();
                    break;
                case 3:
                    System.out.println("✦  Задание 3   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Выровнять строку посередине до указанной ширины, дополнив слева и справа пробелами");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num3();
                    break;
                case 4:
                    System.out.println("✦  Задание 4   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Перевести все слова в предложении в форму, в которой они\n" +
                            "начинаются с большой буквы");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num4();
                    break;
                case 5:
                    System.out.println("✦  Задание 5   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Вывести все слова из заданной строки в отдельной строке (разобрать предложение по словам)");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num5();
                    break;
                case 6:
                    System.out.println("✦  Задание 6   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Зашифровать строку, сдвинув символы на указанное количество позиций в алфавите.\n" +
                            "Затем расшифровать. Вывести зашифрованный и расшифрованный вариант");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num6();
                    break;
                case 7:
                    System.out.println("✦  Задание 7   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Выполнить транслитерацию строки, заменив каждый символ на символ строку из символов на латинице");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num7();
                    break;
                case 8:
                    System.out.println("✦  Задание 8   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Ввести шестнадцатиричное число (0-9,A-F) и вывести его десятичное\n" +
                            "представление");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num8();
                    break;
                case 9:
                    System.out.println("✦  Задание 9   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Ввести дату в формате ДДММГГГГ и вывести отдельно дату, месяц и\n" +
                            "год");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num9();
                    break;
                case 10:
                    System.out.println("✦  Задание 10   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Посчитать количество символов и слов во введенном предложении, а также вывести самое короткое и самое длинное слова");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num10();
                    break;
                case 11:
                    System.out.println("✦  Задание 11   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Дополнить строку слева пробелами до указанной ширины");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num11();
                    break;
                case 12:
                    System.out.println("✦  Задание 12   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Сократить все двойные, тройные (и т.д.) пробелы между словами в строке до 1 пробела");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num12();
                    break;
                case 13:
                    System.out.println("✦  Задание 13   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Подсчитать количество гласных и согласных в указанной строке");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num13();
                    break;
                case 14:
                    System.out.println("✦  Задание 14   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Создать программу выравнивания текста по запросу пользователя: 1. по левому краю; 2. по правому краю; 3. по центру; 4. по ширине");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    nums.num14();
                    break;
                case 15:
                    System.out.println("✦  Задание 15   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Создать программу выравнивания текста по запросу пользователя: 1. по левому краю; 2. по правому краю; 3. по центру; 4. по ширине");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    break;
                case 16:
                    System.out.println("✦  Задание 16   ✦");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    System.out.println("Создать программу выравнивания текста по запросу пользователя: 1. по левому краю; 2. по правому краю; 3. по центру; 4. по ширине");
                    System.out.println("━━━━━━━━━━━━━━━━━");
                    break;
                case 17:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
