package labotory_12.mendeleev2;

import labotory_12.mendeleev1.Element;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Element[] elements = new Element[118];
        int filled = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Таблица менделеева ===");
        while (true) {
            System.out.println("1 - ввести элемент\n2 - найти элемент\n3 - заполнить всю таблицу автоматически" +
                    "\n4 - сортировка элементов\n5 - удалить элемент\n6 - вывод построчно\n7 - вывод таблицы\n8 - выход из программы");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("===Ввод===");
                    boolean next = true;
                    while (next) {
                        System.out.println("Количество элементов на данный момент: " + filled);
                        char answer = 'n';
                        System.out.println("Желаете добавить элемент?(y/n)");
                        answer = scanner.nextLine().charAt(0);
                        if (answer == 'y' || answer == 'Y' || answer == 'н' || answer == 'Н') {
                            System.out.println("Пример ввода: <<1 Водород Н газ 1.008>>");
                            String buf = scanner.nextLine().trim().replace(',', '.');
                            String[] elementArguments = buf.split(" ");
                            if (elementArguments.length == 5) {
                                elements[filled] = new Element(Integer.parseInt(elementArguments[0]), elementArguments[1], elementArguments[2],
                                        elementArguments[3], Double.parseDouble(elementArguments[4]));
                                filled++;
                            } else System.out.println("Неправильный ввод, повторите попытку");
                        } else next = false;
                    }
                    break;
                case 2:
                    System.out.println("===Поиск===");
                    System.out.println("Для поиска элемнт(а/ов) введите один из аргументов (номер, имя, агрегатное состояние, символ, атомный вес): ");
                    String argument = scanner.nextLine();
                    Search search = new Search();
                    search.search(elements, argument);
                    break;
                case 3:
                    System.out.println("===Таблица заполнена автоматически===");
                    filled = 118;
                    AutomaticTable automaticTable = new AutomaticTable();
                    elements = automaticTable.auto();
                    break;
                case 4:
                    System.out.println("===Сортировка===");
                    Sort sort = new Sort();
                    elements = sort.choiceSort(elements);
                    break;
                case 5:
                    System.out.println("===Удаление элемента===");
                    Delete delete = new Delete();
                    elements = delete.delete(elements);
                    break;
                case 6:
                    System.out.println("===В данной таблице " + filled + "/118 элементов===");
                    Print print = new Print();
                    print.print(elements);
                    break;
                case 7:
                    System.out.println("===В данной таблице " + filled + "/118 элементов===");
                    ShowTable showTable = new ShowTable();
                    showTable.table(elements);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
                    break;
            }
        }
    }
}
