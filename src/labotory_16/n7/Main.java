package labotory_16.n7;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        byte bt = 2;
        double d = 1023.56;
        boolean b = true;
        char ch = 'f';
        String str = "Строка";
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("test1.txt"))) {
            System.out.println("Записано целочисленное значение : " + i);
            output.writeInt(i);
            System.out.println("Записано байтовое значение : " + bt);
            output.write(bt);
            System.out.println("Записано значение с плавующей запятой: " + d);
            output.writeDouble(d);
            System.out.println("Записано логическое значение : " + b);
            output.writeBoolean(b);
            System.out.println("Записана арифметическая операция : " + (12.2 * 7.4));
            output.writeDouble(12.2 * 7.4);
            System.out.println("Записан символ: " + ch);
            output.writeChar(ch);
            System.out.println("Записана строка: " + str);
            output.writeBytes(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (DataInputStream input = new DataInputStream(new FileInputStream("test1.txt"))) {
            i = input.readInt();
            System.out.println("Чтение " + i);
            bt = input.readByte();
            System.out.println("Чтение " + bt);
            d = input.readDouble();
            System.out.println("Чтение " + d);
            b = input.readBoolean();
            System.out.println("Чтение " + b);
            d = input.readDouble();
            System.out.println("Чтение " + d);
            ch = input.readChar();
            System.out.println("Чтение " + ch);
//            str = input.read();
//            System.out.println("Чтение " + str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
