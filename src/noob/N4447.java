package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int g = 0, b = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'g' || str.charAt(j) == 'G')
                    g++;
                else if (str.charAt(j) == 'b' || str.charAt(j) == 'B')
                    b++;
            }
            if (g < b)
                System.out.println(str + " is A BADDY");
            else if (g > b)
                System.out.println(str + " is GOOD");
            else
                System.out.println(str + " is NEUTRAL");
        }
    }
}
