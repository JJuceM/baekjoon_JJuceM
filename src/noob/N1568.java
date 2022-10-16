package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = 1;
        int cnt = 0;
        while(N>0){
            N -= K;
            cnt++;
            if(K<N)
                K++;
            else
                K=1;
        }
        System.out.println(cnt);
    }
}
