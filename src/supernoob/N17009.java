package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 0, B = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 3; j > 0; j--) {
                int N = Integer.parseInt(br.readLine());
                if (i == 0)
                    A += N * j;
                else
                    B += N * j;
            }
        }
        if (A > B)
            System.out.println("A");
        else if (A < B)
            System.out.println("B");
        else
            System.out.println("T");
    }
}
