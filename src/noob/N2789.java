package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cam = "CAMBRIDGE";
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            boolean visit = false;
            for (int j = 0; j < cam.length(); j++) {
                if (str.charAt(i) == cam.charAt(j)) {
                    visit = true;
                    break;
                }
            }
            if (visit != true)
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
