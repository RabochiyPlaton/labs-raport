package labotory_12.mendeleev1;

public class Element {

    private final int number;
    private final String name;
    private final String symbol;
    private final String physicalState;
    private final double atomWeight;

    public Element(int num, String n, String s, String pS, double aW) {
        number = num;
        name = n;
        symbol = s;
        physicalState = pS.toLowerCase();
        atomWeight = aW;
    }

    public String getName() {
        return name;
    }

    public double getAtomWeight() {
        return atomWeight;
    }

    public int getNumber() {
        return number;
    }

    public String getPhysicalState() {
        return physicalState;
    }

    public String getSymbol() {
        return symbol;
    }

    public void show() {
        String stateColor;
        switch (physicalState) {
            case "газ":
                stateColor = "\u001B[32m";
                break;
            case "жидкий":
                stateColor = "\u001B[34m";
                break;
            case "твёрдый":
                stateColor = "\u001B[33m";
                break;
            default:
                stateColor = "\u001B[37m";
        }
        System.out.printf("║ %-34s ║\n", "ЭЛЕМЕНТ #" + number);
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ %-15s %-18s ║\n", "Название:", name);
        System.out.printf("║ %-15s %-18s ║\n", "Символ:", symbol);
        System.out.printf("║ %-15s " + stateColor + "%-18s\u001B[0m ║\n", "Состояние:", physicalState);
        System.out.printf("║ %-15s %-18.4f ║\n", "Атомная масса:", atomWeight);
        System.out.println("╚════════════════════════════════════╝\n");
        System.out.print("\u001B[0m");
    }
}
