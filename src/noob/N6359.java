package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N + 1];
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k * j <= N; k++) {
                    if (arr[j * k] != 0)
                        arr[j * k] = 0;
                    else
                        arr[j * k] = 1;
                }
            }
            int sum = 0;
            for (int j = 1; j <= N; j++)
                sum += arr[j];
            System.out.println(sum);

        }
    }
}
