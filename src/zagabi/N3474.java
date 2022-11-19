package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N3474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            long sum=0;
            int N = Integer.parseInt(br.readLine());
            System.out.println(TSP(N));
        }
    }
    public static long TSP(int N){
        long result = 0;
        for(int i=5;i<=N;i*=5)
            result+=N/i;
        return result;
    }
}
