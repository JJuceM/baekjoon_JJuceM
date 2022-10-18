package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long temp = 0;
        if(N<M){
            temp =N;
            N = M;
            M = temp;
        }
        System.out.println(N-M);

    }
}
