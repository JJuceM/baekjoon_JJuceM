package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a == 60 && b == 60 && c == 60)
            System.out.println("Equilateral");
        else if (a + b + c == 180) {
            if (a == b && a != c)
                System.out.println("Isosceles");
            else if (a == c && a != b)
                System.out.println("Isosceles");
            else if (b == c && a != b)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
        else
            System.out.println("Error");
    }
}
