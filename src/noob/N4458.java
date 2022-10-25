package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            sb.append(String.valueOf(str.charAt(0)).toUpperCase());
            sb.append(str.substring(1,str.length()));
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
