package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] str = new String[T];

        for (int i = 0; i < T; i++) {
            str[i] = br.readLine();
        }
        int mind = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length; i++) {
            String line = str[i];
            String reverseLine = str[str.length - 1 - i];
            for (int j = 0; j < line.length(); j++) {
                if (mind == 1) {
                    System.out.print(line.charAt(j));
                } else if (mind == 2) {
                    System.out.print(line.charAt(line.length() - 1 - j));
                } else if (mind == 3) {
                    System.out.print(reverseLine.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
