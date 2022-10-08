package supernoob;

import java.io.*;

public class N15372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Long N = Long.parseLong(br.readLine());
            sb.append(N * N).append("\n");
        }
        System.out.println(sb.toString());
    }
}
