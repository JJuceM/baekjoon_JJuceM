package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                sb.append((char)(str.charAt(i)-32));
            else
                sb.append((char)(str.charAt(i)+32));
        }
        System.out.println(sb);
    }
}
