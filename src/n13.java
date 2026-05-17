import java.io.*;

public class n13 {
    public static void main(String[] args) throws FileNotFoundException {
        String name = "C:\\Users\\Platon\\Desktop\\labs-raport2\\13.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x;
        int sum = 0;
        try (RandomAccessFile raf = new RandomAccessFile(name, "rw")) {
            raf.setLength(0);
            for (int i = 0; i < 13; i++) {
                x = Integer.parseInt(bufferedReader.readLine());
                raf.write((x+"\n").getBytes());
                if (x<0) {
                    sum += -x;
                }
            }
            raf.write(("Сумма модулей отрицательных элементов = " + sum).getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Сумма модулей отрицательных элементов = " + sum);
    }
}
