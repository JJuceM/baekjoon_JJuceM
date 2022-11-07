package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N23348 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());

                sum += A * Integer.parseInt(st.nextToken())
                        + B * Integer.parseInt(st.nextToken())
                        + C * Integer.parseInt(st.nextToken());
            }
            if (max <= sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
