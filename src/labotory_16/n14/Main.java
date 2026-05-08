package labotory_16.n14;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String name = "C:\\Users\\Platon\\Desktop\\labs-raport2\\экономическиеПоказатели.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String str;
        try (PrintWriter pw2 = new PrintWriter(new FileWriter(name))) {
            pw.println("Введите данные (год значение), для выхода 'stop':");
            while (true) {
                str = br.readLine();
                if (str.equals("stop")) break;
                pw2.write(str + "\n");
            }
        } catch (IOException exc) {
            pw.println(exc.getMessage());
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int maxYear = 0, minYear = 0;
        double sum = 0;
        int count = 0;
        try (BufferedReader br2 = new BufferedReader(new FileReader(name))) {
            while ((str = br2.readLine()) != null) {
                String[] parts = str.split(" ");
                if (parts.length < 2) continue;
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
        pw.println("\nЭкономические показатели");
        pw.println("Максимум: " + max + " был в " + maxYear + " году.");
        pw.println("Минимум: " + min + " был в " + minYear + " году.");
        pw.println("Среднее значение за весь период: " + (sum / count));
    }
}
