package labotory_12.mendeleev2;

import labotory_12.mendeleev1.Element;

import java.util.Scanner;

public class Delete {

    public Element[] delete(Element[] e) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой элемент вы хотите удалить?(1-118)");
        int answer = scanner.nextInt() - 1;
        if (answer < 0 || answer > 117) System.out.println("Вы вышли за диапазон.");
        else if (e[answer] == null) System.out.println("Элемент и так пуст.");
        else {
            System.out.println("Элемент №" + (answer + 1) + " удален.");
            e[answer] = null;
        }
        return e;
    }
}
