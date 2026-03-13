package labotory_14.figures;

import labotory_11.figures.ChooseFigure;
import labotory_11.input.Input;

public class Main {
    public static void main(String[] args) {
        Input inp = new Input();
        ChooseFigure cf = new ChooseFigure();
        double[] sides = new double[4];
        while (true) {
            int count = 0;
            int choice;
            while (count < sides.length) {
                System.out.println("Хотите ввести сторону?(1 - да, 2 - нет)");
                choice = (int) inp.inputPositiveNumber();
                if (choice == 1) {
                    System.out.println("Введите " + (count + 1) + "-ую сторону:");
                    sides[count] = inp.inputPositiveNumber();
                    if (sides[count] != 0) count++;
                } else break;
            }
            System.out.println("Выберите тип фигуры:");
            switch (count) {
                case 1:
                    cf.chooseFigure(sides[0]);
                    break;
                case 2:
                    cf.chooseFigure(sides[0], sides[1]);
                    break;
                case 3:
                    cf.chooseFigure(sides[0], sides[1], sides[2]);
                    break;
                case 4:
                    cf.chooseFigure(sides[0], sides[1], sides[2], sides[3]);
                    break;
                default:
                    return;
            }
        }
    }
}