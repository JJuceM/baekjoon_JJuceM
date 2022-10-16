package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1371 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    arr[str.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max == arr[i])
                System.out.print((char) (i + 'a'));
        }
    }
}
