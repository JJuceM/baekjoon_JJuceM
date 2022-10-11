package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        long N = Long.parseLong(br.readLine());
        while(N!=1){
            if(N%2 == 0){
                N /=2;
                cnt++;
            }
            else{
                N++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
