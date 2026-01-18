package labotory_12.mendeleev2;

import labotory_12.mendeleev1.Element;

public class ShowTable {

    int[] getPeriod(int x) {
        switch (x) {
            case 0:
                return new int[]{0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
            case 1:
                return new int[]{2, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 5, 6, 7, 8, 9};
            case 2:
                return new int[]{10, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, 13, 14, 15, 16, 17};
            case 3:
                return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
            case 4:
                return new int[]{36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};
            case 5:
                return new int[]{54, 55, -1, -1, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84};
            case 6:
                return new int[]{86, 87, -1, -1, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116};
            case 7:
                return new int[]{-1, -1, -1, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70};
            case 8:
                return new int[]{-1, -1, -1, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102};
        }
        return new int[]{};
    }

    public void table(Element[] elements) {
        String color;
        String[] s = new String[elements.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = " ";
            for (int j = 0; j < elements.length; j++) {
                if (elements[j] != null && elements[j].getNumber() == ((i + 1))) {
                    s[i] = elements[j].getSymbol();
                    break;
                }
            }
        }
        String resetColor = "\u001B[0m";
        String borderHead = "╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗";
        String borderBody = "╠═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╬═════╣";
        String borderFoot = "╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝";
        System.out.println(borderHead);
        int[] mass;
        for (int i = 0; i < 9; i++) {
            mass = getPeriod(i);
            for (int j = 0; j < 18; j++) {
                if (mass[j] > -1) {
                    color = choiceColor(mass[j] + 1);
                    System.out.printf("║  " + color + "%-3s" + resetColor, s[mass[j]]);
                } else System.out.print("║     ");
            }
            System.out.print("║");
            if (i < 8) {
                System.out.println();
                System.out.println(borderBody);
            }
        }
        System.out.println("\n" + borderFoot);
    }

    public String choiceColor(int num) {
        if ((num == 1) || (num == 2) ||
                (num == 7) || (num == 8) ||
                (num == 9) || (num == 10) ||
                (num == 17) || (num == 18) ||
                (num == 36) || (num == 54) ||
                (num == 86) || (num == 118)) {
            return "\u001B[32m";
        } else if ((num == 35) || (num == 80)) {
            return "\u001B[34m";
        } else if (num >= 104 && num <= 118) {
            return "\u001B[37m";
        } else if (num >= 3 && num <= 103) {
            return "\u001B[31m";
        } else {
            return "\u001B[37m";
        }
    }

}
