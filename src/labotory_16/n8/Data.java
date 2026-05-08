package labotory_16.n8;

import labotory_16.Input;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {

    Input input = new Input();
    Scanner scanner = new Scanner(System.in);

    public void charData() {
        int size = input.input("размер массива");
        char[] data = new char[size];
        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "] = ");
            try {
                data[i] = scanner.nextLine().charAt(0);
            } catch (InputMismatchException exc) {
                System.out.println("Неправильный тип данных");
            }
        }
        char d;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            System.out.println("Значения: ");
            System.out.println("Четные элементы");
            for (int i = 0; i < data.length; i++) {
                if (data[i] % 2 == 0) {
                    raf.seek(i);
                    d = raf.readLine().charAt(0);
                    System.out.print(d + "\t");
                }
            }
            System.out.println();
            System.out.println("Нечетные элементы");
            for (int i = 0; i < data.length; i++) {
                if (data[i] % 2 != 0) {
                    raf.seek(i);
                    d = raf.readLine().charAt(0);
                    System.out.print(d + "\t");
                }
            }
        } catch (IIOException ex) {
            System.out.println("I/O Ошибка: " + ex);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void doubleData() {
        int size = input.input("размер массива");
        double[] data = new double[size];
        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "] = ");
            data[i] = scanner.nextDouble();
        }
        double d;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            System.out.println("Значения: ");
            System.out.println("Четные элементы");
            for (int i = 0; i < data.length; i++) {
                if (data[i] % 2 == 0) {
                    raf.seek(8 * i);
                    d = raf.readDouble();
                    System.out.print(d + "\t");
                }
            }
            System.out.println();
            System.out.println("Нечетные элементы");
            for (int i = 0; i < data.length; i++) {
                if (data[i] % 2 != 0) {
                    raf.seek(8 * i);
                    d = raf.readDouble();
                    System.out.print(d + "\t");
                }
            }
        } catch (IIOException ex) {
            System.out.println("I/O Ошибка: " + ex);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void floatData() {
        int size = input.input("размер массива");
        float[] data = new float[size];
        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "] = ");
            data[i] = scanner.nextFloat();
        }
        float d;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeFloat(data[i]);
            }
            System.out.println("Значения: ");
            System.out.println("Четные элементы");
            for (int i = 0; i < data.length; i++) {
                data[i] = Math.round(data[i]);
                if (data[i] % 2 == 0) {
                    raf.seek(4 * i);
                    d = raf.readFloat();
                    System.out.print(d + "\t");
                }
            }
            System.out.println();
            System.out.println("Нечетные элементы");
            for (int i = 0; i < data.length; i++) {
                data[i] = Math.round(data[i]);
                if (data[i] % 2 != 0) {
                    raf.seek(4 * i);
                    d = raf.readFloat();
                    System.out.print(d + "\t");
                }
            }
        } catch (IIOException ex) {
            System.out.println("I/O Ошибка: " + ex);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void intData() {
        int size = input.input("размер массива");
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "] = ");
            data[i] = scanner.nextInt();
        }
        int i1;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeInt(data[i]);
            }
            System.out.println("Значения: ");
            System.out.println("Четные элементы");
            for (int i = 0; i < data.length; i++) {
                if (i % 2 == 0) {
                    raf.seek(4 * i);
                    i1 = raf.readInt();
                    System.out.print(i1 + "\t");
                }
            }
            System.out.println();
            System.out.println("Нечетные элементы");
            for (int i = 0; i < data.length; i++) {
                if (i % 2 != 0) {
                    raf.seek(4 * i);
                    i1 = raf.readInt();
                    System.out.print(i1 + "\t");
                }
            }
        } catch (IIOException ex) {
            System.out.println("I/O Ошибка: " + ex);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void shortData() {
        int size = input.input("размер массива");
        short[] data = new short[size];
        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "] = ");
            data[i] = scanner.nextShort();
        }
        short i1;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeShort(data[i]);
            }
            System.out.println("Значения: ");
            System.out.println("Четные элементы");
            for (int i = 0; i < data.length; i++) {
                if (i % 2 == 0) {
                    raf.seek(2 * i);
                    i1 = raf.readShort();
                    System.out.print(i1 + "\t");
                }
            }
            System.out.println();
            System.out.println("Нечетные элементы");
            for (int i = 0; i < data.length; i++) {
                if (i % 2 != 0) {
                    raf.seek(2 * i);
                    i1 = raf.readShort();
                    System.out.print(i1 + "\t");
                }
            }
        } catch (IIOException ex) {
            System.out.println("I/O Ошибка: " + ex);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void byteData() {
        byte[] data = {19, 10, 123, 3, 87, 74};
        byte i1;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeByte(data[i]);
            }
            System.out.println("Значения: ");
            System.out.println("Четные элементы");
            for (int i = 0; i < data.length; i++) {
                if (i % 2 == 0) {
                    raf.seek(i);
                    i1 = raf.readByte();
                    System.out.print(i1 + "\t");
                }
            }
            System.out.println();
            System.out.println("Нечетные элементы");
            for (int i = 0; i < data.length; i++) {
                i1 = data[i];
                if (i1 % 2 != 0) {
                    raf.seek(i);
                    i1 = raf.readByte();
                    System.out.print(i1 + "\t");
                }
            }
        } catch (IIOException ex) {
            System.out.println("I/O Ошибка: " + ex);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
