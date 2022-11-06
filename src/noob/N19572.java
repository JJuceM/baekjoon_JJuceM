package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N19572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int x = Integer.parseInt(st.nextToken());
        final int y = Integer.parseInt(st.nextToken());
        final int z = Integer.parseInt(st.nextToken());
        double a = (x + y - z) / 2.0;
        double b = (x - y + z) / 2.0;
        double c = (-x + y + z) / 2.0;
        StringBuilder sb = new StringBuilder();
        if (a <= 0 || b <= 0 || c <= 0) {
            sb.append(-1);
        }
        if(sb.length() == 0){
            sb.append(1).append("\n")
                    .append(a).append(" ")
                    .append(b).append(" ")
                    .append(c);
        }
        System.out.print(sb);
    }
}
