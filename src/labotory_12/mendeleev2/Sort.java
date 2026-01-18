package labotory_12.mendeleev2;

import labotory_12.mendeleev1.Element;

import java.util.Scanner;

public class Sort {

    public Element[] choiceSort(Element[] elements) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки:\n1 - по номеру\n2 - по названию\n3 - по символу \n4 - по физическому состоянию\n5 - по атомному весу");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                elements = sort(elements, choice);
                System.out.println("Химические элементы отсортированы по их номерам");
                break;
            case 2:
                elements = sort(elements, choice);
                System.out.println("Химические элементы отсортированы по их названиям");
                break;
            case 3:
                elements = sort(elements, choice);
                System.out.println("Химические элементы отсортированы по их символам");
                break;
            case 4:
                elements = sort(elements, choice);
                System.out.println("Химические элементы отсортированы по их физическим состояниям");
                break;
            case 5:
                elements = sort(elements, choice);
                System.out.println("Химические элементы отсортированы по их весу");
                break;
            default:
                System.out.println("Нет такого варианта");
        }
        return elements;
    }

    Element[] sort(Element[] e, int choice) {
        boolean isSorted = false;
        Element buf;
        while (!isSorted) {
            isSorted = true;
            if (choice == 1) {
                for (int i = 0; i < e.length - 1; i++) {
                    if (e[i].getNumber() > e[i + 1].getNumber()) {
                        isSorted = false;
                        buf = e[i];
                        e[i] = e[i + 1];
                        e[i + 1] = buf;
                    }
                }
            } else if (choice == 2) {
                for (int i = 0; i < e.length - 1; i++) {
                    if (e[i].getName().compareToIgnoreCase(e[i + 1].getName()) > 0) {
                        isSorted = false;
                        buf = e[i];
                        e[i] = e[i + 1];
                        e[i + 1] = buf;
                    }
                }
            } else if (choice == 3) {
                for (int i = 0; i < e.length - 1; i++) {
                    if (e[i].getSymbol().compareToIgnoreCase(e[i + 1].getSymbol()) > 0) {
                        isSorted = false;
                        buf = e[i];
                        e[i] = e[i + 1];
                        e[i + 1] = buf;
                    }
                }
            } else if (choice == 4) {
                for (int i = 0; i < e.length - 1; i++) {
                    if (e[i].getPhysicalState().compareToIgnoreCase(e[i + 1].getPhysicalState()) > 0) {
                        isSorted = false;
                        buf = e[i];
                        e[i] = e[i + 1];
                        e[i + 1] = buf;
                    }
                }
            } else {
                for (int i = 0; i < e.length - 1; i++) {
                    if ((e[i].getAtomWeight()) > (e[i + 1].getAtomWeight())) {
                        isSorted = false;
                        buf = e[i];
                        e[i] = e[i + 1];
                        e[i + 1] = buf;
                    }
                }
            }
        }
        return e;
    }
}
