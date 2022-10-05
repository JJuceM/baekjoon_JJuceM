package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long temp = 0;
        int cnt = 0;
        if (A > B) {
            temp = B;
            B = A;
            A = temp;
        }
        if (B - A <= 100000) {
            for (long i = A + 1; i < B; i++) {
                cnt++;
            }
            System.out.println(cnt);
            for (long i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
