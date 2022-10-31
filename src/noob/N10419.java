package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int j = 0; j < N; j ++){
                if(j*j+j<=N)
                    sum=j;
            }
            System.out.println(sum);
        }
    }
}
