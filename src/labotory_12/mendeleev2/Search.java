package labotory_12.mendeleev2;

import labotory_12.mendeleev1.Element;

public class Search {
    public void search(Element[] elements, String arg) {
        System.out.println("Результаты поиска:");
        boolean found = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) continue;
            if (String.valueOf(elements[i].getNumber()).equals(arg) ||
                    elements[i].getName().equalsIgnoreCase(arg) ||
                    elements[i].getSymbol().equalsIgnoreCase(arg) ||
                    elements[i].getPhysicalState().equalsIgnoreCase(arg) ||
                    String.valueOf(elements[i].getAtomWeight()).equals(arg)) {

                elements[i].show();
                found = true;
            }
        }
        if (!found) System.out.println("\nНичего не найдено.\n");
    }
}
