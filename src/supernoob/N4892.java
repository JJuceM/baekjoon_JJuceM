package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0)
                break;

            if ((3 * N) % 2 == 0) {
                N = 3 * N / 2 * 3 / 9;
                System.out.println(i + ". even " + N);
            } else {
                N = ((3 * N + 1) / 2 * 3 / 9);
                System.out.println(i + ". odd " + N);
            }

            i++;
        }

    }
}
