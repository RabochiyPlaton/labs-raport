package labotory_16.n11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Data {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out, true);

    public void charPW() {
        char ch;
        String str;
        try {
            str = br.readLine();
            if (str.isEmpty()) {
                throw new VoidStr();
            } else {
                ch = str.charAt(0);
                pw.println(ch);
            }
        } catch (VoidStr exc) {
            System.out.print(exc.getMessage());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void doublePW() {
        double d;
        String str;
        try {
            str = br.readLine();
            if (str.isEmpty()) {
                throw new VoidStr();
            } else {
                d = Double.parseDouble(str);
                pw.println(d);
            }
        } catch (VoidStr | IOException exc) {
            System.out.println(exc.getMessage());
        }
        catch (NumberFormatException exc) {
            System.out.println("Вы ввели неправильный тип данных");
        }
    }

    public void floatPW() {
        float f;
        String str;
        try {
            str = br.readLine();
            if (str.isEmpty()) {
                throw new VoidStr();
            } else {
                f = Float.parseFloat(str);
                pw.println(f);
            }
        } catch (VoidStr | IOException exc) {
            System.out.println(exc.getMessage());
        }
        catch (NumberFormatException exc) {
            System.out.println("Вы ввели неправильный тип данных");
        }
    }

    public void intPW() {
        int i;
        String str;
        try {
            str = br.readLine();
            if (str.isEmpty()) {
                throw new VoidStr();
            } else {
                i = Integer.parseInt(str);
                pw.println(i);
            }
        } catch (VoidStr | IOException exc) {
            System.out.println(exc.getMessage());
        }
        catch (NumberFormatException exc) {
            System.out.println("Вы ввели неправильный тип данных");
        }
    }

    public void shortPW() {
        short sh;
        String str;
        try {
            str = br.readLine();
            if (str.isEmpty()) {
                throw new VoidStr();
            } else {
                sh = Short.parseShort(str);
                pw.println(sh);
            }
        } catch (VoidStr | IOException exc) {
            System.out.println(exc.getMessage());
        }
        catch (NumberFormatException exc) {
            System.out.println("Вы ввели неправильный тип данных");
        }
    }

    public void bytePW() {
        byte b;
        String str;
        try {
            str = br.readLine();
            if (str.isEmpty()) {
                throw new VoidStr();
            } else {
                b = Byte.parseByte(str);
                pw.println(b);
            }
        } catch (VoidStr | IOException exc) {
            System.out.println(exc.getMessage());
        }
        catch (NumberFormatException exc) {
            System.out.println("Вы ввели неправильный тип данных");
        }
    }
}
