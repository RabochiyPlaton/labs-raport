package labotory_16.n1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Введите несколько символов");
        System.in.read(data);
        System.out.println("Вы ввели: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i] + "\t");
        }
    }
}

