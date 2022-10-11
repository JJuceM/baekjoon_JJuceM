package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N18398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            for (int j = 0; j < C; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                long A = Long.parseLong(st.nextToken());
                long B = Long.parseLong(st.nextToken());
                System.out.println((A + B) + " " + (A * B));
            }
        }
    }
}
