package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10987 {
    public static void main(String[] args) throws IOException {
        char [] ch = {'a','e','i','o','u'};
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<ch.length;j++){
                if(str.charAt(i)==ch[j])
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
