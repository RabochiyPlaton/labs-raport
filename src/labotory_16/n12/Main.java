package labotory_16.n12;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int choice;
        String str;
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
                    try (RandomAccessFile raf = new RandomAccessFile(name,"rw")){
                        pw.println("Введите строку, которую хотите добавить в конец файла");
                        str = br.readLine();
                        raf.seek(raf.length());
                        raf.write(("\n"+str).getBytes());
                    } catch (FileNotFoundException exc) {
                        pw.println("Файл не найден");
                    } catch (IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    pw.println("Введите название файла, который вы хотите очистить: ");
                    name += br.readLine();
                    name += ".txt";
                    try (RandomAccessFile raf = new RandomAccessFile(name,"rw")){
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
                    try (RandomAccessFile raf = new RandomAccessFile(name,"r")){
                        pw.println(raf.readLine());
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
