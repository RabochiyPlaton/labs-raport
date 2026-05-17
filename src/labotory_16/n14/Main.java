package labotory_16.n14;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String name = "C:\\Users\\Platon\\Desktop\\labs-raport2\\";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String str,name1;
        while (true) {
            pw.println("\n1 - Записать файл\n2 - Прочитать файл\n0 - Выход");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    pw.println("Введите название файла для записи: ");
                    name1 = name + br.readLine() + ".txt";
                    try (PrintWriter pw2 = new PrintWriter(new FileWriter(name1))) {
                        pw.println("Введите данные (год_значение)/(значение_год), для выхода 'stop':");
                        while (true) {
                            str = br.readLine();
                            if (str.equals("stop")) break;
                            pw2.write(str + "\n");
                        }
                    } catch (IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    break;
                case 2:
                    pw.println("Введите название файла для чтения: ");
                    name1 = name;
                    name1 += br.readLine();
                    name1 += ".txt";
                    double max = Double.MIN_VALUE;
                    double min = Double.MAX_VALUE;
                    int maxYear = 0, minYear = 0;
                    double sum = 0;
                    int count = 0;
                    try (BufferedReader br2 = new BufferedReader(new FileReader(name1))) {
                        while ((str = br2.readLine()) != null) {
                            String[] parts = str.trim().split(" ");
                            if (parts.length != 2) continue;
                            int year = Integer.parseInt(parts[0]);
                            double x = Double.parseDouble(parts[1]);
                            if (x > max) {
                                max = x;
                                maxYear = year;
                            }
                            if (x < min) {
                                min = x;
                                minYear = year;
                            }
                            sum += x;
                            count++;
                        }
                    } catch (NumberFormatException | IOException exc) {
                        pw.println(exc.getMessage());
                    }
                    pw.println("\nПоказатель среднего доходов населения имел максимальное значение в " + maxYear + " году и составл: " + max + " рублей\n" +
                            "минмальное значение в " + minYear + " году и составил: " + min + " рублей");
                    pw.println("Среднее значение за весь период: " + sum / count + " рублей");
                    break;
                case 0:
                    return;
            }
        }
    }
}
