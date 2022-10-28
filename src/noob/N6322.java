package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N6322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            if (a == 0 && b == 0 && c == 0)
                break;
            System.out.println("Triangle #" + i);
            i++;
            if (a == -1) {
                if (c <= b)
                    System.out.println("Impossible.");
                else {
                    a = Math.sqrt((c * c) - (b * b));
                    System.out.printf("a = %.3f\n", a);
                }
            } else if (b == -1) {
                if (c <= a)
                    System.out.println("Impossible.");
                else {
                    b = Math.sqrt((c * c) - (a * a));
                    System.out.printf("b = %.3f\n", b);
                }
            } else {
                c = Math.sqrt((a * a) + (b * b));
                System.out.printf("c = %.3f\n", c);
            }
            System.out.println();
        }

    }
}
