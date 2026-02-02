package labotory_11.vehicle;

import labotory_11.input.Input;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Input input = new Input();
            Vehicle vehicle = Create.create(input);
            vehicle.menu(input);
        }
    }
}