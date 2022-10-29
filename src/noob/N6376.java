package noob;

import java.io.IOException;

public class N6376 {
    public static void main(String[] args) throws IOException {
        System.out.println("n e");
        System.out.println("- -----------");
        System.out.println("0 1");
        System.out.println("1 2");
        System.out.println("2 2.5");
        double sum = 2.5;
        double fac = 2;
        double i = 2;
        while (fac < 9) {
            fac++;
            i *= fac;
            sum += 1 / i;
            System.out.printf("%.0f %.9f\n", fac, sum);
        }
    }
}
