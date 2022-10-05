package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int N = Integer.parseInt(br.readLine());
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
