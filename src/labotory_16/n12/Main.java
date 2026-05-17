package labotory_16.n12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int choice;
        String str, name2;
        while (true) {
            String name = "C:\\Users\\Platon\\Desktop\\labs-raport2\\";
            pw.println("\n1 - Редактировать файл\n2 - Скопировать файл\n3 - Проверить файлы на совпадение\n4 - Очистить файл\n5 - Прочитать файл\n0 - Выход из программы");
            str = br.readLine();
            choice = Integer.parseInt(str);
            switch (choice) {
                case 1:
                    pw.println("Введите название файла для редактирования: ");
                    name += br.readLine();
                    name += ".txt";
                    try (RandomAccessFile raf = new RandomAccessFile(name, "rw")) {
                        pw.println("Введите строку, которую хотите добавить");
                        str = br.readLine();
                        raf.seek(0);
                        raf.write((str).getBytes());
                    } catch (FileNotFoundException exc) {
                        pw.println("Файл не найден");
                    } catch (IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    break;
                case 2:
                    name2 = name;
                    pw.println("Откуда вы хотите скопировать: ");
                    name += br.readLine();
                    name += ".txt";
                    pw.println("Куда вы хотите скопировать: ");
                    name2 += br.readLine();
                    name2 += ".txt";
                    try (RandomAccessFile raf1 = new RandomAccessFile(name, "r");
                         RandomAccessFile raf2 = new RandomAccessFile(name2, "rw")) {
                        raf2.setLength(0);
                        for (int i = 0; i < raf1.length(); i++) {
                            raf1.seek(i);
                            int buf = raf1.read();
                            raf2.seek(i);
                            raf2.write(buf);
                        }
                        pw.println("Копирование завершено");
                    } catch (IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    break;
                case 3:
                    name2 = name;
                    pw.println("Первый файл для сравнения: ");
                    name += br.readLine();
                    name += ".txt";
                    pw.println("Второй файл для сравнения: ");
                    name2 += br.readLine();
                    name2 += ".txt";
                    try (RandomAccessFile raf1 = new RandomAccessFile(name, "r");
                         RandomAccessFile raf2 = new RandomAccessFile(name2, "r")) {
                        boolean equal = true;
                        for (int i = 0; i < raf1.length(); i++) {
                            raf1.seek(i);
                            raf2.seek(i);
                            String str1 = raf1.readLine().toLowerCase();
                            String str2 = raf2.readLine().toLowerCase();
                            if (!str1.equals(str2)) {
                                equal = false;
                                pw.println("Место несовпадения - " + i + " -ый бит");
                                break;
                            }
                        }
                        if (equal) {
                            pw.println("Файлы совпадают");
                        } else {
                            pw.println("Файлы не совпадают");
                        }
                    } catch (FileNotFoundException e) {
                        pw.println("Ошибка: Один из файлов не найден.");
                    } catch (IOException e) {
                        pw.println("Ошибка при чтении файлов: " + e.getMessage());
                    }
                    break;
                case 4:
                    pw.println("Введите название файла, который вы хотите очистить: ");
                    name += br.readLine();
                    name += ".txt";
                    try (RandomAccessFile raf = new RandomAccessFile(name, "rw")) {
                        for (int i = 0; i < raf.length(); i++) {
                            raf.seek(i);
                            raf.write(' ');
                        }
                        raf.seek(0);
                        pw.println("Файл очищен");
                    } catch (FileNotFoundException exc) {
                        pw.println("Файл не найден");
                    } catch (IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    break;
                case 5:
                    pw.println("Введите название файла, который вы хотите прочитать: ");
                    name += br.readLine();
                    name += ".txt";
                    try (RandomAccessFile raf = new RandomAccessFile(name, "r")) {
                        raf.seek(0);
                        String line;
                        while ((line = raf.readLine()) != null) {
                            line = new String(line.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
                            pw.println(line);
                        }
                    } catch (FileNotFoundException exc) {
                        pw.println("Файл не найден");
                    } catch (IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
