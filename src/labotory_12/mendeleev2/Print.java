package labotory_12.mendeleev2;

import labotory_12.mendeleev1.Element;

public class Print {
    public void print(Element[] elements) {
        System.out.println("Таблица Менделеева построчно:");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null &&
                    (elements[i].getPhysicalState().equals("газ") ||
                            elements[i].getPhysicalState().equals("твёрдый") ||
                            elements[i].getPhysicalState().equals("жидкий") ||
                            elements[i].getPhysicalState().equals("неизвестный"))) {
                elements[i].show();
            }
        }
    }
}
