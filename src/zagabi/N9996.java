package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        String[] patterns = pattern.split("\\*");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            if (tmp.length() < pattern.length() - 1) {
                sb.append("NE\n");
                continue;
            }
            if (tmp.substring(0, patterns[0].length()).equals(patterns[0]) &&
                    tmp.substring(tmp.length() - patterns[1].length()).equals(patterns[1])) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }
        System.out.println(sb);
    }
}
