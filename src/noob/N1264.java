package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = {'a','e','i','o','u','A','E','I','O','U'};
        while (true){
            String str = br.readLine();
            int cnt = 0;
            if(str.equals("#"))
                break;
            for(int i=0;i<str.length();i++){
                for(int j=0;j<arr.length;j++){
                    if(str.charAt(i)==arr[j])
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
