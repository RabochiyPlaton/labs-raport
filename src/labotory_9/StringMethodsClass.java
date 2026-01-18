package labotory_9;

import java.util.Scanner;

public class StringMethodsClass implements StringMethods {

    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean isOnlySpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') return false;
        }
        return true;
    }

    @Override
    public boolean isOnlyOneWord(String str) {
        int wordCount;
        wordCount = countWords(str);
        return wordCount < 2;
    }

    @Override
    public int countWords(String str) {
        str = prepareString(str);
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
            else if (str.charAt(str.length() - 1) == '-' || str.charAt(0) == '-' || (str.charAt(i) == '-' && str.charAt(i - 1) == ' ' && str.charAt(i + 1) == ' '))
                count--;
        }
        return count;
    }

    @Override
    public void countVowelsConsonants(String str) {
        char[] letters = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'б', 'в', 'г', 'д', 'ж', 'з',
                'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        int countVowels = 0;
        int countConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (str.charAt(i) == letters[j] && j < 10) countVowels++;
                else if (str.charAt(i) == letters[j] && j > 9) countConsonants++;
            }
        }
        System.out.print("В строке ");
        if (countVowels == 1) System.out.print(countVowels + " гласная и ");
        else System.out.print(countVowels + " гласных и ");
        if (countConsonants == 1) System.out.print(countConsonants + " согласная");
        else System.out.print(countConsonants + " согласных");
    }

    @Override
    public void shortAndLongWords(String str) {
        String[] strMass = stringToMass(str);
        int min = strMass[0].length();
        int max = strMass[0].length();
        for (int i = 0; i < strMass.length; i++) {
            if (strMass[i].length() < min) min = strMass[i].length();
            else if (strMass[i].length() > max) max = strMass[i].length();
        }
        System.out.println("Самые короткие слова:");
        for (int i = 0; i < strMass.length; i++)
            if (strMass[i].length() == min) System.out.println(strMass[i]);
        System.out.println("Самые длинные слова:");
        for (int i = 0; i < strMass.length; i++)
            if (strMass[i].length() == max) System.out.println(strMass[i]);
    }

    @Override
    public String deleteStartEndAndSpaces(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            char buf = str.charAt(i);
            if (buf == ' ') start++;
            else break;
        }
        for (int i = str.length() - 1; i > 0; i--) {
            char buf = str.charAt(i);
            if (buf == ' ') end++;
            else break;
        }
        return str.substring(start, str.length() - end);
    }

    @Override
    public String addSpacesBetweenWords(String str) {
        str = deleteStartEndAndSpaces(str);
        String[] mass = stringToMass(str);
        String str2 = "";
        System.out.println("Длина текущей строки = " + str.length() + ", введите новую ширину, больше старой:");
        int wide = scanner.nextInt();
        if (wide < str.length()) {
            System.out.println("\u001B[31mШирина меньше изначальной\u001B[0m");
            return "";
        }
        int charsLength = 0;
        for (int i = 0; i < mass.length; i++) {
            charsLength += mass[i].length();
        }
        int spaces = (wide - charsLength) / (mass.length - 1);
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < spaces; j++) {
                if (i < mass.length - 1) {
                    mass[i] += " ";
                }
            }
            str2 += mass[i];
        }
        return str2;
    }

    @Override
    public String spacesBetweenWordsUpTo1(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i + 1 < str.length() && str.charAt(i + 1) == ' ') continue;
            str2 += str.charAt(i);
        }
        return str2;
    }

    @Override
    public String addLeftSpace(String str) {
        System.out.println("Длина текущей строки = " + str.length() + ", введите новую ширину, больше старой:");
        int wide = scanner.nextInt();
        if (wide < str.length()) {
            System.out.println("\u001B[31mШирина меньше изначальной\u001B[0m");
            return "";
        }
        for (int i = 0; i < (wide - str.length()); i++) {
            str = " " + str;
        }
        return str;
    }

    @Override
    public String alignStrForWide(String str) {
        System.out.println("Длина текущей строки = " + str.length() + ", введите новую ширину, больше старой:");
        int wide = scanner.nextInt();
        if (wide < str.length()) {
            System.out.println("\u001B[31mШирина меньше изначальной\u001B[0m");
            return "";
        }
        int addLength = (wide - str.length()) / 2;
        for (int i = 0; i < addLength; i++) {
            str = " " + str + " ";
        }
        return str;
    }

    @Override
    public String letterCaseToUp(String str) {
        String big = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧШЩЬЫЪЭЮЯABCDEFGHIKLMNOPURSTVWzYZ";
        String small = "абвгдеёжзийклмнопрстуфхчшщьыъэюяabcdefghiklmnopurstvwxyz";
        String str2 = "";
        char buf;
        for (int i = 0; i < str.length(); i++) {
            buf = str.charAt(i);
            if ((i == 0 || str.charAt(i - 1) == ' ')) {
                for (int j = 0; j < small.length(); j++) {
                    if ((str.charAt(i) == small.charAt(j))) {
                        str2 += big.charAt(j);
                        break;
                    }
                }
            } else str2 += buf;
        }
        return str2;
    }

    @Override
    public String prepareString(String str) {
        str = deleteStartEndAndSpaces(str);
        str = spacesBetweenWordsUpTo1(str);
        return str;
    }

    @Override
    public String[] stringToMass(String str) {
        int size = countWords(str);
        str = prepareString(str);
        String[] mass = new String[size];
        int count = 0;
        int finish;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                finish = i;
                mass[count] = "";
                mass[count++] = str.substring(start, finish);
                start = finish + 1;
            }
        }
        mass[size - 1] = str.substring(start);
        return mass;
    }

    @Override
    public double hexadecimalToDecimal(String str) {
        double sum = 0;
        String str2 = "0123456789ABCDEF";
        char buf;
        for (int i = str.length(); i > 0; i--) {
            buf = str.charAt(i - 1);
            sum += str2.indexOf(buf) * Math.pow(16, str.length() - i);
        }
        return sum;
    }

    @Override
    public String encrypt(String str, int step) {
        String mass = "абвгдеёжзийклмнопрстуфхчшщьыъэюяabcdefghiklmnopurstvwxyzАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧШЩЬЫЪЭЮЯABCDEFGHIKLMNOPURSTVWXYZ";
        String str2 = "";
        step = step % mass.length();
        char buf;
        for (int i = 0; i < str.length(); i++) {
            buf = str.charAt(i);
            str2 += mass.charAt((((mass.indexOf(buf)) + step)) % mass.length());
        }
        return str2;
    }

    @Override
    public String decrypt(String str, int step) {
        String mass = "абвгдеёжзийклмнопрстуфхчшщьыъэюяabcdefghiklmnopurstvwxyzАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧШЩЬЫЪЭЮЯABCDEFGHIKLMNOPURSTVWXYZ";
        String str2 = "";
        step = step % mass.length();
        char buf;
        for (int i = 0; i < str.length(); i++) {
            buf = str.charAt(i);
            str2 += mass.charAt((mass.length() + ((mass.indexOf(buf)) - step)) % mass.length());
        }
        return str2;
    }

    @Override
    public String transliteration(String str) {
        boolean found = false;
        str = prepareString(str);
        String str2 = "";
        char[] rus = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
                'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ы', 'Э', 'Ю', 'Я',
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] lat = {"A", "B", "V", "G", "D", "E", "YO", "ZH", "Z", "I", "Y", "K", "L", "M",
                "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SCH", "I",
                "E", "YU", "YA", "a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i", "y", "k", "l", "m",
                "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "sch", "", "y", "", "e", "yu", "ya"};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < rus.length; j++) {
                if (str.charAt(i) == rus[j]) {
                    str2 += lat[j];
                    found = true;
                }
            }
            if (!found) str2 += str.charAt(i);
            else found = false;
        }
        return str2;
    }

    @Override
    public String getDayStr(int day) {
        String[] days = {"первое", "второе", "третье", "четвертое", "пятое", "шестое", "седьмое",
                "восьмое", "девятое", "десятое", "одиннадцатое", "двенадцатое", "тринадцатое",
                "четырнадцатое", "пятнадцатое", "шестнадцатое", "семнадцатое", "восемнадцатое",
                "девятнадцатое", "двадцатое", "двадцать первое", "двадцать второе", "двадцать третье",
                "двадцать четвертое", "двадцать пятое", "двадцать шестое", "двадцать седьмое",
                "двадцать восьмое", "двадцать девятое", "тридцатое", "тридцать первое"};
        return days[day - 1];
    }

    @Override
    public String getMonthStr(int month) {
        String[] months = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября",
                "ноября", "декабря"};
        return months[month - 1];
    }

    @Override
    public String getYearStr(int year) {
        if (year < 1000 || year > 2999) return year + " года";
        String[] hundreds = {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ",
                "семьсот ", "восемьсот ", "девятьсот "};
        String[] tens = {"", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "воемьдесят ", "девяносто "};
        String[] tensWhen0Units = {"двадцатого", "тридцатого", "сорокового", "пятидесятого", "шестидесятого",
                "семидесятого", "восьмидесятого", "девяностого"};
        String[] hundredsWhenLastTwoZero = {"сотого", "двухсотого", "трехстого", "четырехсотого", "пятисотого",
                "шестисотого", "семисотого", "восьмисотого", "девятьстого"};
        String[] units = {"первого", "второго", "третьего", "четвертого", "пятого", "шестого", "седьмого",
                "восьмого", "девятого", "десятого", "одиннадцатого", "двенадцатого", "тринадцатого",
                "четырнадцатого", "пятнадцатого", "шестнадцатого", "семнадцатого", "восемнадцатого",
                "девятнадцатого"};
        String yearStr = "";
        if (year / 1000 == 2) yearStr += "две ";
        yearStr += "тысяча ";
        if (year % 1000 == 0) {
            if (year / 1000 == 2) return "двух тысячного года";
            else return "однотысячного года";
        } else if (year % 100 == 0) {
            return yearStr += hundredsWhenLastTwoZero[year % 1000 / 100 - 1] + " года";
        }
        yearStr += hundreds[year % 1000 / 100];
        if (year % 10 == 0) yearStr += tensWhen0Units[year % 100 / 10 - 2];
        else {
            if (year % 100 / 10 != 1) {
                if (year % 100 / 10 != 0) yearStr += tens[year % 100 / 10 - 1];
                else if (year % 10 > 0) yearStr += tens[year % 100 / 10];
                yearStr += units[year % 10 - 1];
            } else yearStr += units[year % 10 + 9];
        }
        return yearStr + " года";
    }
}
